package ketola.quarkus.demo.service.loan.domain;

import java.util.UUID;

public record Loan(UUID id, UUID bookId, UUID userId) {
}
