package Reflection;

/**
 * @author aviccii 2020/10/26
 * @Discrimination  测试类什么时候会初始化
 */
public class Test06 {
    static{
        System.out.println("main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
//        Son son = new Son();

        //反射也会产生主动引用
        //Class.forName("Reflection.Son");

        //不会产生类的引用的方法
//        System.out.println(Son.b);

//        Son[] array = new Son[5];

        System.out.println(Son.M);
    }
}

class Father{

    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
    }

    static int m = 100;
    static final int M = 1;
}