package com.rct.payroll.core.model.dto.hr

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

data class Employer(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val color: Color,
    val sex: Sex,
    val birthdayDate: LocalDateTime,
    val hiringDate: LocalDateTime,
    val actualDepartment: Department,
    val actualSalary: BigDecimal,
    val departmentHistory: List<EmployerHistoric> = listOf(),
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
    data class EmployerHistoric(
        val id: UUID,
        val employerId: UUID,
        val departmentId: UUID,
        val current: Boolean = true,
        val salary: BigDecimal,
        val createdAt: LocalDateTime = LocalDateTime.now(),
        val updatedAt: LocalDateTime? = null,
    )
}