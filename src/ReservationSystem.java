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
                        if (reservations[counter] != null) {
                                System.out.println(reservations[counter]);
                        } else {
                                System.out.println("Canceled Reservation");
                        }
                }
        }


        public static void sortReservations() {
                int counter = numberOfreservations;
                for (int x = 0; x < counter - 1; x++) {
                        for (int y = x + 1; y < counter; y++) {
                                if (reservations[x] != null && reservations[y] != null
                                        && reservations[x].timeMadereservation > reservations[y].timeMadereservation) {
                                        Reservation q = reservations[x];
                                        reservations[x] = reservations[y];
                                        reservations[y] = q;
                                }
                        }

                }
                displayReservations();


        }

                public static void cancelReservation ( int index){
                        if (index >= 0 && index < numberOfreservations) {
                                reservations[index] = null;
                                System.out.println("reservation canceled");
                        } else {
                                System.out.println("index in invalid");
                        }
                }

                public static void changeReservation ( int index, int newGroupSize){
                        if (index >= 0 && index < numberOfreservations) {
                                reservations[index].numberOfpeople = newGroupSize;
                                System.out.println("updated");
                        } else {
                                System.out.println("index is invalid");
                        }

                }
        }












// static array
    //add reservations
    //cancelReservation
    //SortReservation
    //changeReservation
    //displayReservation


