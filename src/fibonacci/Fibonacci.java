/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Chabelo
 */
public class Fibonacci {

   

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            int numero, fibo1, fibo2, i;
            BigInteger a = BigInteger.valueOf(0);
            BigInteger b = BigInteger.valueOf(1);
            BigInteger c = BigInteger.valueOf(1);
            fibo1 = 0;
            fibo2 = 1;

            System.out.println("Ingresa numero de sucessiones: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println(a+" ");
                for (i = 2; i <= numero; i++) {
                     c = a.add(b);
                     a = b;
                     b = c;
                    System.out.println(a + " ");
                }
            } 
        }
        
    }
}
