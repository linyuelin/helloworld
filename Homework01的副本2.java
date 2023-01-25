package com.dreamTank.oopHomework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("james", 38, "打篮球");
        persons[1] = new Person("pual", 36, "打篮球");
        persons[2] = new Person("kobe", 20, "打篮球");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);

        }
         Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge()  < persons[j + 1].getAge()) {
                    temp= persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] =temp;


                }


            }


        }

        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);

        }

    }
}
    /*
    定义一个Person类 {name, age, job}, 初始化Person 对象数组，有3个person对象，
    并按照 age 从 大到 小进行排序, 提示，使用冒泡排序
     */

class Person{
    private String name;
    private int    age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

