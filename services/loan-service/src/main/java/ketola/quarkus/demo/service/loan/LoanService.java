package ketola.quarkus.demo.service.loan;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import ketola.quarkus.demo.service.loan.domain.Loan;
import ketola.quarkus.demo.service.loan.internal.repository.LoanRepository;
import ketola.quarkus.demo.service.loan.internal.repository.entity.LoanEntity;
import ketola.quarkus.demo.service.loan.mapper.LoanMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@AllArgsConstructor
@Slf4j
public class LoanService {

    LoanRepository loanRepository;

    LoanMapper loanMapper;

    @Transactional
    public Loan addLoan(UUID bookId, UUID userId) {
        LoanEntity loanEntity = LoanEntity.builder()
            .bookId(bookId)
            .userId(userId)
            .build();
        loanRepository.persist(loanEntity);
        return loanMapper.toLoan(loanEntity);
    }

    public List<Loan> findAllLoans() {
        return loanRepository.findAll().stream().map(loanMapper::toLoan).toList();
    }
}
