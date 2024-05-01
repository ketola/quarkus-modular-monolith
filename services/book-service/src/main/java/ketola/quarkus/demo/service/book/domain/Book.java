package ketola.quarkus.demo.service.book.domain;

import java.util.UUID;

public record Book(UUID id, String name) {
}
