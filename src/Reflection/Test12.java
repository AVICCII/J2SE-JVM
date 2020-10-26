package Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author aviccii 2020/10/26
 * @Discrimination 联系反射操作注解
 */
public class Test12 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.Student2");
        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value的值。
        TableCC tableCC = (TableCC)c1.getAnnotation(TableCC.class);
        String value = tableCC.value();
        System.out.println(value);

        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        FieldCc annotation = f.getAnnotation(FieldCc.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }


}

@TableCC("db_cc")
class Student2{
    @FieldCc(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldCc(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldCc(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2() {
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableCC{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldCc{
    String columnName();
    String type();
    int length();
}