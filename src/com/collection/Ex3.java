package com.collection;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Book> als = new ArrayList<Book>();
        Book b1 = new Book(100, "DSP", "shenba", "sastra", 20);
        Book b2 = new Book(200, "karuthama", "kalki", "vijayan", 2000);
        als.add(b1);
        als.add(b2);


        for (Book b : als) {
            System.out.println(b.id+ "  " +b.name+ "  " +b.author_name+ "  " +b.publisher_name+ "  " +b.quantity);
        }

    }
}
