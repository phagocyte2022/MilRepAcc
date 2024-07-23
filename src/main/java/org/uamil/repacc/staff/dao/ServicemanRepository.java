package org.uamil.repacc.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.Serviceman;
import org.uamil.repacc.staff.dto.ServicemanBasicDTO;

import java.util.List;

@Repository
public interface ServicemanRepository extends JpaRepository<Serviceman, Long> {
    List<Serviceman> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(String firstName, String lastName);

    @Query("SELECT new org.uamil.repacc.staff.dto.ServicemanBasicDTO(s.id, s.lastName, s.firstName) FROM Serviceman s")
    List<ServicemanBasicDTO> findAllBasicInfo();
}

