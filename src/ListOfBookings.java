import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> hotelBookings = new ArrayList<>();

    public void add(Booking booking) {
        hotelBookings.add(booking);
    }


    public String prepareText() {
        String text = "Seznam rezervací: \n";
        for (Booking booking : hotelBookings) {
            text.concat("Pokoj " + booking.getRoom().getRoomNumber() + ": "
                    + booking.getGuestA().getAddress() + " "
                    + booking.getGuestA().getName() + " "
                    + booking.getGuestA().getSurname() + ", ");
            if (booking.getGuestB() != null) {
                text.concat(booking.getGuestB().getAddress() + " " + booking.getGuestB().getName() + " " + booking.getGuestB().getSurname() + " ");
            }
            if (booking.getGuestC() != null) {
                text.concat(booking.getGuestC().getAddress() + " " + booking.getGuestC().getName() + " " + booking.getGuestC().getSurname() + " ");
            }
            text.concat(
                    "Příjezd: " + booking.getStertOfBooking() + ", "
                            + "Odjezd: " + booking.getEndOfBooking() + ", "
                            + "služební cesta: " + booking.getBusinessTrip()
                            + "\n");
        }
        return text;
    }


}
