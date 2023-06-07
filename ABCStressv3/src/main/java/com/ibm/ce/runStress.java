package com.ibm.ce;

public class runStress {
    static int num;

    public static void main(String[] args) {

        Thread th = Thread.currentThread();

        for(String argint : args){
            System.out.println("迭代次数" + argint);
            num = Integer.valueOf(argint);
        }
        calcClass instance = new calcClass();
        sysLoad loadinstance = new sysLoad();

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
           double cpuusage = loadinstance.calcload();
            if (cpuusage< 0.3) {
                System.out.println("启动");
                while (cpuusage< 0.3) {

                    System.out.println("当前cpu利用率： "+cpuusage);
                    System.out.println("低于30%，创建Thread");
                    new Thread(){
                        public void run(){
                            System.out.println("Thread Start Running");
                            int i = 0;
                            while(i<1000){
                                double result =  instance.calcPi(num);
                                //System.out.println("计算pi的结果"+result);
                                i++;
                            }

                        }
                    }.start();
                    cpuusage = loadinstance.calcload();
                }
            }else if(cpuusage> 0.7) {
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
