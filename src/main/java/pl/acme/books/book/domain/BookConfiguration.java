package pl.acme.books.book.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BookConfiguration {

    @Bean
    BookRepository repository() {
        return new BookRepository();
    }

    @Bean
    BookRepositoryInitializer bookRepositoryInitializer(BookRepository bookRepository) {
        return new BookRepositoryInitializer(bookRepository);
    }

}
