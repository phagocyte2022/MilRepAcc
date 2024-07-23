package org.uamil.repacc.staff.service;

import org.uamil.repacc.staff.dto.ServicemanDTO;
import java.util.List;

public interface ServicemanService {
    List<ServicemanDTO> getAllServicemen();
    List<ServicemanDTO> getFilteredServicemen(String firstName, String lastName);
    ServicemanDTO getServicemanById(Long id);
    ServicemanDTO createServiceman(ServicemanDTO servicemanDTO);
    ServicemanDTO updateServiceman(Long id, ServicemanDTO servicemanDTO);
    void deleteServiceman(Long id);
}
