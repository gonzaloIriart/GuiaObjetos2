package ExerciseOne;

import java.util.ArrayList;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        Author jBlock = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(jBlock.toString());
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(jBlock);
        Book eJava = new Book("Effective Java", 150, 450f, authors);
        System.out.println(eJava.toString());
        eJava.setPrice(500f);
        eJava.setPrice(eJava.getPrice() + 50);

        eJava.printAuthors();
        System.out.println(eJava.toString());
    }
}
