package com.dreaMTank.reflectionutils;

/**
 * @author 林
 * @versoin 1.0
 * 通过反射机制创造对象实例
 */
public class ReflecCreateInstance {
    public static void main(String[] args) {
        //1,获得class对象
        Class<?> aClass = Class.forName("com.dreaMTank.reflectionutils.ReflecCreateInstance");

    }

}

class User {
    private String name;
    private int age;


    public User() {

    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
