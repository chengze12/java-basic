package com.chengze;

public class Bike {
    public int wheelNum;
    public String seatShape;

    public Bike(){
        wheelNum=1;
    }
    public Bike(int wn){
        this.wheelNum= wn;
    }
    public void move(){

    }
    public String toString(){
        return String.valueOf(this.wheelNum);
    }

    public static void main(String[] args){
        Bike b= new Bike();
        Bike b1= new Bike(  2);
        System.out.println(b);
        System.out.println(b1);
        System.out.println("I am awesome!");
    }
}


