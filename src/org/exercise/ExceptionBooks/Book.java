package org.exercise.ExceptionBooks;

public class Book {
    private String title;
    private int numPages = 0;
    private String writer;
    private String publisher;

    //    COSTRUTTORE
    public Book(String title, int numPages, String writer, String publisher) {
         setTitle(title);
        this.numPages = numPages;
        this.writer = writer;
        this.publisher = publisher;
    }


//    VERIFY SETTER

    private void checkString(String variable) throws IllegalArgumentException {
        try {
            if (!variable.isEmpty()) {
                this.title = variable;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Stringa non accettata!");

        }

    }

    //    SETTER
    public void setTitle(String title) {
        checkString(title);
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setWriter(String writer) {
        checkString(writer);
    }

    public void setPublisher(String publisher) {
        checkString(publisher);
    }

}
