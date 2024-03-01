package org.uamil.repacc.staff.dao.vehicles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.vehicles.DrivingLicense;

public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense, Long> {
}