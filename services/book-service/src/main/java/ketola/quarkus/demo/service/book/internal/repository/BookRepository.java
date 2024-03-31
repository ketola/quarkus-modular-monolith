package ketola.quarkus.demo.service.book.internal.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.UUID;
import ketola.quarkus.demo.service.book.internal.repository.entity.BookEntity;

@ApplicationScoped
public class BookRepository implements PanacheRepositoryBase<BookEntity, UUID> {
}
