package synchronisationConcept;


class MovieTicketBook {
    int Total_Seats = 10;

    public void bookTikets(int Booktickets) {

        if (Total_Seats > 0) {
            System.out.println("seat booked: "+Thread.currentThread().getName());
            Total_Seats = Total_Seats - Booktickets;
            System.out.println("seats left : "+Total_Seats);
        } else {
            System.out.println("seat not available");
        }
    }
}

public class BookTheaterSeats extends Thread {
    static MovieTicketBook book=new MovieTicketBook();
    int seats;

    @Override
    public void run() {
        book.bookTikets(seats);
    }

    public static void main(String[] args) {

        BookTheaterSeats b1 = new BookTheaterSeats();
        b1.seats = 5;
        b1.start();
        BookTheaterSeats b2 = new BookTheaterSeats();
        b2.seats = 8;
        b2.start();
    }
}

