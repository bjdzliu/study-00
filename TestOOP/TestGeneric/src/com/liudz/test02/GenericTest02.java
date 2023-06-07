package com.liudz.test02;

public class GenericTest02<E> {
    int age;
    String stra;
    E ename;

    public void a(E evar) {
    }

    public void b(E[] earray) {

    }

}



class Test {
    public static void main(String[] args) {
        //(1)实例化的时候不指定泛型：如果实例化的时候不明确的指定类的泛型，那么认为此泛型为Object类型
        GenericTest02 gt1 = new GenericTest02();
        gt1.ename = 4312;
        gt1.a(1);
        gt1.a("ceshi");
        gt1.b(new String[]{"a", "b", "c"});


        //(2)实例化的时候指定泛型--推荐
        GenericTest02<String> gt2 = new GenericTest02<>();
        gt2.age = 1;
        gt2.ename = "name01";

        gt2.a("aaaa");
        gt2.b(new String[]{"1"});



    }

}

//(3)继承实验
class subGeneric1 extends GenericTest02 {

}

class Demo{
    public static void main(String[] args) {

        //子类定义时没指定<E>
        subGeneric1 sub1 = new subGeneric1();
        sub1.a("a");
        sub1.a(1);

    }
}

//父类是E，子类也必须定义上
class subGeneric2<E> extends GenericTest02<E> {

}

class Demo02{
    public static void main(String[] args) {
        //子类定义时指定<E>
        //创建对象时，可以定义范型的引用类型
        subGeneric2<String> sub2 = new subGeneric2<>();
        sub2.a("a");
        sub2.a("s");

    }
}


class subGeneric3 extends GenericTest02<Integer> {
}

class Demo3{
    public static void main(String[] args) {
        subGeneric3 sub3 = new subGeneric3();
        sub3.a(1);
        sub3.a(2);
        sub3.a(4);

    }
}
