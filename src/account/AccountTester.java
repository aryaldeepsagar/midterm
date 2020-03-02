/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 * date: March 2nd
 * @author deepsagararyal
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 500 accounts can be created
        for the given bank*/
        Account ac[]=new Account[500];
        int i =0;
        while(i==0)
        {
        System.out.println("Please enter the amount by which you want to open an account:");
        
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextDouble();
        
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user=sc.nextLine();
        if(bal <= 50)
        {
            System.out.println("Balanced should be greater than 50 !!");
            i = 1;
        }   
        
        if(bal>50)
        {
        Account a=new Account(bal,user);
        ac[0]=a;
        int months;
       System.out.println("Calculate balance for how many months ?");
       months = sc.nextInt();
        System.out.println("Account created succesfully");
        System.out.println("The balance is: "+ a.balance_cal(months));  
        System.out.println("The InterestRate per month is "+a.getInterestRate());
        }
        System.out.println("Do you want to exit ?<0-continue / 1-exit>");
        i = sc.nextInt();
      
        }
    }
}
