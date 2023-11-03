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


}