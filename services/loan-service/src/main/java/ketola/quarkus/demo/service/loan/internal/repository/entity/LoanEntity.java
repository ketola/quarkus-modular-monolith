package ketola.quarkus.demo.service.loan.internal.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Loan")
@Table(name = "loan", schema = "loan")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanEntity {

    @Id
    @GeneratedValue
    UUID id;

    @Column(name = "book_id")
    UUID bookId;

    @Column(name = "user_id")
    UUID userId;

}
