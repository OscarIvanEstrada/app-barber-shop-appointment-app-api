package com.test.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "AppointmentRequestDTO Description")
public class AppointmentRequestDTO {

    @ApiModelProperty(value = "Data Exmaple for AppointmentRequestDTO", required = true, example = "clientName")
    private String clientName;
	
    @ApiModelProperty(value = "Data Exmaple for AppointmentRequestDTO", required = true, example = "2023-01-15")
    private Date appointmentTime;
	
    @ApiModelProperty(value = "Data Exmaple for AppointmentRequestDTO", required = true, example = "barberName")
    private String barberName;
	
    @ApiModelProperty(value = "Data Exmaple for AppointmentRequestDTO", required = true, example = "serviceType")
    private String serviceType;
	
}
