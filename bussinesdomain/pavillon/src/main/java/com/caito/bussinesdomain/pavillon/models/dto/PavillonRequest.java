package com.caito.bussinesdomain.pavillon.models.dto;

import com.caito.bussinesdomain.pavillon.constants.ErrorMessages;
import com.caito.bussinesdomain.pavillon.models.Address;
import com.caito.bussinesdomain.pavillon.models.enums.BlackboardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PavillonRequest {

    @NotNull(message = ErrorMessages.MSG_PAVILLON_EMPTY)
    @NotNull(message = ErrorMessages.MSG_PAVILLON_NULL)
    @Size(max = 80, message = ErrorMessages.MSG_PAVILLON_NAME_MAX)
    private String name;
    @Embedded
    private Address address;
    @NotNull
    @NotBlank
    private BlackboardType blackboardType;
}
