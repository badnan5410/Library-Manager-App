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

    public Book searchBook(String title, String author) {

        for (Book target: books) {
            if (title.equals(target.title) && author.equals(target.author)) {
                return target;
            }
        }

        return null;
    }

}
