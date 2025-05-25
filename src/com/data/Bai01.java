package com.data;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n = ");
        n = sc.nextInt();
        if (n<2) System.out.println( n + " không phải là số nguyên tố");
        else {
            for (i=2;i<=Math.sqrt(n);i++) {
                if (n%i==0) {
                    System.out.println( n + " không phải là số nguyên tố");
                    return;
                }
            }
            System.out.println( n + " là số nguyên tố");
        }
    }
}
