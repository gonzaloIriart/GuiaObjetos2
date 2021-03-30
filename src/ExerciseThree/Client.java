package ExerciseThree;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private char gender;

    public Client(String name, char gender) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
