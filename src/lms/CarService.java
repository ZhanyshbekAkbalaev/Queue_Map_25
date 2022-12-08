package lms;

import lms.enums.Colour;

import java.math.BigDecimal;

public class CarService {
    private int year;
    private String model;
    private BigDecimal price;
    private Colour colour;

    public CarService(int year, String model, BigDecimal price, Colour colour) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bus\nyear: " + year +
                "\nmodel: " + model +
                "\nprice: " + price +
                "\ncolour: " + colour+
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    }
}
