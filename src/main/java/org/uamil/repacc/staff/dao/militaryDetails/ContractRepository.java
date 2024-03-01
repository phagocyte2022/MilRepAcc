package org.uamil.repacc.staff.dao.militaryDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.militaryDetails.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}