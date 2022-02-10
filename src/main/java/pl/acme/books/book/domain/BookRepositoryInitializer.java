package pl.acme.books.book.domain;

import lombok.RequiredArgsConstructor;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
class BookRepositoryInitializer {

    private final BookRepository bookRepository;

    @PostConstruct
    void createBooks() {
        bookRepository.save(new Book("Misery", 18));
        bookRepository.save(new Book("Smurfs", 3));
    }

}
