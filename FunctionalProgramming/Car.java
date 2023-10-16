package FunctionalProgramming;

public class Car {
    private String brand;
    private int price;
    public String mileage;

    public Car(String brand, int price, String mileage) {
        this.brand = brand;
        this.price = price;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
