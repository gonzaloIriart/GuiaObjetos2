package ExerciseThree;

import java.util.ArrayList;
import java.util.UUID;

public class Account {
    private UUID id;
    private float balance;
    private Client client;
    private ArrayList<String> register;

    public Account(float balance, Client client) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
        this.register = new ArrayList<>();
    }

    public void deposit(float amount){
        if(this.register.size() < 10)
        {
            this.balance += amount;
            this.register.add("El cliente " + this.client.getName() + "deposito " + amount + ".");
        }else {
            System.out.println("Registro de operaciones completo.\n");
        }

    }

    public void extract(float amount){

        if(this.balance - amount > -2000 && this.register.size() < 10){
            this.balance -= amount;
            this.register.add("El cliente " + this.client.getName() + "retiro " + amount + ".");
        }else if(this.register.size() == 10){
            System.out.println("Registro de operaciones completo.\n");
        }
        else {
            System.out.println("Saldo insuficiente.\n");
        }
    }

    public void showBalance(){
        System.out.println("Balance: $ " + this.balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                "\n" + client.toString() +
                '}';
    }
}
