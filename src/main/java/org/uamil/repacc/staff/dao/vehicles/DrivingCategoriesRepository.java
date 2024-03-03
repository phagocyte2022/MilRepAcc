package org.uamil.repacc.staff.dao.vehicles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uamil.repacc.staff.domain.vehicles.DrivingCategories;

@Repository
public interface DrivingCategoriesRepository extends JpaRepository<DrivingCategories, Long> {
}