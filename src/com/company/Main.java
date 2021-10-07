
package com.company;
    public class Main {
        int  steps;
        String name;
        public  void m1(){
            System.out.println("He walk" +  steps);
            System.out.println("his name is" + name);
        }
    }
    class Mainmain {
        public static void main(String[] args) {
            com.company.Main obj = new com.company.Main();
            obj.name="anurag";
            obj.steps=45;
            obj.m1();
            com.company.Main obj2= new com.company.Main();
            obj2.steps=67;
            obj2.name="rajesh";
            obj2.m1();
	
    }
}
