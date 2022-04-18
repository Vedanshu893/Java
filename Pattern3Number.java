// for n = 8
// 1
// 2 3
// 4 5 6
// 7 8

package com.company;

import java.util.Scanner;

public class Pattern3Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. up to which u want print in triangle form: ");
        int final_value = sc.nextInt();
        int count = 1;
        for(int i =1; count<final_value;i++){

            // Other than writing 2 conditions, single condition with break statement can be used
            // if(count > final_value){ break;} ::: under 'j' loop

            for (int j=1;j<=i && count<=final_value;j++){
                    System.out.print(count + " ");
                    count ++;
            }
            System.out.println();
            }
        }
    }

