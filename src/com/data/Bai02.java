package com.data;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        int s,n;
        s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        do {
            n = sc.nextInt();
            s+=n;
        } while (n!=0);

        System.out.println("Tổng các số đã nhập là: " + s);
    }
}
