package SemesterProjects;

public class TicketCounter {
    int HonestTheif_AvailbleTickets=40;
    int TopGun_AvailableTickets=20;
    public void bookTicket(String name, String movieName, int noOfTickets){
        if(movieName=="TopGun"){
            if(noOfTickets<=TopGun_AvailableTickets && noOfTickets!=0){
                System.out.println(name+" your "+noOfTickets+" seats for show "+movieName+" have been booked Successfully.");
                System.out.println("Thanks.");
                TopGun_AvailableTickets-=noOfTickets;
            }
            else if(TopGun_AvailableTickets==0){
                System.out.println("Sorry, "+name+" Its already Housefull.");
            }
            else if(TopGun_AvailableTickets<noOfTickets) {
                System.out.println("Sorry, "+name+"there are only "+TopGun_AvailableTickets+" seats available!");
            }

            else {
                System.out.println("invalid input.");
            }
        }
        else if(movieName=="HonestTheif"){
            if(noOfTickets<=HonestTheif_AvailbleTickets && noOfTickets!=0){
                HonestTheif_AvailbleTickets-=noOfTickets;
                System.out.println(name+" your "+noOfTickets+" seats for show "+movieName+ " have been booked Successfully.");
                System.out.println("Thanks.");
            }
            else if(HonestTheif_AvailbleTickets==0){
                System.out.println("Sorry, "+name+" Its already Housefull.");
            }
            else if(HonestTheif_AvailbleTickets<noOfTickets) {
                System.out.println("Sorry, "+name+"there are only "+HonestTheif_AvailbleTickets+" seats available!");
            }

            else {
                System.out.println("invalid input.");
            }
        }

        else {
            System.out.println("Invalid Input.");
        }

    }
}
