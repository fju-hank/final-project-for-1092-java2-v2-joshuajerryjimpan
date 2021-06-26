package com.fju;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh:mm");
        Date now = new Date();
        System.out.println(sdf.format(now));
        System.out.println("Pleass enter the time");
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        System.out.println(time);
    }
}
