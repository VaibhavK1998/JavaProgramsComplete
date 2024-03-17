package synchronisationConcept;


class MovieTikectBook2 {
    int Total_Seats = 10;

    public void bookTikets2(int Booktickets) {
        System.out.println("thread name: " + Thread.currentThread().getName());

        synchronized (this) { // achive synchronisation using synchronised block
            if (Total_Seats > 0) {
                System.out.println("seat booked: " + Thread.currentThread().getName());
                Total_Seats = Total_Seats - Booktickets;
                System.out.println("seats left : " + Total_Seats);
            } else {
                System.out.println("seat not available");
                System.out.println("seats left : " + Total_Seats);
            }
        }
        System.out.println("thread name: " + Thread.currentThread().getName());

    }
}

class BookTheaterSeats2 extends Thread {
    int seats;
    static MovieTikectBook2 book1 = new MovieTikectBook2();

    @Override
    public void run() {
        book1.bookTikets2(seats);
    }
}

class MovieTicketBook {
    int Total_Seats = 10;

    public synchronized void bookTikets(int Booktickets) { // synchronization achived using synchronized method

        if (Total_Seats > 0) {
            System.out.println("seat booked: " + Thread.currentThread().getName());
            Total_Seats = Total_Seats - Booktickets;
            System.out.println("seats left : " + Total_Seats);
        } else {
            System.out.println("seat not available");
            System.out.println("seats left : " + Total_Seats);
        }
    }
}


public class BookTheaterSeats extends Thread {
    static MovieTicketBook book = new MovieTicketBook();
    int seats;

    @Override
    public void run() {

        book.bookTikets(seats);
    }

    public static void main(String[] args) {
/*
        BookTheaterSeats b1 = new BookTheaterSeats();
        b1.seats = 5;
        b1.start();
        BookTheaterSeats b2 = new BookTheaterSeats();
        b2.seats = 9;
        b2.start();

 */
        BookTheaterSeats2 b21 = new BookTheaterSeats2();
        b21.seats = 5;
        b21.start();
        BookTheaterSeats2 b22 = new BookTheaterSeats2();
        b22.seats = 8;
        b22.start();
    }
}

