package question3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintNums extends Thread {

    int num;

    public PrintNums(int n) {
        this.num = n;
    }

    /* public void printNumbers(){
         for(int i=1; i<=5; i++)
             System.out.println((2*i-this.num));
    }
     */
    public static void main(String[] args) {
        /*PrintNums oddPrint=new PrintNums(1);
        PrintNums evenPrint=new PrintNums(0);
        oddPrint.printNumbers();
        evenPrint.printNumbers();*/
        PrintNums oddPrint=new PrintNums(1);
        PrintNums evenPrint=new PrintNums(0);
        oddPrint.start();
        evenPrint.start();
        
    }

    public void run() {
        if(this.num ==0)
            try {
                sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrintNums.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println((2 * i - this.num));
        }
    }
}
