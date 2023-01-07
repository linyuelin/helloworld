package com.dreamTank.encap;

public class Encapsulation01 {
    public static void main(String[] args) {

        person person = new person();
        person.name= "jack";
        person.setAge(69);
        person.setSal(50000.0);
        System.out.println(person.info());
        System.out.println(person.getSal() );




    }
}
/*
题目：程序，不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，
否则给默认值，必须在1～120，工资不能直接查看，name的长度在2～6字符之间。
 */
class person{
    public String name;
    private int age;
    private  double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("请输入2～6字符的名字，否则默认名字");
                    this.name= "james";

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("请输入1～120之间的年龄，否则默认年龄");
            this.age = 18;
        }
    }
    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String info(){
        return "信息为"+ " " +"姓名"+ name +" " + "年龄" + age + " " +"薪水"+ sal;
    }

}
