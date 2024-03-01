package org.uamil.repacc.staff.dao.professional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.professional.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
}