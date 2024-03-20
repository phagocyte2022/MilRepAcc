package org.uamil.repacc.staff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uamil.repacc.staff.dto.ServicemanDTO;
import org.uamil.repacc.staff.service.ServicemanService;

import java.util.List;

@RestController
@RequestMapping("repacc/serviceman")
public class ServicemanController {

    private final ServicemanService servicemanService;

    @Autowired
    public ServicemanController(ServicemanService servicemanService){
        this.servicemanService = servicemanService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<ServicemanDTO>> getAllServicemen() {
        List<ServicemanDTO> servicemen = servicemanService.getAllServicemen();
        return ResponseEntity.ok(servicemen);
    }

}
