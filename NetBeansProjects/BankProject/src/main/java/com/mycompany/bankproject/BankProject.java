/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class BankProject {

    public static void main(String[] args) {
        
        String choice;
        
        Random rand = new Random();
        int rand_int;
        int low = 1000;
        int high = 9000;
        int result;
        
        Scanner sc = new Scanner(System.in);
        //empty employee list
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        //create a bank with empty employee list
        Bank bank = new Bank(1, "Iryna World Bank", "888-555-7777", employees, customers);
        
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = dateFormatter.format(date);
        System.out.println("Current date: "+strDate);
        choice = "";
        do{
            menu();
            choice = sc.next().toUpperCase();  
            
            switch (choice){
                case "1":  
                    System.out.println("== Add employee==");                    
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter title");
                    String title = sc.next();
                    System.out.println("Enter email");
                    String email = sc.next();
                    System.out.println("Enter Employee type:: f->for fulltime or c-> for Contractor");
                    String type = sc.next();
                    
                    Employee emp1 = null;
                    if (type.equalsIgnoreCase("f")) {
                        //create employee instance with data
                        System.out.println("Enter salary");
                        float salary = sc.nextFloat();
                        emp1 = new FullTiimeEmployee(salary, id, name,title, email);
                    } else {
                        System.out.println("Enter hourly rate");
                        float hourlyrate = sc.nextFloat();
                        emp1 = new ContractorEmployee(hourlyrate, id, name, title, email);
                    }
                    
                    //add employee in a bank
                    bank.getEmployees().add(emp1);
                    System.out.println(bank);

                     
                    break;
                case "2":
                    System.out.println("== Search employee by id == ");
                    System.out.println("Enter employee id ");
                    int eid = sc.nextInt();
                    boolean found = false;
                    for (Employee e : bank.getEmployees()) {
                        if (e.getId() == eid) {
                            System.out.println("Employee was found! " + e);
                            found = true;
                                    
                            break;
                        }
                    }
                     if (found == false) {
                        System.out.println("For this id - Employee does not exit");
                    }
                     
                    break;
                case "3":
                    ArrayList<Account> accounts = new ArrayList<Account>();
                    System.out.println("== Add Customer and Account ==");                    
                    System.out.println("Enter customer id: ");
                    int cid = sc.nextInt();
                    System.out.println("Enter customer name: ");
                    String cname = sc.next();
                    System.out.println("Enter customer emeil: ");
                    String cemail = sc.next();
                    System.out.println("Enter Customer type:: i->for Individual or b-> for Business");
                    String ctype = sc.next();
                    rand_int = rand.nextInt(1000);
                    int acct_num = rand.nextInt(high-low) + low;
                    
                    System.out.println("Inter your start ballance $: ");
                    double blnc = sc.nextDouble();
                    
                    //CHECKING, SAVING, FIXED_DEPOSIT
                    System.out.println("Enter Accont Type you would like to open:: c-->for CHECKING, s-->SAVING, f-->for FIXED_DEPOSIT");
                    String tmpAcctType = sc.next();
                    Customer cust = null;
                    Account acct = null;                    
                    //acct = new Account(acct_num,cid, blnc,returnAcctType(tmpAcctType));                   
                    if (ctype.equalsIgnoreCase("i")) {
                        //create customer instance with data
                        System.out.println("log === i");
                        
                        cust = new Customer(cid, cname, cemail, CustomerType.INDIVIDUAL, accounts); 
                        acct = new Account(acct_num,cid, blnc,returnAcctType(tmpAcctType));  
                      
                        System.out.println("log === " + cust);
                        
                    } else {
                        System.out.println("log === b");
                        cust = new Customer(cid, cname, cemail, CustomerType.BUSINESS,  accounts);   
                        acct = new Account(acct_num,cid, blnc,returnAcctType(tmpAcctType));
                        //cust.getAcct().add(acct);
                    } 
                    
                    cust.getAcct().add(acct);
                                        
                    bank.getCustomers().add(cust);
                    System.out.println(bank);
                    
                    
                    //bank.getCustomers().add(cust);
                    //cust.getAcct().add(acct);              
                

                    
                case "S":  
                    String mypath = "C:\\ITExportsSchool\\JavaSelenium\\BankData.txt";
                    System.out.println("===Save Data to text File (" + mypath+ ")===");
                    
                    try{
                        //FileWriter fw = new FileWriter(mypath, true);
                        //System.out.println("log 1");
                        FileWriter fw = new FileWriter(mypath);
                        //System.out.println("log 2");
                        BufferedWriter bw = new BufferedWriter(fw);
                        //System.out.println("log 3");
                        bw.write ("=========== Bank " + strDate + " ============\n");
                        bw.write(bank.getId() + "|" + bank.getName() + "|" + bank.getPhone() + "\n");
                        bw.write("========Employees========\n");
                        for (Employee e : bank.getEmployees()){
                            bw.write(e.getId()+ "|" + e.getName() + "|" + e.getTitle() + "|" + "\n");
                            //e.toString()
                            if (e instanceof  FullTiimeEmployee){
                                bw.write(((FullTiimeEmployee) e).getSalary() + "\n");
                            }else {
                                bw.write(((ContractorEmployee) e).getHourlyRate() + "\n");
                            }
                        }                        
                        //TODO For Customer                        
                        bw.write("========Customers========\n");
                        //for each customer from bank
                        for (Customer c : bank.getCustomers()){
                            bw.write(c.getId() + "|" + c.getName() + "|" + c.getEmail() + "|" + c.getCustType() + "\n");   
                            bw.write("-----Customer Accounts----\n"  );
                            //Each Customer has account
                            for(Account a : c.getAcct()){
                                bw.write(a.getCust_id() + "|" + a.getAcctNum() + "|" + a.getAcctType() + "|" + a.getBalance()+ "\n");
                            }
                        }
                        
                        
                        
                        bw.close();
                        fw.close();
                      
                    }catch(Exception e){
                        System.out.println("Error when save to File Employee info. Error msg: "+ e.getMessage());
                    }
                    
                    
                    
                    break;
                case "4":
                    System.out.println("=======Search Customers by ID==========");
                    System.out.println("Enter employee id ");
                    int custid = sc.nextInt();
                    boolean found1 = false;
                    
                    for (Customer c : bank.getCustomers()) {
                        if (c.getId() == custid) {
                            System.out.println("Customer was found! " + c);
                            found1 = true;
                                    
                            break;
                        }
                    }
                     if (found1 == false) {
                        System.out.println("For this id - Customer does not exit");
                    }
                    
                    
                    break;
                case "5":
                    System.out.println("your coice 5");
                    
                    break;
                case "6":
                    System.out.println("your coice 6");                    
                    
                    break;
                case "Q":    
                    break;
                    
            }
           //!"success".equals(statusCheck) 
        }while (!choice.equals("Q") );
        
    }
    
    
    public static AccountType returnAcctType(String mytype){
        //CHECKING, SAVING, FIXED_DEPOSIT
        
        switch (mytype.toLowerCase()){
            case "c":
                return AccountType.CHECKING;
            case "s":
                return AccountType.SAVING;
            case "f":
                return AccountType.FIXED_DEPOSIT;
                
        }
        
        return AccountType.CHECKING;
    }
    
    public static void menu() {
        System.out.println("1 for Add Employee");
        System.out.println("2 for Search Employee");
        
        
        System.out.println("3 for Add Customer");
        System.out.println("4 for Search Customer");
        
        System.out.println("S for Save Data to text File");

        System.out.println("Q for Quit");
        System.out.println("Enter your choice  ");
    }
}
