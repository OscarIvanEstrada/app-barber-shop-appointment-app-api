package com.test.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "BarberRequestDTO Description")
public class BarberRequestDTO {

    @ApiModelProperty(value = "Data Exmaple for BarberRequestDTO", required = true, example = "barberName")
    private String barberName;
	
    @ApiModelProperty(value = "Data Exmaple for BarberRequestDTO", required = true, example = "phoneNumber")
    private String phoneNumber;
	
}
