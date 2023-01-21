package com.dreamTank.poly_.polyparameter_;

public class ployParameter {
    public static void main(String[] args) {

        Worker tom = new Worker("tom", 5000);
        Manager james = new Manager("james", 1000, 9000);
        ployParameter ployParameter = new ployParameter();
        ployParameter.showEmpAnnul(tom);
        ployParameter.showEmpAnnul(james);

        ployParameter.testWork(tom);
        ployParameter.testWork(james);
    }
        public void showEmpAnnul (Employee e){
            System.out.println(e.getAnnual());
        }

        public void testWork(Employee e){
          if(e instanceof Worker){
              Worker worker=(Worker) e;
              worker.work();
             // ((Worker) e).work();
          }else if(e instanceof Manager){
              Manager manager = (Manager) e;
              manager.manager();
            }else {
              System.out.println(" ");
          }
        }
    }
