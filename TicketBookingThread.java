package SemesterProjects;

public class TicketBookingThread extends Thread{
    private TicketCounter counter ;
    private String name;

    private String movieName;
    private int noOfTicketsToBook;

    public TicketBookingThread(TicketCounter counter,String name, String movieName, int noOfTicketsToBook){
        this.counter=counter;
        this.name=name;
        this.movieName=movieName;
        this.noOfTicketsToBook=noOfTicketsToBook;
    }

    @Override
    public void run() {
        counter.bookTicket(name, movieName, noOfTicketsToBook);
    }
}
