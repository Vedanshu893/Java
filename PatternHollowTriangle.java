package com.company;

import java.util.Scanner;

public class PatternHollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of equilateral triangle :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int m =1; m<=2*i-1;m++){
                if(m==1 || m==2*i-1 || i==n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}