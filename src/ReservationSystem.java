import java.util.Arrays;

public class ReservationSystem {
        public static Reservation[] reservations = new Reservation[50];
        public static int numberOfreservations = 0;

        public static void addReservation(Reservation reservation) {
                if (numberOfreservations >= reservations.length) {
                        System.out.println("No more spots.");
                } else {
                        reservations[numberOfreservations++] = reservation;
                }
        }
        public static void displayReservations() {
                for (int counter = 0; counter < numberOfreservations; counter++) {
                        System.out.println("Reservation " + " " + (counter + 1));
                        System.out.println(reservations[counter]);
                }

        }

        public static void sortReservations() {
                int counter = reservations.length;
                for (int x = 0; x < counter - 1; x++) {
                        if (reservations[x].timeMadereservation < reservations[x].timeMadereservation) {


                        }

                }








        }

    // static array
    //add reservations
    //cancelReservation
    //SortReservation
    //changeReservation
    //displayReservation

}
