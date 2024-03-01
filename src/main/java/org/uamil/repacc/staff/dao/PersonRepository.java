package org.uamil.repacc.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}