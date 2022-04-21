/* Wrong code



package com.company.Function;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " "+n2 +" ");
        for (int i = 0; i<N-2; i++){
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            n2=n3;
            n1=n2;
        }
    }
}





*/