import java.util.Scanner;

public class Reservation {


    public int numberOfpeople;
    public int timeOfreservation;
    public int timeMadereservation;



    public String reservationName;


    public Reservation(int people, int time, int madetime, String name) {
        numberOfpeople = people;
        timeOfreservation = time;
        timeMadereservation = madetime;
        reservationName = name;
    }

    public String x(int y) {
        int h = y / 100;
        int m = y % 100;
        String z = "AM";
        if (h >= 12) {
            z = "PM";
            if (h > 12) {
                h -= 12;
            }
        }
        String f;
        if (m < 10) {
            f = "0" + m;
        } else {
            f = String.valueOf(m);
        }
        String minuteString = (m < 10) ? "0" + m : "" + m;
        String g = h + ":" + minuteString + " " + z;
        return g;
    }

    public String toString() {
        return "number of people: " + numberOfpeople + " time of reservation: " + x(timeOfreservation) +
                " time made reservation: " + x(timeMadereservation) + " reservation name: " + reservationName;
    }


    //public static void main(String[] args) {
    //   ReservationSystem system = new ReservationSystem();
    // system.addReservation(new Reservation(9, 1810, 2359));
    //system.addReservation(new Reservation(2, 1450, 1750));
    //system.addReservation(new Reservation(6, 1120, 150));
    //system.addReservation(new Reservation(6, 1120, 1751));
    //system.addReservation(new Reservation(6, 1120, 740));


    //system.displayReservations();

    //  System.out.println();

    //System.out.println("Sorted List is below");

    //system.sortReservations();


    //system.displayReservations();
    //}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem system = new ReservationSystem();

        while (true) {
            System.out.println("Enter 1 to add a reservation");
            System.out.println("Enter 2 to cancel a reservation");
            System.out.println("Enter 3 to change the number of people in a group");
            System.out.println("Enter 4 to display all reservations");
            System.out.println("Enter 5 to sort reservations by reservation time");
            System.out.println("Enter 6 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter group size: ");
                    int groupSize = scanner.nextInt();
                    System.out.print("Enter time of your reservation(in military time without colon): ");
                    int time = scanner.nextInt();
                    System.out.print("What time is it right now?(in military time without colon): ");
                    int reservationTime = scanner.nextInt();
                    System.out.print("Enter name: ");
                    String reservationName = scanner.next();

                    Reservation newReservation = new Reservation(groupSize, time, reservationTime, reservationName);


                    ReservationSystem.addReservation(newReservation);
                    break;
                case 2:
                    System.out.print("Enter index of reservation to cancel: ");
                    int index = scanner.nextInt();
                    ReservationSystem.cancelReservation(index);
                    break;
                case 3:
                    System.out.print("Enter index of reservation to change: ");
                    index = scanner.nextInt();
                    System.out.print("Enter new group size: ");
                    int newGroupSize = scanner.nextInt();
                    ReservationSystem.changeReservation(index, newGroupSize);
                    break;
                case 4:
                    ReservationSystem.displayReservations();
                    break;
                case 5:
                    ReservationSystem.sortReservations();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }


    }
    }
