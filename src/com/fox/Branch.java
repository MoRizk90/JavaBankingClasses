package com.fox;

import java.util.ArrayList;

public class Branch {
    private String name;
    private Customer branchCst;
    private ArrayList<Customer> customerList= new ArrayList<Customer>();


    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(String name, double initAmount){
        customerList.add(new Customer(name, initAmount));
    }

    public boolean findCustomer(String targetedCustomer){
        for (int i = 0; i < customerList.size(); i++){
            String theCustomer = customerList.get(i).getName().toLowerCase();
            if (theCustomer.toLowerCase() == targetedCustomer.toLowerCase()) {
                System.out.println("the customer was found");
                return true;

            }

        }
        return false;

    }

    public void printCustomerList(){
        for (int i = 0; i < customerList.size();i++){
            System.out.println("the customer name is: " + customerList.get(i).getName() + " and he has " + customerList.get(i).transactionCount());
        }
    }
}
