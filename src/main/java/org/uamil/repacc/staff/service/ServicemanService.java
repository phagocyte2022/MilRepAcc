package org.uamil.repacc.staff.service;

import org.uamil.repacc.staff.dto.ServicemanDTO;
import java.util.List;

public interface ServicemanService {
    List<ServicemanDTO> getAllServicemen();
    ServicemanDTO getServicemanById(Long id);
    ServicemanDTO createServiceman(ServicemanDTO servicemanDTO);
    ServicemanDTO updateStudent(Long id, ServicemanDTO servicemanDTO);
    void deleteServiceman(Long id);
}
