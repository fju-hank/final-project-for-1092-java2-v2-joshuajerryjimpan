package com.fju;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter the time:");
        Scanner sc = new Scanner(System.in);
        String hours = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
        java.util.Date current = new java.util.Date();
        String str = sdf.format(current);
        int Hours = 0;
        try {
            java.util.Date d1 = sdf.parse(hours);
            java.util.Date d2 = sdf.parse(str);
            long dif = d2.getTime() - d1.getTime();
            long difhr = dif / (60 * 60 * 1000);
            Hours = (int) difhr;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int Fee = 0;
        if (Hours <= 2) {
            Fee = Fee + Hours * 30;
        } else if (Hours > 2 && Hours <= 5) {
            Fee = Fee + (Hours - 2) * 40 + 2 * 30;
        } else if (Hours > 5 && Hours <= 9) {
            Fee = Fee + (Hours - 5) * 50 + 3 * 40 + 2 * 30;
        } else if (Hours > 9) {
            Fee = Fee + (Hours - 9) * 60 + 4 * 50 + 3 * 40 + 2 * 30;
        }
        System.out.println("You have already parked for " + Hours + " hours." + "\n" + "Total is " + Fee);
    }
}
