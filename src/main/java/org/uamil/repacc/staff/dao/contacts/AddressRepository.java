package org.uamil.repacc.staff.dao.contacts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.contacts.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}