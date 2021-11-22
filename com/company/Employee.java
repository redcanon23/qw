package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Employee extends Person {
    int Salary;
    LinkedList<String>List_of_customers = new LinkedList<String>();
    ArrayList<String>List_of_employees = new ArrayList<String>();
    int Manager_id;
    String Position;
}
