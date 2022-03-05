package com.random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int guessnumber= (int)(Math.random()*100);
        int mynumber;
        int k=1;
    do{
        System.out.println("Guess My Number (1-100)");
        System.out.println("You have "+(6-k)+" trials:");
        mynumber= sc.nextInt();

        if (k==5){
            System.out.println("You have exausted your number of trials");
            break;
        }

        else if (mynumber==guessnumber){
            System.out.println("WHOO WHOO... You Guessed the Correct Number");
            break;
        }
        else if(mynumber>guessnumber){
            System.out.println("Your Number is smaller than: " + mynumber);
        }
        else{
            System.out.println("Your Number is larger than: " +mynumber);
        }

        k++;

    } while (mynumber>=0);
        System.out.print("My Number was: "+guessnumber);
    }
}