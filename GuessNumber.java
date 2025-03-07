/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessnumber;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GuessNumber {

    public static void main(String[] args) {
                int userNum=0;
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        do
        {
            System.out.println("Enter your number: ");
            userNum=sc.nextInt();
            
            if(myNum==userNum)
            {
                System.out.println("You got it correct!!");
                break;
            
            }
            else if(userNum>myNum)
            {
                System.out.println("your number is too large.");
                
            }
            else
            {
                System.out.println("your number is too small.");
            }
        }
        
        while(userNum>=0);
        System.out.println("My number is "+myNum);
    }
}
