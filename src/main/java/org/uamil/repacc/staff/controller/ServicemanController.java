package org.uamil.repacc.staff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.uamil.repacc.staff.dto.ServicemanBasicDTO;
import org.uamil.repacc.staff.dto.ServicemanDTO;
import org.uamil.repacc.staff.service.ServicemanService;

import java.util.List;

@RestController
@RequestMapping("repacc/serviceman")
public class ServicemanController {

    @Autowired
    private ServicemanService servicemanService;

    @GetMapping("/list")
    public ResponseEntity<List<ServicemanDTO>> getAllServicemen() {
        List<ServicemanDTO> servicemen = servicemanService.getAllServicemen();
        return ResponseEntity.ok(servicemen);
    }

    @GetMapping("/listbasic")
    public ResponseEntity<List<ServicemanBasicDTO>> getAllServicemenBasicInfo() {
        List<ServicemanBasicDTO> servicemanBasic = servicemanService.getAllServicemenBasicInfo();
        return ResponseEntity.ok(servicemanBasic);
    }

    @GetMapping("/id/{id}")
    public ServicemanDTO getStudentById(@PathVariable Long id) {
        return servicemanService.getServicemanById(id);
    }

    @GetMapping("/filter")
    public List<ServicemanDTO> getFilteredServicemen(@RequestParam String firstName, @RequestParam String lastName) {
        return servicemanService.getFilteredServicemen(firstName, lastName);
    }
}
