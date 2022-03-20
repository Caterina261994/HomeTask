package com.netcracker.oop1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Book {

    private String name;

    private Author[] authors;

    private double price;

    private int qty = 0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authors = Arrays.stream(getAuthors()).map(Author::toString).collect(Collectors.joining(", "));
        return "Book[name = " + name + ", authors = {" + authors + "}, price = " + price + ", qty = " + qty;
    }

    public String getAuthorName(){
        return Arrays.stream(getAuthors()).map(Author::getName).collect(Collectors.joining(", "));
    }

    class Author{

        private String name;

        private String email;

        private char gender;

        private String getName(){
            return name;
        }
        @Override
        public String toString() {
            return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
        }
    }
}
