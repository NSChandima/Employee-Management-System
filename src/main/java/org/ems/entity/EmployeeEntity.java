package org.ems.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "employee_details")

public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;
    private String roleId;
}
