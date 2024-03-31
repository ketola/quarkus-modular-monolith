package ketola.quarkus.demo.service.book;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import ketola.quarkus.demo.service.book.domain.Book;
import ketola.quarkus.demo.service.book.internal.repository.BookRepository;
import ketola.quarkus.demo.service.book.mapper.BookMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@AllArgsConstructor
@Slf4j
public class BookService {

    BookRepository bookRepository;

    BookMapper bookMapper;

    public List<Book> findAllBooks() {
        return bookRepository.findAll().list().stream().map(bookMapper::toBook).toList();
    }
}
