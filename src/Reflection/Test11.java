package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author aviccii 2020/10/26
 * @Discrimination 通过反射获取泛型
 */
public class Test11 {

    public void test01(Map<String,User> map, List<User> list){
        System.out.println("test01");
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test11.class.getMethod("test01", Map.class, List.class);

        Type[] genericExceptionTypes = method.getGenericParameterTypes();
        for (Type genericExceptionType : genericExceptionTypes) {
            System.out.println("#"+genericExceptionType);
            if (genericExceptionType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericExceptionType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
    }
}
