package com.adityamshidlyali.SpringBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;

    @NotBlank(message = "Please add Department Name")
//    @Length(max = 5, min = 1)
//    @Size(max = 2, min = 4)
//    @Email
//    @Positive
//    @Negative
//    @PositiveOrZero
//    @Future
//    @Future
//    @FutureOrPresent
//    @Past
//    @PastOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
