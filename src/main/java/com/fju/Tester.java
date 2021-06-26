package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter your parking hours: ");
        Scanner scan = new Scanner(System.in);
        int parkingHours = scan.nextInt();
        System.out.printf("You have already parked for " + parkingHours + " hours");
    }
}
