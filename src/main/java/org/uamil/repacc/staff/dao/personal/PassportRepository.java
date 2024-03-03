package org.uamil.repacc.staff.dao.personal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.personal.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {
}