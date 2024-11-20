package Task2;

public class Waffle extends Item{
    public Waffle(){
        super("Waffle", 1,5.00);
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getCost() {
        return price*count;
    }
}
