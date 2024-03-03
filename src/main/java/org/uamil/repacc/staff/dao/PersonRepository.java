package org.uamil.repacc.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}