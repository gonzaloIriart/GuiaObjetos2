package ExerciseTwo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Invoice {
    private UUID id;
    private float amount;
    private float finalAmount;
    private LocalDate date;
    private Client client;
    private ArrayList<Item> products;

    public Invoice( Client client, ArrayList<Item> products) {
        this.id = UUID.randomUUID();
        this.client = client;
        this.date = LocalDate.now();
        this.products = products;
        this.amount = addAmounts();
        this.finalAmount = calculateFinalAmount(client.getDiscountPer());

    }

    //region getters and setters
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Item> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Item> products) {
        this.products = products;
    }
//endregion

    private float calculateFinalAmount(float discount){
        return this.amount - (this.amount * discount);
    }

    private float addAmounts(){
        float itemsAmount = 0;
        for(Item i: this.products){
            itemsAmount += i.getPrice();
        }
        return itemsAmount;
    }

    private String getItemsInfo(){
        String itemsInfo = "Products detail: [ \n\t\t";
        for(Item i: this.products){
            itemsInfo += (i.toString());
            if(!(this.products.indexOf(i) == this.products.size()-1)){
                itemsInfo += (", \n\t\t");
            }
        }
        itemsInfo += "\n\t]";
        return itemsInfo;
    }

    @Override
    public String toString() {
        return "Invoice {" +
                "\n\tid: " + this.id +
                "\n\tfinal amount: " + amount +
                " - " + client.getDiscountPer() * amount +
                " = " + finalAmount +
                "\n\tdate: " + date +
                "\n\t" + client.toString() +
                "\n\t" + getItemsInfo() +
                "\n}";
    }
}
