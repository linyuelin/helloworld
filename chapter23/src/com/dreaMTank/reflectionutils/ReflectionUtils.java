package com.dreaMTank.reflectionutils;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 林
 * @versoin 1.0
 * 演示通过反射获得类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> personClass = Class.forName("com.dreaMTank.reflectionutils.Person");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+declaredField.getModifiers()+declaredField.getType());

        }

        //获取本类所有方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+declaredMethod.getReturnType());
        }


    }
@Test
    public void api_01() throws ClassNotFoundException {
    Class<?> personClass = Class.forName("com.dreaMTank.reflectionutils.Person");
   //获取类名
    System.out.println(personClass.getName());
   //获取简单类名
    System.out.println(personClass.getSimpleName());
   //获取本类及父类的所以public 属性
    Field[] fields = personClass.getFields();
    for (Field field : fields) {
        System.out.println(field.getName());
    }
    //获取本类所有属性
    Field[] declaredFields = personClass.getDeclaredFields();
    for (Field declaredField : declaredFields) {
        System.out.println(declaredField.getName());
    }
    //获取本类及父类所以public方法
    Method[] methods = personClass.getMethods();
    for (Method method : methods) {
        System.out.println(method.getName());
    }

    //获取本类所有方法
    Method[] declaredMethods = personClass.getDeclaredMethods();
    for (Method declaredMethod : declaredMethods) {
        System.out.println(declaredMethod.getName());
    }

    //获取本类及父类public构造器
    Constructor<?>[] constructors = personClass.getConstructors();
    for (Constructor<?> constructor : constructors) {
        System.out.println(constructor.getName());
    }
    //获取本类所有构造器
    Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
    for (Constructor<?> declaredConstructor : declaredConstructors) {
        System.out.println(declaredConstructor.getName());
    }
    //返回包名
    System.out.println(personClass.getPackage());

    //返回父类信息
    System.out.println(personClass.getSuperclass());

    //返回接口
    Class<?>[] interfaces = personClass.getInterfaces();
    for (Class<?> anInterface : interfaces) {
        System.out.println(anInterface);
    }
}


}

class A{
    public String hobby;
    public A(){}
    public void hi(){

    }

}
interface IA{}
interface IB{}

class  Person extends A implements IA,IB{
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person(){}
    public Person(String name){}

    private Person(String name,int age){}

    public void m1(){

    }

    protected void m2(){}

    void m3(){}

    private void m4(){}



}
