package com.company;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        String response, question, condition;


        System.out.println("Magic 8 Ball Program\n");

        System.out.println("\nPlease enter your question for a answer? Enter 'exit' to quit");
        question =keyboard.nextLine();

        while(!question.equals("exit")) {
            Random r = new Random();
            int choice = 1 + r.nextInt(20);


            if (choice == 1)
                response = "It is certain";
            else if (choice == 2)
                response = "It is decidedly so";
            else if (choice == 3)
                response = "Without a doubt";
            else if (choice == 4)
                response = "Yes definitely";
            else if (choice == 5)
                response = "You may rely on it";
            else if (choice == 6)
                response = "As I see it, yes";
            else if (choice == 7)
                response = "Most likely";
            else if (choice == 8)
                response = "Outlook good";
            else if (choice == 9)
                response = " Yes ";
            else if (choice == 10)
                response = "Signs point to yes";
            else if (choice == 11)
                response = "Reply hazy, try again";
            else if (choice == 12)
                response = "Ask again later";
            else if (choice == 13)
                response = "Better not tell you now";
            else if (choice == 14)
                response = "Cannot predict now";
            else if (choice == 15)
                response = "Concentrate and ask again";
            else if (choice == 16)
                response = "Don't Count on it";
            else if (choice == 17)
                response = "My Reply is No";
            else if (choice == 18)
                response = "My Sources say No";
            else if (choice == 19)
                response = "Outlook Not so Good";
            else if (choice == 20)
                response = "Very Doughtful";
            else
                response = "8-BALL ERROR!";

            System.out.println("Magic 8-Ball Says: " + response);

            System.out.println("\n Do you have another Question ? (y/n)" );
            condition =keyboard.nextLine();
            if ( condition.equals("y")) {
                System.out.println("\n Please enter your question for a answer or type 'exit' to quit");
                question =keyboard.nextLine();
            }
            else {
                question = "exit";
            }


        }
    }
}
