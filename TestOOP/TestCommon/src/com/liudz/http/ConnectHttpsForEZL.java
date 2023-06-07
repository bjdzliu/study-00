package com.liudz.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

//import org.apache.log4j.Logger;

public class ConnectHttpsForEZL {

    public static void main(String[] args) throws Exception {

        String url = "https://www.baidu.com/";
//        if (args[0] == null) {
//            url = args[0];
//        }

        String response = invokeUrlByGet(url);
        System.out.println("response=" + response);

    }

    public static HttpURLConnection getConnectionHttpOrHttps(String url) throws Exception {
        System.out.println("conn using url=" + url);
        String protocol = "http";
        if (url.toUpperCase().startsWith("https")) {
            protocol = "https";
        }

        if (protocol.equalsIgnoreCase("http")) {
            return getConnectionHttp(url);
        } else {
            return getConnectionHttps(url);
        }
    }

    public static HttpURLConnection getConnectionHttp(String urlhttp) throws IOException {
        URL url = new URL(urlhttp);
        java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
        return conn;
    }

    public static HttpURLConnection getConnectionHttps(String urlHttps) throws Exception {
        TrustManager[] certs = new TrustManager[]{new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }

        }};
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, certs, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        HostnameVerifier hosts = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(hosts);
        URL url = new URL(urlHttps);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        return connection;
    }

    public static String invokeUrlByGet(String url) throws Exception {
        String response = "";
        try {
            java.net.HttpURLConnection conn = getConnectionHttpOrHttps(url);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/xml");
            conn.setDoOutput(true);
            java.io.InputStream in = conn.getInputStream();
            java.io.Reader reader = new java.io.InputStreamReader(in);
            java.io.StringWriter sw = new java.io.StringWriter();
            int bread = 0;
            while ((bread = reader.read()) != -1) {
                char ch = (char) bread;
                response = response + ch;
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
}