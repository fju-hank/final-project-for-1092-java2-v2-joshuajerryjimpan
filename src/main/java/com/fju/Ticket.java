package com.fju;

public class Ticket {
    static class CarTicket{
        private static int count = 0;
        private int ticket;
        int[] entertime = new int[2];
        int SetTicket(){
            count++;
            ticket = count;
            return ticket;
        }
        int GetTicket(){
            return ticket;
        }
    }
    static class Cars{
        static CarTicket[] car = new CarTicket[100];
        static int number;
    }
    static class Clock{
        static int hour;
        static int minute;
    }
}
