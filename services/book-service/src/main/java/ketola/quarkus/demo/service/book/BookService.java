package ketola.quarkus.demo.service.book;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import ketola.quarkus.demo.service.book.domain.Book;
import ketola.quarkus.demo.service.book.internal.repository.BookRepository;
import ketola.quarkus.demo.service.book.internal.repository.entity.BookEntity;
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

    public Optional<Book> findBookById(UUID id) {
        return bookRepository.findByIdOptional(id).map(bookMapper::toBook);
    }

    @Transactional
    public Book addBook(String name) {
        BookEntity bookEntity = BookEntity.builder()
            .name(name)
            .build();
        bookRepository.persist(bookEntity);
        return bookMapper.toBook(bookEntity);
    }
}
