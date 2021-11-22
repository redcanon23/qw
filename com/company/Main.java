package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer A = new Customer();
        A.ID = 12;
        A.Name = "Mark Zg";
        A.Age = 23;
        A.Address = "33 Ijdf Drive, Debrecen";
        A.Account_id = 99;
        A.Employee_id = 2378;

        Customer B = new Customer();
        B.ID = 15;
        B.Name = "Kevin Smith";
        B.Age = 54;
        B.Address = "33 Moon Drive, Debrecen";
        B.Account_id = 83;
        B.Employee_id = 5567;

        Customer C = new Customer();
        C.ID = 19;
        C.Name = "Jane Pointing";
        C.Age = 28;
        C.Address = "33 Kassai Lane, Debrecen";
        C.Account_id = 58;
        C.Employee_id = 2378;

        LinkedList<String> List_of_customers = new LinkedList<>();
        List_of_customers.add(new cust(A));
        List_of_customers.add(B);
        List_of_customers.add(C);

        Employee D = new Employee();
        D.ID = 2378;
        D.Name = "Bryan Axe";
        D.Age = 36;
        D.Address = "9237 Nagyerdei krt 22, Debrecen";
        D.Salary = 20000;
        D.List_of_customers = C;
        D.Position = "Employee";
        D.Manager_id = 9999;

        Employee E = new Employee();
        E.ID = 5567;
        E.Name = "Dina Canon";
        E.Age = 24;
        E.Address = "4277 Kassai utca 22, Debrecen";
        E.Salary = 25000;
        E.List_of_customers = Customer B;
        E.Position = "Employee";
        E.Manager_id = 9999;

        Employee F = new Employee();
        F.ID = 9999;
        F.Name = "Tinashe Gtx";
        F.Age = 56;
        F.Address = "73 Nagyerdei krt 32, Debrecen";
        F.Salary = 50000;
        F.List_of_employees =  ;
        F.Position = "Manager";

         cust{
            int ID;
            String Name;
            int Age;
            String Address;
            int Account_id;
            int Employee_id;

        }



    }
}
