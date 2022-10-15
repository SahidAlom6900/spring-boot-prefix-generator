package com.technoelevate.generator.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@JsonInclude(value = Include.,content = Include.NON_NULL)
public class EmployeeDto {
	private String empid;
    private String empname;
    private String empcontact;
    private String empemail;
    private String empphoto;
}
