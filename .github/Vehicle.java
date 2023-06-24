public class Vehicle {
    public String id;
    public String brand;
    public int year;
    public String getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Vehicle(String id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

abstract class startEngine{}
