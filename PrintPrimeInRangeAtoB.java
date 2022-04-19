package com.company;

import java.util.Scanner;

public class PrintPrimeInRangeAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range :");
        int A = sc.nextInt();
        System.out.print("Enter the stopping range :");
        int B = sc.nextInt();
        int n=A;
        for ( ; n < B; n++) {
            int i = 2;
            for (; i <= n - 1; i++) {
                if (n % i == 0) {
                    break;
                }
            }
                if (n == i) {
                    System.out.print(n+" ");
                }
            }
        }
    }
