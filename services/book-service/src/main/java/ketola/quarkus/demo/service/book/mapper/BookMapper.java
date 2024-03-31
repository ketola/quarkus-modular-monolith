package ketola.quarkus.demo.service.book.mapper;

import ketola.quarkus.demo.service.book.domain.Book;
import ketola.quarkus.demo.service.book.internal.repository.entity.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface BookMapper {

    Book toBook(BookEntity bookEntity);
}
