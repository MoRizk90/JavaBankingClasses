package com.fox;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Branch alexBranh = new Branch("AlexBranch");
        for (int i = 0; i < 12; i++){
            alexBranh.addCustomer("fox" + i, 12.40d + i*2 );
        }
        alexBranh.printCustomerList();
        boolean b = alexBranh.findCustomer("fox4");
        System.out.println (b + "");
        alexBranh.theTargetedCustomer ( "fox4" );



    }
}
