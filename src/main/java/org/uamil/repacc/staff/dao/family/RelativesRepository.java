package org.uamil.repacc.staff.dao.family;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.family.Relatives;

@Repository
public interface RelativesRepository extends JpaRepository<Relatives, Long> {
}