package Reflection;

/**
 * @author aviccii 2020/10/26
 * @Discrimination
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类的加载器的父类加载器--->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器--->根加载器
        ClassLoader parent1 =parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("Reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        //测试jdk内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);


        //如何获得系统类加载器可以加载的路径

        System.out.println(System.getProperty("java.class.path"));

        /**
         * 双亲委派机制
         * java.lang.String-->
         */

        /*
        D:\jdk8\jre\lib\charsets.jar;
        D:\jdk8\jre\lib\deploy.jar;
        D:\jdk8\jre\lib\ext\access-bridge-64.jar;
        D:\jdk8\jre\lib\ext\cldrdata.jar;
        D:\jdk8\jre\lib\ext\dnsns.jar;
        D:\jdk8\jre\lib\ext\jaccess.jar;
        D:\jdk8\jre\lib\ext\jfxrt.jar;
        D:\jdk8\jre\lib\ext\localedata.jar;
        D:\jdk8\jre\lib\ext\nashorn.jar;
        D:\jdk8\jre\lib\ext\sunec.jar;
        D:\jdk8\jre\lib\ext\sunjce_provider.jar;
        D:\jdk8\jre\lib\ext\sunmscapi.jar;
        D:\jdk8\jre\lib\ext\sunpkcs11.jar;
        D:\jdk8\jre\lib\ext\zipfs.jar;
        D:\jdk8\jre\lib\javaws.jar;
        D:\jdk8\jre\lib\jce.jar;
        D:\jdk8\jre\lib\jfr.jar;
        D:\jdk8\jre\lib\jfxswt.jar;
        D:\jdk8\jre\lib\jsse.jar;
        D:\jdk8\jre\lib\management-agent.jar;
        D:\jdk8\jre\lib\plugin.jar;
        D:\jdk8\jre\lib\resources.jar;
        D:\jdk8\jre\lib\rt.jar;
        D:\JAVAProject\J2SEandJVM\out\production\J2SEandJVM;
        D:\ideaU\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar
         */
    }
}
