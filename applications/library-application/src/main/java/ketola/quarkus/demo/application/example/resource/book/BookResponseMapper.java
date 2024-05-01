package ketola.quarkus.demo.application.example.resource.book;

import ketola.quarkus.demo.application.example.resource.book.response.BookResponse;
import ketola.quarkus.demo.service.book.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface BookResponseMapper {
    BookResponse toBookResponse(Book book);
}
