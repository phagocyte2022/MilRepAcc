package org.uamil.repacc.staff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uamil.repacc.staff.dao.ServicemanRepository;
import org.uamil.repacc.staff.domain.Serviceman;
import org.uamil.repacc.staff.dto.ServicemanDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServicemanServiceImpl implements ServicemanService{

    private final ServicemanRepository servicemanRepository;

    @Autowired
    public ServicemanServiceImpl(ServicemanRepository servicemanRepository) {
        this.servicemanRepository = servicemanRepository;
    }

    public ServicemanDTO getServicemanById(Long id) {
        Optional<Serviceman> servicemanOptional = servicemanRepository.findById(id);
        if (servicemanOptional.isPresent()) {
            return convertToDTO(servicemanOptional.get());
        }
        throw new RuntimeException("Serviceman not found with id: " + id);
    }

    public ServicemanDTO createServiceman(ServicemanDTO servicemanDTO) {
        Serviceman serviceman = convertToEntity(servicemanDTO);
        Serviceman savedServiceman = servicemanRepository.save(serviceman);
        return convertToDTO(savedServiceman);
    }

    @Override
    public ServicemanDTO updateStudent(Long id, ServicemanDTO servicemanDTO) {
        return null;
    }

    @Override
    public void deleteServiceman(Long id) {

    }

    private ServicemanDTO convertToDTO(Serviceman serviceman) {
        ServicemanDTO servicemanDTO = new ServicemanDTO();
        servicemanDTO.setPersonId(serviceman.getPersonId());
        servicemanDTO.setLastName(serviceman.getLastName());
        servicemanDTO.setFirstName(serviceman.getFirstName());
        servicemanDTO.setMiddleName(serviceman.getMiddleName());
        servicemanDTO.setBirthDate(serviceman.getBirthDate());
        servicemanDTO.setTaxCode(serviceman.getTaxCode());
        servicemanDTO.setAddresses(serviceman.getAddress());
        servicemanDTO.setPhoneNumbers(serviceman.getPhoneNumber());
        servicemanDTO.setPassports(serviceman.getPassport());
        servicemanDTO.setEducations(serviceman.getEducation());
        servicemanDTO.setJobs(serviceman.getJobList());
        servicemanDTO.setRelatives(serviceman.getRelatives());
        servicemanDTO.setMilitaryDetails(serviceman.getMilitaryDetails());
        servicemanDTO.setBloodType(serviceman.getBloodType());
        servicemanDTO.setReligions(serviceman.getReligion());
        servicemanDTO.setDrivingDetails(serviceman.getDrivingDetails());

        return servicemanDTO;
    }

    private Serviceman convertToEntity(ServicemanDTO servicemanDTO) {
        Serviceman serviceman = new Serviceman();
        serviceman.setPersonId(servicemanDTO.getPersonId());
        serviceman.setLastName(servicemanDTO.getLastName());
        serviceman.setFirstName(servicemanDTO.getFirstName());
        serviceman.setMiddleName(servicemanDTO.getMiddleName());
        serviceman.setBirthDate(servicemanDTO.getBirthDate());
        serviceman.setTaxCode(servicemanDTO.getTaxCode());
        serviceman.setAddress(servicemanDTO.getAddresses());
        serviceman.setPhoneNumber(servicemanDTO.getPhoneNumbers());
        serviceman.setPassport(servicemanDTO.getPassports());
        serviceman.setEducation(servicemanDTO.getEducations());
        serviceman.setJobList(servicemanDTO.getJobs());
        serviceman.setRelatives(servicemanDTO.getRelatives());
        serviceman.setMilitaryDetails(servicemanDTO.getMilitaryDetails());
        serviceman.setBloodType(servicemanDTO.getBloodType());
        serviceman.setReligion(servicemanDTO.getReligions());
        serviceman.setDrivingDetails(servicemanDTO.getDrivingDetails());

        return serviceman;
    }

    public List<ServicemanDTO> getAllServicemen() {
        List<Serviceman> servicemen = servicemanRepository.findAll();
        return servicemen.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
