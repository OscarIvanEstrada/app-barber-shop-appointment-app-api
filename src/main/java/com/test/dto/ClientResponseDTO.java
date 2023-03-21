package com.test.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "ClientResponseDTO Description")
public class ClientResponseDTO {

    @ApiModelProperty(value = "Data Exmaple for ClientResponseDTO", required = true, example = "clientName")
    private String clientName;

    @ApiModelProperty(value = "Data Exmaple for ClientResponseDTO", required = true, example = "phoneNumber")
    private String phoneNumber;

}
