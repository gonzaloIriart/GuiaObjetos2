package ExerciseTwo;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private float discountPer;

    public Client(String name, String email, float discountPer) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discountPer = discountPer;
    }
    //region getters and setters
    public float getDiscountPer() {
        return this.discountPer;
    }
    //endregion

    @Override
    public String toString() {
        return "Cliente { " +
                "\n\tid: " + this.id +
                "\n\tnombre: " + this.name +
                "\n\temail: " + this.email +
                "\n\tdescuento: " + this.discountPer * 100 + "%" +
        "\n}";
    }
}
