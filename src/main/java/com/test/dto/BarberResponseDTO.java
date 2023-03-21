package com.test.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "BarberResponseDTO Description")
public class BarberResponseDTO {

    @ApiModelProperty(value = "Data Exmaple for BarberResponseDTO", required = true, example = "barberName")
    private String barberName;

    @ApiModelProperty(value = "Data Exmaple for BarberResponseDTO", required = true, example = "phoneNumber")
    private String phoneNumber;

}
