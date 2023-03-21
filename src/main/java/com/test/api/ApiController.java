package com.test.api;


import com.test.util.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.test.business.ControllerBusiness;

import com.test.dto.*;
import com.test.model.*;
import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Accion exitosa"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})
@Api(value = "app-barber-shop-appointment-app-api ApiController", description = "Barber shop appointment application.",  tags = {"",""})
public class ApiController {

    @Autowired
    ControllerBusiness controllerBusiness;

	@Value("${spring.application.version}")
	private String version;

	@GetMapping("version")
    public ResponseEntity<String> version() {
        return new ResponseEntity(version, HttpStatus.OK);
    }




	@ApiOperation(value = "Obtener lista de Appointment", notes = "Retorna listado de Appointment del sistema xxxxx")
	@GetMapping("appointment")
    public List<AppointmentResponseDTO> getAppointment() {
       return MapperUtil.mapAll(controllerBusiness.getDataAppointment(),AppointmentResponseDTO.class);
    }

	@PostMapping("appointment")
    public ResponseEntity<AppointmentRequestDTO> putAppointment(@RequestBody AppointmentRequestDTO dto) {
		
		AppointmentEntity data = MapperUtil.map(dto,AppointmentEntity.class);
	    controllerBusiness.addDataAppointment(data);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

	@ApiOperation(value = "Obtener lista de Barber", notes = "Retorna listado de Barber del sistema xxxxx")
	@GetMapping("barber")
    public List<BarberResponseDTO> getBarber() {
       return MapperUtil.mapAll(controllerBusiness.getDataBarber(),BarberResponseDTO.class);
    }

	@PostMapping("barber")
    public ResponseEntity<BarberRequestDTO> putBarber(@RequestBody BarberRequestDTO dto) {
		
		BarberEntity data = MapperUtil.map(dto,BarberEntity.class);
	    controllerBusiness.addDataBarber(data);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

	@ApiOperation(value = "Obtener lista de Client", notes = "Retorna listado de Client del sistema xxxxx")
	@GetMapping("client")
    public List<ClientResponseDTO> getClient() {
       return MapperUtil.mapAll(controllerBusiness.getDataClient(),ClientResponseDTO.class);
    }

	@PostMapping("client")
    public ResponseEntity<ClientRequestDTO> putClient(@RequestBody ClientRequestDTO dto) {
		
		ClientEntity data = MapperUtil.map(dto,ClientEntity.class);
	    controllerBusiness.addDataClient(data);
        return new ResponseEntity(dto, HttpStatus.OK);
    }








}
