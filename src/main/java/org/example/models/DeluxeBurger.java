package org.example.models;

public class DeluxeBurger extends Hamburger{

    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Sosisli", 19.10, "Beyaz Ekmek");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Includes chips: " + this.cips + " and drink: " + this.drink);
        return super.itemizeHamburger();
    }
}
