package com.collection;

public class Book {
    int id;
    String name,author_name,publisher_name;
    int quantity;
    Book(int id,String name,String author_name,String publisher_name,int quantity){
        this.id=id;
        this.name=name;this.author_name=author_name;this.publisher_name=publisher_name;
        this.quantity=quantity;
    }
}
