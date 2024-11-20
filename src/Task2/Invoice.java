package Task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Invoice {
    Order order;

    public Invoice(Order order) {
        this.order = order;
        order.calculate();
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    void generateInvoice(){
        StringBuilder builder = new StringBuilder();
        builder.append("Ice Cream Shop Invoice").append(System.lineSeparator());
        for(Flavour fl: order.flavours){
            builder.append(fl.getName()).append(" - ").append(fl.getCount()).append(" Scoop: $").append(fl.getPrice()).append(System.lineSeparator());
        }
        for(Toppings tp: order.toppings){
            builder.append(tp.getName()).append(" - ").append(tp.getCount()).append(" Times: $").append(tp.getPrice()).append(System.lineSeparator());
        }

        builder.append("SubTotal: $").append(order.amount).append(System.lineSeparator());
        builder.append("Tax : $").append(order.tax).append(System.lineSeparator());
        builder.append("Total Amount due: $").append(order.totalPrice).append(System.lineSeparator());


        try{

            BufferedWriter out = new BufferedWriter(new FileWriter("src/Task2/invoice.txt"));
            out.write(builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
