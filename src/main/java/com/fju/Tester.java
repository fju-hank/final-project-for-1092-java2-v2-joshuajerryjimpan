package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Pleass enter the time");
        Scanner scan = new Scanner(System.in);
        int Hours = scan.nextInt();
        int Fee = 0;
        if (Hours <= 2){
            Fee = Fee + Hours * 30;
        }else if (Hours > 2 && Hours <= 5){
            Fee = Fee + (Hours-2) * 40 + 2 * 30;
        }else if (Hours > 5 && Hours <= 9){
            Fee = Fee + (Hours-5) * 50 + 3 * 40 + 2 * 30;
        }else if (Hours > 9){
            Fee = Fee + (Hours-9) * 60 + 4 * 50 + 3 * 40 + 2 * 30;
        }
        System.out.println("You have already parked for " + Hours + " hours." + "\n" +"Total is " + Fee);
    }
}
