import java.util.Scanner;
public class Residence {
    private String streetName;
    private String cityName;
    private String zipCode;
    private String province;
    private String country;

    public Residence(){}

    public Residence(String streetName, String cityName, String zipCode, String province, String country) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.province = province;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Residence" +
                "streetName='" + streetName + '\n' +
                ", cityName='" + cityName + '\n' +
                ", zipCode='" + zipCode + '\n' +
                ", province='" + province + '\n' +
                ", country='" + country + '\n' +
                '}';
    }
}
