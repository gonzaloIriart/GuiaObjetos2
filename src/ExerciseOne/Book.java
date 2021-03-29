package ExerciseOne;

import ExerciseOne.Author;

import java.util.ArrayList;

public class Book {
    private String title;
    private int stock;
    private float price;
    private ArrayList<Author> authors;

    public Book(String title, int stock, float price, ArrayList<Author> authors) {
        this.title = title;
        this.stock = stock;
        this.price = price;
        this.authors = authors;
    }

    //region getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = this.authors;
    }

    //endregion

    public String printAuthorsName(){
        String authorsName = "";
        for(Author a: this.authors){
            System.out.println(a.toString());
            authorsName += a.getName() + " " + a.getSurname();
            if(!(this.authors.indexOf(a) == this.authors.size()-1)){
                authorsName += ", ";
            }
        }
        return authorsName;
    }

    public void printAuthors(){
        for(Author a: this.authors) {
            System.out.println(a.toString());
        }
    }

    @Override
    public String toString() {
        return "El libro, " + title + " de " + printAuthorsName()
                + ". Se vende a " + price + " pesos.";
    }
}
