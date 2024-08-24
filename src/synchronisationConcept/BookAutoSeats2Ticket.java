package synchronisationConcept;

class BookAutoSeats {
   static int Total_Seats = 39;

    public static synchronized void  bookAutoTicket1(int Booktickets) { // here we used static synchronization block.
        if (Total_Seats > 0) {
            System.out.println(Booktickets+": seat booked succesfully: " + Thread.currentThread().getName());
            Total_Seats = Total_Seats - Booktickets;
            System.out.println("seats left : " + Total_Seats);
        } else {
            System.out.println("seat not available for Thread: "+Thread.currentThread().getName());
        }
    }
}

class BookAutoSeats1Ticket extends Thread {
    int seats;

    BookAutoSeats b1;

    BookAutoSeats1Ticket(BookAutoSeats b1,int seats) {
        this.seats = seats;
        this.b1 = b1;
    }

    @Override
    public void run() {
        b1.bookAutoTicket1(seats);
    }
}

class BookAuto2Ticket extends Thread {
    int seats;

    BookAutoSeats b2;

    BookAuto2Ticket( BookAutoSeats b2,int seats) {
        this.seats = seats;
        this.b2 = b2;
    }

    @Override
    public void run() {
        b2.bookAutoTicket1(seats);
    }
}


public class BookAutoSeats2Ticket extends Thread {

    public static void main(String[] args) {
        BookAutoSeats bs1 = new BookAutoSeats();
        BookAutoSeats1Ticket t1 = new BookAutoSeats1Ticket(bs1,7);
        t1.start();

        BookAuto2Ticket t2 = new BookAuto2Ticket(bs1,8);
        t2.start();

        BookAutoSeats bs2 = new BookAutoSeats();
        BookAutoSeats1Ticket t3 = new BookAutoSeats1Ticket(bs2,7);
        t3.start();


        BookAuto2Ticket t4 = new BookAuto2Ticket(bs2,11);
        t4.start();
    }
}
