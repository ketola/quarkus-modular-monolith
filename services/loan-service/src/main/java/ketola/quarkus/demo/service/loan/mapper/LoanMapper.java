package ketola.quarkus.demo.service.loan.mapper;

import ketola.quarkus.demo.service.loan.domain.Loan;
import ketola.quarkus.demo.service.loan.internal.repository.entity.LoanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface LoanMapper {

    Loan toLoan(LoanEntity bookEntity);
}
