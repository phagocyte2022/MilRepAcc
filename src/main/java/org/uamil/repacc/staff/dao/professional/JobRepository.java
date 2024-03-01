package org.uamil.repacc.staff.dao.professional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.professional.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}