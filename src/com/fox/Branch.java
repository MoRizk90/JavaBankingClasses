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

    public void addTransaction(String customerName, double transactionAmount){
        Customer thewantedCst = theTargetedCustomer ( customerName );
        if(thewantedCst != null){
            
        }
    }

    public boolean findCustomer(String targetedCustomer){
        for (int i = 0; i < customerList.size(); i++){
            String theCustomer = customerList.get(i).getName().toLowerCase();
            if (theCustomer.toLowerCase().equals ( targetedCustomer.toLowerCase())) {
                System.out.println("the customer was found");
                return true;

            }


        }


        return false;

    }

    public Customer theTargetedCustomer(String CustomerName){
        if(findCustomer ( CustomerName )){
            for (int i = 0; i < customerList.size(); i++){
                String theCustomer = customerList.get(i).getName().toLowerCase();
                if (theCustomer.toLowerCase().equals ( CustomerName.toLowerCase())) {
                    System.out.println ("the transaction was added");
                    return customerList.get ( i );

                }
                else {
                    System.out.println ("Customer was not found!!!");
                }
        }
        return null;

    }


    public void printCustomerList(){
        for (int i = 0; i < customerList.size();i++){
            System.out.println("the customer name is: " + customerList.get(i).getName() + " and he has " + customerList.get(i).transactionCount());
        }
    }
}
