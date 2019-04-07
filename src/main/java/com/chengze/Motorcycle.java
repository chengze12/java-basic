package com.chengze;

public class Motorcycle extends Bike{

        public String gasTank;
        public String motor;

        public int pedalNum;
        public Motorcycle(int pn){
            this.pedalNum = pn;
        }
//        public Motorcycle(){
//            pedalNum=3;
//        }
        public String toString(){
        return String.valueOf(this.pedalNum);
    }

//        public Motorcycle(){
//            gasTank= "97号";
//        }
//        public Motorcycle(){
//            motor = "发动机";
//        }
        public static void main(String[] args){
            Bike b= new Bike();
            Bike b1= new Bike(  2);
            System.out.println(b);
            System.out.println(b1);

//            Motorcycle Moto= new Motorcycle();
            Motorcycle Moto1= new Motorcycle(2);
//            System.out.println(Moto);
            System.out.println(Moto1);
            System.out.println("I am awesome!");
        }
}
