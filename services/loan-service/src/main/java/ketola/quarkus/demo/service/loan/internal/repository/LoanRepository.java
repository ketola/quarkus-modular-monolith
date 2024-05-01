package ketola.quarkus.demo.service.loan.internal.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.UUID;
import ketola.quarkus.demo.service.loan.internal.repository.entity.LoanEntity;

@ApplicationScoped
public class LoanRepository implements PanacheRepositoryBase<LoanEntity, UUID> {
}
