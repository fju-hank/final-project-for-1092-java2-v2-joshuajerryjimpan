package com.fju;

import java.util.Scanner;

public class CarStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入入場時間: ");
        int i, price;
        i = sc.nextInt();
        if ( i < 480+30 ) {
            if( i < 30 ){
                System.out.println(i + "分鐘為免費");
            }
            else {
                if ( i / 30 > 0 & i % 30 == 0 ) {
                    price = ((i-30)/30) * 15;
                    System.out.println(i + "分鐘為" + price + "元");
                }
                else {
                    price = 15 + ((i-30)/30) * 15;
                    System.out.println(i + "分鐘為" + price + "元");
                }
            }
        }
        else {
            System.out.println(i + "分鐘為240元");
        }
    }
}
