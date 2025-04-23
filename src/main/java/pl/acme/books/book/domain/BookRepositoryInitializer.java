package pl.acme.books.book.domain;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class BookRepositoryInitializer {

    private final BookRepository bookRepository;

    @PostConstruct
    void createBooks() {
        bookRepository.save(new Book("Misery", 18));
        bookRepository.save(new Book("Smurfs", 3));
    }

}
