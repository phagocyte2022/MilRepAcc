package org.uamil.repacc.staff.dao.vehicles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.vehicles.DrivingDetails;

public interface DrivingDetailsRepository extends JpaRepository<DrivingDetails, Long> {
}