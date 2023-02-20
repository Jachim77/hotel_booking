import java.time.LocalDate;

public class Booking {
    private Room room;
    private Guest guestA = null;
    private Guest guestB = null;
    private Guest guestC = null;
    private LocalDate stertOfBooking;
    private LocalDate endOfBooking;
    private Boolean isBusinessTrip;

    public Booking(Room room, LocalDate stertOfBooking, LocalDate endOfBooking, Boolean isBusinessTrip) {
        this.room = room;
        this.stertOfBooking = stertOfBooking;
        this.endOfBooking = endOfBooking;
        this.isBusinessTrip = isBusinessTrip;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuestA() {
        return guestA;
    }

    public void setGuestA(Guest guestA) {
        this.guestA = guestA;
    }

    public Guest getGuestB() {
        return guestB;
    }

    public void setGuestB(Guest guestB) {
        if (room.getNumberOfBeds() < 2) {
            return;
        }
        this.guestB = guestB;
    }

    public Guest getGuestC() {
        return guestC;
    }

    public void setGuestC(Guest guestC) {
        if (room.getNumberOfBeds() < 3) {
            return;
        }
        this.guestC = guestC;
    }

    public LocalDate getStertOfBooking() {
        return stertOfBooking;
    }

    public void setStertOfBooking(LocalDate stertOfBooking) {
        this.stertOfBooking = stertOfBooking;
    }

    public LocalDate getEndOfBooking() {
        return endOfBooking;
    }

    public Boolean getBusinessTrip() {
        return isBusinessTrip;
    }

    public void setBusinessTrip(Boolean businessTrip) {
        isBusinessTrip = businessTrip;
    }

    public void setEndOfBooking(LocalDate endOfBooking) {
        this.endOfBooking = endOfBooking;
    }
}
