package org.uamil.repacc.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.Serviceman;

public interface ServicemanRepository extends JpaRepository<Serviceman, Long> {
}