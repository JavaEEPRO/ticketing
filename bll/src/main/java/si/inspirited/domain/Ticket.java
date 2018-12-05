package si.inspirited.domain;

import org.springframework.lang.Nullable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Nullable
    private String bus;
    @Nullable
    private int place;

    @Nullable
    private String owner;

    @Nullable
    private int price;
    @Nullable
    private Date sold;

    @Nullable
    private String startPoint;
    @Nullable
    private String endPoint;

    @Nullable
    private Date start;
    @Nullable
    private Date arrive;

    private boolean active;

    public String getBus() {
        return bus;
    }
    public void setBus(String bus) {
        this.bus = bus;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }

    public String getStartPoint() {
        return startPoint;
    }
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }
    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getSold() {
        return sold;
    }
    public void setSold(Date sold) {
        this.sold = sold;
    }

    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }

    public Date getArrive() {
        return arrive;
    }
    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        String res = "\n============================Ticket=============================\nin-memory entity link: { " + super.toString() + " }\nid: " + this.getId() + "\nbus: " + this.getBus()  + "\nseat place: " + this.getPlace()  + "\nticket owner: " + this.getOwner() + "\ndate of purchase: " + this.getSold()  + "\ndestination point: " + this.getEndPoint() + "\nwhen arrives: " + this.getArrive()  + "\nstarts from: " + this.getStartPoint() + "\nstarts at: " + this.getStart()  + "\nis active: " + this.isActive() + "\n===============================================================\n";
        return res;
    }
}
