package pl.acme.books.book.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class BookRepository {

    private final Map<UUID, Book> books = new HashMap<>();

    void save(Book book) {
        books.put(book.getId(), book);
    }

}
