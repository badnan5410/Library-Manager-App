package main;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private int nextBookId = 1;
    private int adminId;

    public Library(int adminId) {
        this.adminId = adminId;
    }

    public Book getBook(String title, String author) {

        for (Book target: books) {
            if (title.equals(target.getTitle()) && author.equals(target.getAuthor())) {
                return target;
            }
        }

        return null;
    }

    public boolean checkBookExists(String title, String author) {
        return getBook(title, author) != null;
    }

    public void addBook(String title, String author, List<String> genre) {

        if (checkBookExists(title, author)) {
            Book b = getBook(title, author);
            b.increaseQuantity();

        } else {
            books.add(new Book(nextBookId, title, author, genre));
            nextBookId++;
        }
    }

    public void listAllBooks() {

        if (!books.isEmpty()) {
            for (Book b: books) {
                System.out.printf("| ID: %d | Title: %s by %s | Genre(s): %s | Quantity:  %d/%d |", b.getId(), b.getTitle(), b.getAuthor(), formatGenre(b.getGenre()), b.getQuantity(), b.getTotalQuantity());
                System.out.println();
            }

        } else {
            System.out.println("\n\nlibrary is empty...\n\n");
        }
    }

    private String formatGenre(List<String> genres) {

        if (genres == null || genres.isEmpty()) {
            return "";
        }

        String formattedGenre = "";

        for (String genre: genres) {
            formattedGenre += genre + ", ";
        }

        formattedGenre = formattedGenre.substring(0, formattedGenre.length() - 2);
        return formattedGenre;
    }
}
