/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author SpencerLee
 */
public class NewClass {

    static String num;

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input: ");
        do {
            num = keyboard.nextLine();
        } while (!isValidAnswer(num));
        int num1 = Integer.parseInt(num);
        if (num1 % 2 != 0) {
            if (num1 == 1) {
                System.out.println("No odd");
            } else {
                int odd = num1;
                int sum = 0;
                for (int i = (num1 - 1) / 2; i > 0; i--) {
                    odd = odd - 2;
                    System.out.print(odd);
                    sum += odd + 1;
                }
                System.out.println("Sum:" + sum);
            }
        } else if (num1 == 2) {
            System.out.println("No even");
        } else {
            int odd = num1 - 1;
            int sum = 0;
            System.out.print(odd);
            for (int i = (num1 - 1) / 2; i > 0; i--) {
                odd = odd - 2;
                System.out.print(odd);
                sum += odd + 1;
            }
            System.out.println("Sum:" + sum);
        }
    }

    public static boolean isValidAnswer(String answer) {
        try {
            int a = Integer.parseInt(num);
            if (a <= 0) {
                throw new Exception("");
            }
        } catch (Exception e) {
            System.out.print("Invalid. Please input again: ");
            return false;
        }
        return true;
    }
}
