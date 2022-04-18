package com.company.Function;

// Print Pattern with n=3
//    1
//  2 3 2
//3 4 5 4 3

import java.util.Scanner;

public class Pattern5Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            // Spaces

            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print("  ");
            }

            //Increasing no.

            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Print reverted triangle starting from i=2 (row =2)

            for(int m=2*i-2;m>=i && i>=2 ;m--){
                System.out.print(m+" ");
            }

            System.out.println();

        }
    }
}
