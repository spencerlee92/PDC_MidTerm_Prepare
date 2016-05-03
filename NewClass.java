/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

//import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;

/**
 *
 * @author nyg7208
 */
public class NewClass {

    public static Scanner in;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner in;
        in = new Scanner(System.in);
        String line;
        int sum = 0;
        System.out.print("Input: ");
        do {
            line = in.nextLine();
        } while (!isValidAnswer(line));
        int num = Integer.parseInt(line);
        if (num % 2 == 0) {
            if (num == 0) {
                System.out.println("No even numbers found");
                return;
            }
            int num1 = num;
            for (int a = num / 2; a > 0; a--) {
                num1 = num1 - 2;
                sum += num1;

            }
            System.out.println("Sum: " + sum);
        } else if (num % 2 != 0) {
            if (num == 1) {
                System.out.println("No odd numbers found");
                return;
            }

            int num2 = num;
            for (int a = num / 2; a > 0; a--) {
                num2 = num2 - 2;
                System.out.print(num2 + " ");

            }
        }

    }

    public static boolean isValidAnswer(String line) {
        try {
            int a = Integer.parseInt(line);
            if (a < 0) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.print("Not valid.Input again: ");
            return false;
        }

        return true;
    }

}
