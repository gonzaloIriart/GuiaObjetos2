package ExerciseTwo;

import java.util.ArrayList;

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2\n");

        Client client = new Client("Gonzalo", "gonzaloiriart@gmail.com", 0.12f);
        System.out.println(client.toString());
        ArrayList<Item> products = new ArrayList<>();
        products.add(new Item("Coca-cola" , "Botella plastica, 2.25L", 85f));
        products.add(new Item("Hamburguesa" , "con papas medianas", 250f));
        Invoice invoice = new Invoice( client, products);
        System.out.println(invoice.toString());
    }
}
