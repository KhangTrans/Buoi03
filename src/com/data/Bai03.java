package com.data;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String c;
        System.out.print("Nhập chuỗi: ");
        str = sc.nextLine();

        System.out.print("Nhập từ cần tìm: ");
        c = sc.nextLine();

        int position =  str.indexOf(c);

        if (position != -1)
            System.out.printf("Từ \"%s\" xuất hiện tại vị trí %d trong chuỗi.", c,position+1);
        else System.out.printf("Không tìm thấy từ \"%s\" trong chuỗi.", c);
    }
}
