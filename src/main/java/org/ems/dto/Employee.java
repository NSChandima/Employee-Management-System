package org.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;
    private String roleId;
}
