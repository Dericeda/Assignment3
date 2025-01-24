package oop2.Task9;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Iphone iphone = (Iphone) obj;
        return price == iphone.price &&
                model.equals(iphone.model) &&
                color.equals(iphone.color);
    }
}
