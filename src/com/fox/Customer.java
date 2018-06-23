package com.fox;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initAmount) {
        this.name = name;
        this.transactions.add(initAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getTransactions() {
        double tranAmount;
        for (int tranIndex = 0; tranIndex < transactions.size(); tranIndex++){
            tranAmount = transactions.get(tranIndex).doubleValue();
            System.out.println("Transaction [" + tranIndex + "] : " + tranAmount);

        }
    }

    public int transactionCount(){
        return transactions.size();
    }

    public void addTransaction(double amount){
        transactions.add(amount);
        System.out.println("Transaction completed successfully : " + amount + " are added successfully" );

    }


}
