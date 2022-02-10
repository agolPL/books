package pl.acme.books.book.domain;

import java.util.UUID;

class Book {

    private UUID id;
    private String tittle;
    private Integer ageLimit;

    Book(String tittle, Integer ageLimit) {
        id = UUID.randomUUID();
        this.tittle = tittle;
        this.ageLimit = ageLimit;
    }

    UUID getId() {
        return id;
    }

}
