package com.company;

public class BankAccount {


    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;




    public BankAccount (){
        this(29926,0.00,"Default name","default email","default phoneNumber");
        System.out.println("Empty constructor called.");

        /*
        when we will call BankAccount(), it will be called first but after running the first line, it will call the second constructor
        and print the print statement(Account constructor called).
         */

    }
    public BankAccount(int number, double balance, String customerName, String email, String phoneNumber){

        System.out.println("Account constructor called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Account balance = " + balance);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void depositFund(double deposit){
        System.out.println("Enter the amount you want to deposit: " + deposit);

        balance += deposit;
        System.out.println("Account balance after deposit = " + balance);
    }
    public void withdrawFunds(double withdraw) {
        System.out.println("Enter the amount you want to withdraw: " + withdraw);
        if (withdraw > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= withdraw;
            System.out.println("Account balance after withdraw = " + balance);
        }
    }

}
