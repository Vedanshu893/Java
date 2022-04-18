package com.company;
//Print the number in sequence with input = desired row number
// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.Scanner;

public class PatternNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        int count = 1;
        for (int i=1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(count);
                count +=1;
            }
            System.out.println();
        }

    }
}
