package com.ibm.ce;
import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

public class runStress {
    static int num;

    public static void main(String[] args) {
        OperatingSystemMXBean bean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        Thread th = Thread.currentThread();

        for(String argint : args){
            System.out.println("迭代次数" + argint);
            num = Integer.valueOf(argint);
        }
        calcClass instance = new calcClass();

        while (true) {
            long nowSys = System.currentTimeMillis();

            //cpu在10%和30%之间时，输出cpu利用率
//            while((System.currentTimeMillis()-nowSys)<=8 && bean.getSystemCpuLoad()>0.1&& bean.getSystemCpuLoad()<0.3){
//                System.out.println("休息");
//                System.out.println(bean.getSystemCpuLoad());
//            }
            //System.out.println(bean.getProcessCpuLoad());

            //判断当前cpu的使用率是否低于40，如果低于40，则启动线程
            //System.out.println("当前cpu利用率： "+bean.getSystemCpuLoad()*100);
            if (bean.getSystemCpuLoad() < 0.3) {
                System.out.println("启动");
                while (bean.getSystemCpuLoad() < 0.3) {
                    double cpuLoad = bean.getSystemCpuLoad()*100;
                    System.out.println("当前cpu利用率： ");
                    System.out.println(cpuLoad);
                    System.out.println("创建Thread");
                    new Thread(){
                        public void run(){
                            System.out.println("Thread Start Running");
                            int i = 0;
                            while(i<3){
                                double result =  instance.calcPi(num);
                                System.out.println("计算pi的结果"+result);
                                i++;
                            }

                        }
                    }.start();
                }
            }else if(bean.getSystemCpuLoad() > 0.7) {
                //判断当前cpu的使用率是否高于70，如果高于70，则释放资源
                try {
                    System.out.println("in sleeping");
                    th.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
