package org.uamil.repacc.staff.dao.personal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.personal.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long> {
}