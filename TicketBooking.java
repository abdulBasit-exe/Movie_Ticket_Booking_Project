package SemesterProjects;


import javax.swing.*;

public class TicketBooking {
    public static void main(String[] args) throws Exception{

        TicketCounter counter1= new TicketCounter();
        System.out.println("******Welcome to Cinepax Cenima******");
        System.out.println("Now Showing:");
        System.out.println("1- TopGun" +
                "\n2-HonestTheif");
        TicketBookingThread t1 = new TicketBookingThread(counter1,"Abdul Basit","TopGun",20);
        TicketBookingThread t2 = new TicketBookingThread(counter1,"Uzair Qureshi","HonestTheif",2);

        t1.start();
        t1.join();
        t2.start();
    }
}
