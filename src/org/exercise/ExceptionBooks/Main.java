package org.exercise.ExceptionBooks;

public class Main {
    public static void main(String[] args) {
        Book book;
        try {
             book = new Book("asd",25,"adsadasd","asdasd");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
