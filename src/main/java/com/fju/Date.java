package com.fju;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        System.out.println("Please enter the time:" );
        Scanner sc = new Scanner(System.in);
        String hours = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
        java.util.Date current = new java.util.Date();
        String str = sdf.format(current);
        try {
            java.util.Date d1 = sdf.parse(hours);
            java.util.Date d2 = sdf.parse(str);
            long dif = d2.getTime()- d1.getTime();
            long difhr = dif/(60*60*1000);
            System.out.println(difhr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
