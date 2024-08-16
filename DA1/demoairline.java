import java.util.*;
class Reservation {
String passengerName;
String mobileNumber;
int flightNumber;
int reservedSeatNumber;
private static String[] flight1 = new String[10];
private static String[] flight2 = new String[10];
static {
for (int i = 0; i < 10; i++) {
flight1[i] = "Available";
flight2[i] = "Available";
}
}
public Reservation(String passengerName, String mobileNumber, int flightNumber, int
reservedSeatNumber) {
this.passengerName = passengerName;
this.mobileNumber = mobileNumber;
this.flightNumber = flightNumber;
this.reservedSeatNumber = reservedSeatNumber;
}
public static void displayFlightDetails() {
System.out.println("Flight-1");
for (int i = 0; i < 10; i++) {
System.out.println((i + 1) + "-" + flight1[i]);
}
System.out.println("Flight-2");
for (int i = 0; i < 10; i++) {
System.out.println((i + 1) + "-" + flight2[i]);
}
}
public static int booking(int flightNumber, String travelClass) {
if (flightNumber == 1) {
if (travelClass.equals("First")) {
for (int i = 0; i < 5; i++) {
if (flight1[i].equals("Available")) {
flight1[i] = "Reserved";
return i + 1;
}
}
} else if (travelClass.equals("Economy")) {
for (int i = 5; i < 10; i++) {
if (flight1[i].equals("Available")) {
flight1[i] = "Reserved";
return i + 1;
}
}
}
} else if (flightNumber == 2) {
if (travelClass.equals("First")) {
for (int i = 0; i < 5; i++) {
if (flight2[i].equals("Available")) {
flight2[i] = "Reserved";
return i + 1;
}
}
} else if (travelClass.equals("Economy")) {
for (int i = 5; i < 10; i++) {
if (flight2[i].equals("Available")) {
flight2[i] = "Reserved";
return i + 1;
}
}
}
}
return -1;
}
public void displayReservationDetails() {
System.out.println("Passenger Name: " + passengerName);
System.out.println("Mobile Number: " + mobileNumber);
System.out.println("Flight Number: " + flightNumber);
System.out.println("Reserved Seat Number: " + reservedSeatNumber);
}
}
public class demoairline {
public static void main(String[] args) {
Reservation[] reservations = new Reservation[20];
int index = 0;
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("1. Display Flight Details");
System.out.println("2. Display Reserved Passenger Details");
System.out.println("3. Reserve a seat");
System.out.println("4. Stop");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
Reservation.displayFlightDetails();
break;
case 2:
for (int i = 0; i < index; i++) {
reservations[i].displayReservationDetails();
}
break;
case 3:
System.out.print("Enter flight number (1 or 2): ");
int flightNumber = scanner.nextInt();
System.out.print("Enter travel class (First or Economy): ");
String travelClass = scanner.next();
int seatNumber = Reservation.booking(flightNumber, travelClass);
if (seatNumber != -1) {
System.out.print("Enter passenger name: ");
String passengerName = scanner.next();
System.out.print("Enter mobile number: ");
String mobileNumber = scanner.next();
reservations[index] = new Reservation(passengerName, mobileNumber, flightNumber,
seatNumber);
index++;
} else {
System.out.println("Next Flight leaves in 3 hours");
}
break;
case 4:
System.exit(0);
default:
System.out.println("Choice is wrong, try again");
}
}
}
}