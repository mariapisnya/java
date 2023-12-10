package cw9;

import java.time.LocalDate;

public abstract class Flower implements Comparable<Flower> {
    private String name;
    private float price;
    private LocalDate time;

    public Flower() {}

    protected void setName(String name) {this.name = name;}

    public String getName() {return this.name;}

    public void setTime(LocalDate time) {this.time = time;}

    public void setPrice(float price) {this.price = price;}

    public LocalDate getTime() {return this.time;}

    public float getPrice() {return this.price;}

    public int compareTo(Flower other) {
        return Integer.compare(this.getTime().getDayOfYear(), other.getTime().getDayOfYear());
    }
}
