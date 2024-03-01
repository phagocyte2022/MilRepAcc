package org.uamil.repacc.staff.domain.vehicles;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "driving_categories")
public class DrivingCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driving_categories_id")
    private Long drivingCategoriesId;

    @OneToOne
    @JoinColumn(name = "driving_license_id")
    private DrivingLicense drivingLicense;

    @Column(name = "category_a")
    private boolean categoryA;
    @Column(name = "category_b")
    private boolean categoryB;
    @Column(name = "category_c")
    private boolean categoryC;
    @Column(name = "category_d")
    private boolean categoryD;
    @Column(name = "category_e")
    private boolean categoryE;

}
