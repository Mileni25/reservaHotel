package co.com.choucair.certification.reserva.model;

public class bookingData {

    private String strEmailAddress;
    private String strPassword;
    private String strDestination;
    private String strBedrooms;
    private String strVerif;

    public String getStrVerif() {
        return strVerif;
    }

    public void setStrVerif(String strVerif) {
        this.strVerif = strVerif;
    }

    public String getStrBedrooms() {
        return strBedrooms;
    }

    public void setStrBedrooms(String strBedrooms) {
        this.strBedrooms = strBedrooms;
    }

    public String getStrDestination() {
        return strDestination;
    }

    public void setStrDestination(String strDestination) {
        this.strDestination = strDestination;
    }

    public String getStrEmailAddress() {
        return strEmailAddress;
    }

    public void setStrEmailAddress(String strEmailAddress) {
        this.strEmailAddress = strEmailAddress;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
}
