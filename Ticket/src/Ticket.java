import java.text.DecimalFormat;
import java.util.Date;

public class Ticket {
    private long ticketId;
    private int departureZone;
    private int arrivalZone;
    private Date departureTime;
    private Date arrivalTime;
    private boolean isUsed;
    private DecimalFormat price;
    private long buyerId;
    public String place;

    public Ticket(long ticketId, int departureZone, int arrivalZone, Date departureTime, Date arrivalTime,
                  boolean isUsed, DecimalFormat price, long buyerId, String place) {
        this.ticketId = ticketId;
        this.departureZone = departureZone;
        this.arrivalZone = arrivalZone;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.isUsed = isUsed;
        this.price = price;
        this.buyerId = buyerId;
        this.place = place;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public int getDepartureZone() {
        return departureZone;
    }

    public void setDepartureZone(int departureZone) {
        this.departureZone = departureZone;
    }

    public int getArrivalZone() {
        return arrivalZone;
    }

    public void setArrivalZone(int arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}

