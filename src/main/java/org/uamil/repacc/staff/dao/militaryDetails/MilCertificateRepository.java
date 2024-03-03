package org.uamil.repacc.staff.dao.militaryDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.militaryDetails.MilCertificate;

@Repository
public interface MilCertificateRepository extends JpaRepository<MilCertificate, Long> {
}