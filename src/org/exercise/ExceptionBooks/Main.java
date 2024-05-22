package org.exercise.ExceptionBooks;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for book: ");

            try {
                System.out.println("Title: ");
                String title = scanner.nextLine();

                System.out.println("Number of pages: ");
                int numPages = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Author: ");
                String author = scanner.nextLine();

                System.out.println("Publisher: ");
                String publisher = scanner.nextLine();

                books[i] = new Book(title, numPages, author, publisher);
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage() + ", please try again");
                i--;
            }
        }


        File file = new File("./resources/books.txt");

        if (file.exists()){
            try {
                FileWriter fileWriter = new FileWriter(file);
//
                for (Book book : books){
                    fileWriter.write(book.toString());
                }
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
            try {
                scanner = new Scanner(file);

                System.out.println("\n Dal file : ");
                while (scanner.hasNextLine()){
                    String data = scanner.nextLine();
                    System.out.println(data);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
