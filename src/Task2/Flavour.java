package Task2;

public abstract class Flavour {
    String name;
    int count;
    double price;
    public Flavour(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public int getScoopCount(){
        return count;
    }
    public double getPrice(){
        return price;
    }

    public double getTotalPrice(){
        return price * count;
    }

    public String getName() {
        return name;
    }
}
