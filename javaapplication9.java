/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author SpencerLee
 */
import java.util.*;

public class javaapplication9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input：");
        int num = s.nextInt();
     
        int loop = num;
        for (int a = loop-1; loop > 1; loop--) {
             boolean is = false;
           // if (loop > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        is = true;
                        break;
                    }
                }
                if (is) {
                    System.out.println(num + "is not a prime number.");
                    
                } else {
                    System.out.println(num + "is a prime number");
                }
                num--;
           // }
        }
    }
}
