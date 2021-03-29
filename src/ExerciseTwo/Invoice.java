package ExerciseTwo;

import java.time.LocalDate;

public class Invoice {
    private float amount;
    private LocalDate date;
    private Client client;

    public Invoice(float amount, Client client) {
        this.amount = calculateFinalAmount(amount, client.getDiscountPer());
        this.client = client;
        this.date = LocalDate.now();
    }

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

    private float calculateFinalAmount(float amount, float discount){
        return amount - (amount * discount);
    }
}
