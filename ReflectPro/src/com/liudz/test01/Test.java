package com.liudz.test01;

public class Test {
    public static void main(String[] args) {
        String str="微信";
        if("微信".equals(str)){
            //new WeChat().payOnline();
            pay(new WeChat());


        }

        if("支付宝".equals(str)){
            //new AliPay().payOnline();
            pay(new AliPay());

        }

        if("招商银行".equals(str)){
            //new BankCard().payOnline();

        }
    }

    private static void pay(Mtwm mt){
        mt.payOnline();

    }
}
