package org.uamil.repacc.staff.dao.religion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.religion.Religion;

public interface ReligionRepository extends JpaRepository<Religion, Long> {
}