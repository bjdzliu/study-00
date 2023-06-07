package com.liudz2;

public class Girl {
    //类之间的关系：当参数；当属性。
  //引用数据类型，将类Mom，当作Girl的属性
    Mom m;

    public void talk(){
        m.say();
    }


}
