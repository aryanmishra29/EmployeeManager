package com.aryancodes.employeeservice.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
