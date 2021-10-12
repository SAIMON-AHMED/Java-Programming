package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();//(29926,20000,"LAYELA AKTER",
            //    "saimonahmed24793@gmail.com","01777551278");

        System.out.println("Account number = " + account.getNumber());
        System.out.println("Account balance = " + account.getBalance());
        System.out.println("Account customer name = " + account.getCustomerName());
        System.out.println("Account related email = " + account.getEmail());
        System.out.println("Account related phone number = " + account.getPhoneNumber());

//        account.setNumber(29926);
//        account.setBalance(20000);
//        account.setCustomerName("LAYELA AKTER");
//        account.setEmail("saimonahmed24793@gmail.com");
//        account.setPhoneNumber("01777551278");



        account.depositFund(10000);
        account.withdrawFunds(5000);
        System.out.println("First constructor called.");
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        System.out.println("Second constructor called.");
        VipCustomer vipCustomer2= new VipCustomer("Saimon", 50000);
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());

        System.out.println("Third constructor called.");
        VipCustomer vipCustomer3 = new VipCustomer("Saimon", 50000, "saimonahmed24793@gmail.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmailAddress());


    }
}
