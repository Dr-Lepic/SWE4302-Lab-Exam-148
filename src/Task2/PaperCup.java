package Task2;

public class PaperCup extends Item{
    public PaperCup(){
        super("Paper Cup", 1, 0.00);
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    double getPrice() {
        return 0;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getCost() {
        return 0;
    }
}
