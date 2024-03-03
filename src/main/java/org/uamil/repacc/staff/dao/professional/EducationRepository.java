package org.uamil.repacc.staff.dao.professional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.professional.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}