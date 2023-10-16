package FunctionalProgramming;

public class CarDTO {
    private String brand;
    private int price;

    public CarDTO(String brand, int price) {
        this.brand = brand;
        this.price = price;
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

    @Override
    public String toString() {
        return "CarDTO{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static CarDTO map(Car car){
        return new CarDTO(
                car.getBrand(),
                car.getPrice()
        );
    }
}
