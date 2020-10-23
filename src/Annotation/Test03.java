package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author aviccii 2020/10/23
 * @Discrimination 自定义注解
 */
public class Test03 {
    //注解可以显示赋值，如果没有默认值，我们就必须给注解赋值
    @MyAnnotation2(schools = {"安徽大学，中国科大"})
    public void test(){}


    @MyAnnotation3("SB")
    public void test2(){}
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数： 参数类型+参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在

    String[] schools() default {"中科院"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}