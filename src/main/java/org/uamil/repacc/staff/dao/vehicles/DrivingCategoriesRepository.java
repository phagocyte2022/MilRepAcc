package org.uamil.repacc.staff.dao.vehicles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uamil.repacc.staff.domain.vehicles.DrivingCategories;

public interface DrivingCategoriesRepository extends JpaRepository<DrivingCategories, Long> {
}