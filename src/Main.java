import java.util.Random;
import java.util.Scanner;

public class Main {

//  Ryan Ravas
//  4/4/2024

    public static void main(String[] args) {
//      initialize required variables
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String loopInput;
        int totalWinnings = 0;
        do {
//          generate 3 random numbers from 5-500
            int num1 = random.nextInt(496) + 5;
            int num2 = random.nextInt(496) + 5;
            int num3 = random.nextInt(496) + 5;
//          print numbers beside each other
            System.out.printf("\n%d %d %d\n", num1, num2, num3);
//          all numbers are the same
            if (num1 == num2 && num1 == num3) {
                System.out.println("You win the grand prize of $100!");
                totalWinnings += 100;
            }
//          two numbers are the same
            else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("You win $20!");
                totalWinnings += 20;
            }
//          no numbers are the same
            else {
                System.out.println("You lost. :(");
            }
//          ask user if they want to restart
            System.out.print("Do you want to play again? (yes or no) ");
            loopInput = input.next();
//          if they choose to exit, tell them their winnings, then break
            if (loopInput.equalsIgnoreCase("no")) {
                System.out.printf("You won a total of $%d", totalWinnings);
                break;
            }
        } while (true);
    }
}