package com.test.business;
 
import com.test.repository.*;
import com.test.dto.*;
import com.test.model.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.test.util.GSonUtils;
import com.test.util.LoggerUtil;

import java.util.ArrayList;
import java.util.List;


@Component
public class ControllerBusiness {

	@Autowired
	LoggerUtil log;



   
	@Autowired
    AppointmentRepository appointmentRepository;

	public void addDataAppointment(AppointmentEntity data) {
		appointmentRepository.save(data);
	}

	public List<AppointmentEntity> getDataAppointment() {
		List<AppointmentEntity> result = new ArrayList<AppointmentEntity>();
		appointmentRepository.findAll().forEach((final AppointmentEntity r) -> result.add(r));
		return result;
	}
   
	@Autowired
    BarberRepository barberRepository;

	public void addDataBarber(BarberEntity data) {
		barberRepository.save(data);
	}

	public List<BarberEntity> getDataBarber() {
		List<BarberEntity> result = new ArrayList<BarberEntity>();
		barberRepository.findAll().forEach((final BarberEntity r) -> result.add(r));
		return result;
	}
   
	@Autowired
    ClientRepository clientRepository;

	public void addDataClient(ClientEntity data) {
		clientRepository.save(data);
	}

	public List<ClientEntity> getDataClient() {
		List<ClientEntity> result = new ArrayList<ClientEntity>();
		clientRepository.findAll().forEach((final ClientEntity r) -> result.add(r));
		return result;
	}





}
