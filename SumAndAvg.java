/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumandavg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author nyg7208
 */
public class SumAndAvg {

    public static BufferedReader in;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        //String[] data = null;
        int i = 0;
        int sum = 0;
        int avg = 0;
        int num;
        int count = 0;
        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            sum += num;
            count++;

        }
        if (count != 0) {
            avg = sum / count;
        } else {
            System.out.println("Count cant be zero if you want the average.");
        }
        System.out.println("Count: " + count + " Sum: " + sum+ " Avg: "+avg);

    }

}
