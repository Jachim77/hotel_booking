public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isViewOnSea;
    private double pricePerNight;

    public Room(int rommNumber, int numerOfBeds, boolean isBalcony, boolean isViewOnSea, double pricePerNight) {
        this.roomNumber = rommNumber;
        this.numberOfBeds = numerOfBeds;
        this.isBalcony = isBalcony;
        this.isViewOnSea = isViewOnSea;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isViewOnSea() {
        return isViewOnSea;
    }

    public void setViewOnSea(boolean viewOnSea) {
        isViewOnSea = viewOnSea;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
