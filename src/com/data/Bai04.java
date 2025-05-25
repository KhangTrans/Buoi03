package com.data;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Nhập n: ");
        n = sc.nextInt();

        if (n<1) System.out.println("Số nhập vào không hợp lệ\n");
        else {
            System.out.println("Bảng cửu chương " + n);
            for (i=1; i<11; i++)
                System.out.printf("%d x %2d = %2d\n",n,i,n*i);
        }
    }
}
