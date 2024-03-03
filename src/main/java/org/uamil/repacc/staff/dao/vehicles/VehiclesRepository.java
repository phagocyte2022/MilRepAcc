package org.uamil.repacc.staff.dao.vehicles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.vehicles.Vehicles;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, Long> {
}