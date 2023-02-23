package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee emp = new Employee("Mac");

        try {
            emp.goToWork();
        } catch (WorkException e) {
              e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause().getMessage());
        }


    }
}