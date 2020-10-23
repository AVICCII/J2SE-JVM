package Annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * 什么是注解
 *
 * @author aviccii 2020/10/23
 * @Discrimination
 */
public class Test01 extends Object{

    //@Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    //警告镇压，取消代码的警告
    @SuppressWarnings("all")
    public void Test02(){
        List list = new ArrayList();
    }
}
