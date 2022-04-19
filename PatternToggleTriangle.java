package com.company;

import java.util.Scanner;

public class PatternToggleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arm length :");
        int n = sc.nextInt();
        int val = n%2; // for starting with 0

        // for different pattern -> val =(n+1)%2

        for(int i = 1;i<=n;i++){
            for (int j=1; j <=i;j++){
                System.out.print(val +" ");
                val = 1-val;
            }
            System.out.println();
        }
    }
}
