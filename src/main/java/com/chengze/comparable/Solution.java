package com.chengze.comparable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


public class Solution {


    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary()- e2.getSalary());
        }
    };

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };


    public  static void main(String[] args){
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "chengze", 25, 130000);
        empArr[1] = new Employee(20, "jinyao", 24, 120000);
        empArr[2] = new Employee(30, "laogu", 24, 110000);
        empArr[3] = new Employee(40, "laoxu", 24, 120000);

        Arrays.sort(empArr);
        System.out.println("Default Sorting: \n" + Arrays.toString(empArr));
    }


}
