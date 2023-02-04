/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask1;

import java.util.Scanner;

public class ProblemHW2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        
        int choose = input.nextInt();
        int num1,num2;
        System.out.print("enter first number: ");       
        num1 = input.nextInt();
        System.out.print("enter second number: ");
        num2 = input.nextInt();
        if(choose==1){
        System.out.println("The result is : "+(num1+num2));
        }
        if(choose==2){
        System.out.println("The result is : "+(num1-num2));
        }
        if(choose==3){
        System.out.println("The result is : "+(num1*num2));
        }
        if(choose==4){
        System.out.println("The result is : "+(num1/num2));
        }
        
        
    }
    
    
}
