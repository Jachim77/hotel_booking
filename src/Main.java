import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // atributy
        String guestDescription1;
        String guestDescription2;

        String room1Description;
        String room2Description;
        String room3Description;

        // vytvoření prvního hosta
        Guest guest1 = new Guest("Paní", "Adéla", "Malíková", LocalDate.of(1993, 03, 13));

        // vytvoření druhého hosta
        Guest guest2 = new Guest("Pan", "Jan", "Dvořáček", LocalDate.of(1995, 05, 05));

        // vytvoření řetězce hostů
        guestDescription1 = ("Host 1: " + guest1.getAddress() + " " + guest1.getName() + " " + guest1.getSurname() + " " + guest1.getDateOfBirth());
        guestDescription2 = ("Host 2: " + guest2.getAddress() + " " + guest2.getName() + " " + guest2.getSurname() + " " + guest2.getDateOfBirth());

        // výpis hostů
        System.out.println(guestDescription1);
        System.out.println(guestDescription2);

        // vytvoření pokojů
        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        // vytvoření řetězce pokojů
        room1Description = ("Pokoj " + room1.getRoomNumber() + ": počet lůžek: " + room1.getNumberOfBeds() + ", s balkónem: " + room1.isBalcony() + ", je výhled na moře: " + room1.isViewOnSea() + ", cena za noc: " + room1.getPricePerNight()) + " Kč/noc";
        room2Description = ("Pokoj " + room2.getRoomNumber() + ": počet lůžek: " + room2.getNumberOfBeds() + ", s balkónem: " + room2.isBalcony() + ", je výhled na moře: " + room2.isViewOnSea() + ", cena za noc: " + room2.getPricePerNight()) + " Kč/noc";
        room3Description = ("Pokoj " + room3.getRoomNumber() + ": počet lůžek: " + room3.getNumberOfBeds() + ", s balkónem: " + room3.isBalcony() + ", je výhled na moře: " + room3.isViewOnSea() + ", cena za noc: " + room3.getPricePerNight()) + " Kč/noc";

        // výpis pokojů
        System.out.println(room1Description);
        System.out.println(room2Description);
        System.out.println(room3Description);

        // vytvoření rezervací
        Booking booking1 = new Booking(room1, LocalDate.of(2021, 07, 19), LocalDate.of(2021, 07, 26), true);
        booking1.setGuestA(guest1);
        //booking1.setGuestB(guest2);
        Booking booking2 = new Booking(room3, LocalDate.of(2021, 9, 01), LocalDate.of(2021, 9, 14), true);
        booking2.setGuestA(guest1);
        booking2.setGuestB(guest2);

        // vytvoření seznamu rezervací
        ListOfBookings listOfBookings = new ListOfBookings();
        listOfBookings.add(booking1);
        listOfBookings.add(booking2);

        System.out.println(listOfBookings.prepareText());


    }
}