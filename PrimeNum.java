package com.anonymous.p1;
import java.util.*;
import com.sun.source.tree.BreakTree;

/**
 * Simple program to check the given number isPrime or not
 *
 * @author DIPESH
 * @date 9/9/2024
 */
public class PrimeNum {
    public static boolean isPrime(int n) {
//        System.out.println("Enter the number to chek isPrime or not");
//        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++) {
            if(n%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
}
