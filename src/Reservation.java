public class Reservation {

    public int numberOfpeople;
    public int timeOfreservation;
    public int timeMadereservation;


    public Reservation(int people, int time, int madetime) {
        numberOfpeople = people;
        timeOfreservation = time;
        timeMadereservation = madetime;
    }

    public String toString(){
        return "number of people: " + numberOfpeople + " time of reservation: " + timeOfreservation + "time made reservation: " + timeMadereservation;
    }

    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        system.addReservation(new Reservation(9, 1810, 990));  //time is 6:10
        system.addReservation(new Reservation(2, 1450, 1750));
        system.addReservation(new Reservation(6, 1120, 150));

        system.displayReservations();

        system.sortReservations();

        system.displayReservations();
    }
}