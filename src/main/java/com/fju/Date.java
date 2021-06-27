package com.fju;

import java.util.Calendar;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("Pleass enter the time");
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        System.out.println(time);
    }
}
