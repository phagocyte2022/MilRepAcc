package org.uamil.repacc.staff.dao.religion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.religion.Religion;

@Repository
public interface ReligionRepository extends JpaRepository<Religion, Long> {
}