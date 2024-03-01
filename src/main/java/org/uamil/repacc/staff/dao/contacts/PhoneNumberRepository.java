package org.uamil.repacc.staff.dao.contacts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.contacts.PhoneNumber;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
}