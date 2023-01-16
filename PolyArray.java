package com.dreamTank.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 30);
        persons[1] = new Student("rose", 23, 90);
        persons[2] = new Student("tom",    21, 97);
        persons[3] = new Teacher("king", 37, 20000);
        persons[4] = new Teacher("timi", 69, 300000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student){
                Student student = (Student)persons[i];
                student.study();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            }else if(persons[i] instanceof Person){

            }else{
                System.out.println("输入有误，请重新输入");
            }
        }

    }
}
