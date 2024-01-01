package MainPackage;

import java.io.Serializable;

public class Seat implements Serializable{
    private String seatID;
    private double seatPrice;
    private boolean Booked;


    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public void setBooked(boolean booked) {
        Booked = booked;
    }


    public String getSeatID() {
        return seatID;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public boolean isBooked() {
        return Booked;
    }
}
