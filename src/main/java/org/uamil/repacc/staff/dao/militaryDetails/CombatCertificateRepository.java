package org.uamil.repacc.staff.dao.militaryDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.militaryDetails.CombatCertificate;

@Repository
public interface CombatCertificateRepository extends JpaRepository<CombatCertificate, Long> {
}