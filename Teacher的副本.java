package com.dreamTank.oopHomework;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double sal;
    private  double grade;

    public Teacher(String name, int age, String post, double sal, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.sal = sal;
        this.grade = grade;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String introduce(){
        return "姓名" + name + " 年龄" + age + " 职称" + post + " 基本工资" + sal + "级别" + grade;
    }


}
