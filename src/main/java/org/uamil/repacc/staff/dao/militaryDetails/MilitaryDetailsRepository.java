package org.uamil.repacc.staff.dao.militaryDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.militaryDetails.MilitaryDetails;

public interface MilitaryDetailsRepository extends JpaRepository<MilitaryDetails, Long> {
}