package org.uamil.repacc.staff.dao.family;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.family.Relatives;

public interface RelativesRepository extends JpaRepository<Relatives, Long> {
}