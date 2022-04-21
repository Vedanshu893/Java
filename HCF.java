package com.company.Function;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HCF {
    public static int hcfnum(int A , int B) {
        int A_ = 0;
        int B_ = 0;
        while (A > 0) {
            System.out.println(A+" "+ B+" " +A_+" "+B_);
            A_ = B%A;
            B_ = A;
            A = A_;
            B = B_;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(hcfnum(A,B));

    }
}
