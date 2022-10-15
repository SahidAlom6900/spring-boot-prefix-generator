package com.technoelevate.generator.entity;

import static com.technoelevate.generator.seq_gen.StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER;
import static com.technoelevate.generator.seq_gen.StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER;
import static org.hibernate.id.enhanced.SequenceStyleGenerator.INCREMENT_PARAM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_info")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    @GenericGenerator(name = "emp_seq", strategy = "com.technoelevate.generator.seq_gen.StringPrefixedSequenceIdGenerator",
            parameters = {
            @Parameter(name = INCREMENT_PARAM, value = "50"),
            @Parameter(name = VALUE_PREFIX_PARAMETER, value = "TYC"),
            @Parameter(name = NUMBER_FORMAT_PARAMETER, value = "%05d") })
    private String empid;
    private String empname;
    private String empcontact;
    private String empemail;
    private String empphoto;

}
