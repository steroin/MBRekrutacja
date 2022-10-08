package ex4;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final double price;
    private final int quantity;
    private final String insurancePackage;
    private final boolean registered;

    public Car(String brand, String model, double price, int quantity, String insurancePackage, boolean registered) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.insurancePackage = insurancePackage;
        this.registered = registered;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getInsurancePackage() {
        return insurancePackage;
    }

    public boolean isRegistered() {
        return registered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && quantity == car.quantity && registered == car.registered && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(insurancePackage, car.insurancePackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, quantity, insurancePackage, registered);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", insurancePackage='" + insurancePackage + '\'' +
                ", registered=" + registered +
                '}';
    }
}
