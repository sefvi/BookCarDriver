package vn.sefviapp.driver.Model;

public class Driver {
    private String email;
    private double latitude;
    private String licenseplate;
    private double longitude;
    private String name;
    private String phone;
    private double rate;
    private boolean status;
    private boolean working;

    public Driver() {

    }

    public Driver(String email, double latitude, String licenseplate, double longitude, String name, String phone, double rate, boolean status, boolean working) {
        this.email = email;
        this.latitude = latitude;
        this.licenseplate = licenseplate;
        this.longitude = longitude;
        this.name = name;
        this.phone = phone;
        this.rate = rate;
        this.status = status;
        this.working = working;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
