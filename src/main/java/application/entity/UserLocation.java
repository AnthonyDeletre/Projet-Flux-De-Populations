package application.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Entité localisation
 */
@Entity
@Table(name = "user_location")
public class UserLocation {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_location_id")
    private Integer id;

    private double latitude;//X

    private double longitude;//Y

    private boolean inZone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isInZone() {return inZone;}

    public void setInZone(boolean inZone) {this.inZone = inZone;}

    @Override
    public String toString() {
        return "UserLocation{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", inZone=" + inZone +
                '}';
    }
}
