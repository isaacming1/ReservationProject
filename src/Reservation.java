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
        system.addReservation(new Reservation(9, 1810, 950));  //time is 9:50am
        system.addReservation(new Reservation(2, 1450, 1750)); //time is 5:50 pm
        system.addReservation(new Reservation(6, 1120, 150)); // time is 1:50 am

        system.displayReservations();

        system.sortReservations();

        system.displayReservations();
    }
}
