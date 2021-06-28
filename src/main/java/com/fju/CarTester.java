package com.fju;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import static com.fju.Ticket.Cars.number;

public class CarTester {
    static Scanner keyin = new Scanner(System.in);
    public static void main(String[] args) {
        number = 0;
        int select = get_menu();
        while (select != 4){
            switch (select){
                case 1:
                    disp_cars();
                    break;
                case 2:
                    enter_car();
                    break;
                case 3:
                    outer_car();
                    break;
                case 4:
                    leave_system();
                    break;
                default:
                    System.out.println("Wrong choice, please choose again");
            }
            select = get_menu();
        }
    }
    static int get_menu(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
        java.util.Date current = new java.util.Date();
        String str = sdf.format(current);
        System.out.println("\n"+"Welcome to FJU parking lot, "+ str);
        System.out.println("(1)Show how many cars in parking lot"+"\n"+"(2)Take Ticket"+"\n"+"(3)Pay Money"+"\n"+"(4)Leave System");
        System.out.printf("Now, there is %d cars in the parking lot, please choose one options =>", number);
        int select = keyin.nextInt();
        while (select == 4){
            leave_system();
            break;
        }
        return select;
    }
    static void disp_cars() {
        System.out.printf("Ticket number\t\t"+"The enter time"+"\n");
        for (int i = 0; i < Ticket.Cars.number; i++) {
            System.out.printf("%d\t\t", Ticket.Cars.car[i].GetTicket());
            System.out.printf("%d hr %d min\n", Ticket.Cars.car[i].entertime[0],
                    Ticket.Cars.car[i].entertime[1]);
        }
    }
    static void enter_car(){
        Ticket.Cars.car[Ticket.Cars.number] = new Ticket.CarTicket();
        Ticket.Cars.car[Ticket.Cars.number].SetTicket();
        Ticket.Cars.car[Ticket.Cars.number].entertime[0] = Ticket.Clock.hour;
        Ticket.Cars.car[Ticket.Cars.number].entertime[1] = Ticket.Clock.minute;
        int ticket = Ticket.Cars.car[Ticket.Cars.number].GetTicket();
        System.out.printf("Please press <Enter> to get a ticket(Ticket number: %d)", ticket);
        keyin.nextLine();
        Ticket.Cars.number = Ticket.Cars.number + 1;
    }
    static void outer_car(){
        System.out.printf("Pleas show your ticket =>");
        int ticket = keyin.nextInt();
        keyin.nextLine();
        int flag =0, i;
        for(i=0; i<Ticket.Cars.number; i++) {
            if(ticket == Ticket.Cars.car[i].GetTicket()){
                flag = 1;
                System.out.println("Please enter the time:"+"\n"+"(form: yyyy/MM/dd/HH:mm"+"\n"+"example: 1996/01/23/08:00)");
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
                System.out.println("You have already parked for  " + Hours + "  hours." + "\n" + "Total is  " + Fee);
                System.out.println("\n"+"After you payed money, please press <4> to exit");
            }
        }
        if (flag == 0) {
            System.out.printf("Don't have this car \n");
            return;
        }
    }
    static void leave_system(){
        System.out.println("Thank you for coming, welcome back");
    }
}
