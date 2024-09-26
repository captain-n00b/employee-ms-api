package com.noob.Employee.Util;

import com.noob.Employee.exception.ValidationException;
import com.noob.Employee.model.Employee;

public class Validation {
    public static void validateEmployeeDetails(Employee employee) {
        String[] emailId = employee.getEmailId().split("@");
        if (!(emailId.length == 2 && (emailId[1].contains(".com") || emailId[1].contains(".in")) )) {
            throw new ValidationException("Invalid email ID");
        }

        if (employee.getFirstName().split("[^\\w\\s]").length > 1) {
            throw new ValidationException("Invalid name, please check for spaces");
        }

        if (employee.getLastName().split("[^\\w\\s]").length > 1) {
            throw new ValidationException("Invalid name, please check for spaces");
        }

    }
}
