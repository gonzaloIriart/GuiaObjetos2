package ExerciseTwo;

import java.util.UUID;

public class Item {
    private UUID id;
    private String name;
    private String description;
    private float price;

    public Item(String name, String description, float price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
    }
    //region getters and setters
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //endregion


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
