package Task2;

import java.util.ArrayList;

public class Order {
    ArrayList<Flavour> flavours;
    ArrayList<Toppings> toppings;
    ServeType serveType;
    double amount;
    double tax;
    double totalPrice;


    public Order() {
        flavours = new ArrayList<>();
        toppings = new ArrayList<>();
        serveType = null;
        amount = 0;
        tax = 0;
    }

    void addFlavour(Flavour flavour) {
        flavours.add(flavour);
    }

    void addTopping(Toppings topping) {
        toppings.add(topping);
    }

    void setServeType(ServeType serveType) {
        this.serveType = serveType;
    }

    void calculateAmount() {
        if(amount > 0){return;}
        for (Flavour flavour : flavours) {
            amount += flavour.getPrice();
        }
        for (Toppings topping : toppings) {
            amount += topping.getPrice();
        }
        amount += serveType.getPrice();
    }

    void calculateTax() {
        tax = amount* 0.08;
    }

    double getTotalPrice(){
        return totalPrice;
    }

    void calculate(){
        calculateAmount();
        calculateTax();
        totalPrice = amount + tax;
    }


}
