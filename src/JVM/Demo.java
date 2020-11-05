package JVM;

/**
 * @author aviccii 2020/10/29
 * @Discrimination
 */
public class Demo {
    public static void main(String[] args) {
        new Thread(()->{

        },"my thread name").start();
    }

    //native:凡是带了native关键字的，说明java的作用范围达不到了，回去调用底层C语言的库
    //会进入本地方法栈
    //调用本地方法接口 JNI
    //JNI作用:扩展java的使用，融合不同的编程语言为java所用
    //java诞生的时候 C和C++盛行 所以必须调用他们
    //它在内存区域中专门开辟了一块标记区域：native Method Stack，登记native方法
    //在最终执行的时候，加载本地方法库中的方法通过JNI

    //java程序驱动打印机，管理系统
    private native void start0();

    //调用其他接口：  Socket,WebService,Http
}
