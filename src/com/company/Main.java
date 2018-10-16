package com.company;

import java.util.Random;
import java.util.Scanner;

 public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like me to call you?");
        String name = input.nextLine();
        System.out.println("Great, " + name + ". Put '1' for Objective 1 game and '2' for Objective 2 game, otherwise it will give an error.");
        int gameSelect = input.nextInt();
        if (gameSelect == 1)
        {
            Scanner input1 = new Scanner(System.in);
            double randomDouble = Math.random();
            int randomInt = (int) (randomDouble * 11);
            randomInt = randomInt;
            System.out.println("Guess my secret number, " + name + ". WARNING: PUT IN AN <<INTEGER>> OR THIS PROCESS WILL TERMINATE.");
            while ((input1.nextInt()) != (randomInt))
            {
                System.out.println("Guess again, " + name + ". Hint: The number is between 0 and 10.");
            }
            System.out.println("You got it, " + name + "! The number is " + randomInt + "!");
        }
        else
        {
            if (gameSelect == 2)
            {
                int min = 1;
                int max = 100;
                Scanner input2 = new Scanner(System.in);
                double randomDouble = Math.random();
                int randomInt = (int) (randomDouble * 101);
                randomInt = randomInt;
                System.out.println("Please think of a number between 1 and 100, " + name + ".........................");
                System.out.println("Is the number " + randomInt + ", " + name + "? Type 'higher' if your number is larger, 'lower' if your number is smaller, or 'correct' if my guess is correct!");
                String next = input2.nextLine();
                while (next != "correct")
                {
                    if (next.equals("correct"))
                    {
                        System.out.println("I did it, " + name + "!");
                        break;
                    }
                    else
                    {
                        if (next.equals("higher"))
                        {
                            min = randomInt;
                            randomInt = (min + max) / 2;
                            System.out.println("Is the number " + randomInt + ", " + name + "? Type 'higher' if your number is larger, 'lower' if your number is smaller, or 'correct' if my guess is correct!");
                            next = input2.nextLine();
                        }
                        else
                        {
                            if (next.equals("lower"))
                            {

                                max = randomInt;
                                randomInt = (min + max)/2;
                                System.out.println("Is the number " + randomInt + ", " + name + "? Type 'higher' if your number is larger, 'lower' if your number is smaller, or 'correct' if my guess is correct!");
                                next = input2.nextLine();
                            }
                            else
                            {
                                System.out.println("All you had to type was either 'higher', 'lower', or 'correct', " + name + ". Now you have to restart!");
                                break;
                            }
                        }
                    }
                }
            }
            else
            {
                System.out.println("ERROR 403: Please restart and put in either 1 or 2, " + name + ".");
            }
        }
    }
}