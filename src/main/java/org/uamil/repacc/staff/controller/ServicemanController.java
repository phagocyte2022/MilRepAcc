package org.uamil.repacc.staff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/id/{id}")
    public ServicemanDTO getStudentById(@PathVariable Long id) {
        return servicemanService.getServicemanById(id);
    }
}
