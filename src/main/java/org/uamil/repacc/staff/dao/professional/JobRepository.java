package org.uamil.repacc.staff.dao.professional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.professional.Jobs;

@Repository
public interface JobRepository extends JpaRepository<Jobs, Long> {
}