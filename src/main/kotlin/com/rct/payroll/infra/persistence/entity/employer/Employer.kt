package com.rct.payroll.infra.persistence.entity.employer

import com.rct.payroll.core.model.dto.hr.Color
import com.rct.payroll.core.model.dto.hr.Sex
import com.rct.payroll.infra.persistence.entity.hr.Department
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*
import javax.persistence.EnumType.STRING
import javax.persistence.GenerationType.AUTO

@Entity
data class Employer(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID = UUID.randomUUID(),
    val name: String,
    @Enumerated(STRING)
    val color: Color,
    @Enumerated(STRING)
    val sex: Sex,
    val birthdayDate: LocalDateTime,
    val hiringDate: LocalDateTime,
    @OneToOne
    val actualDepartment: Department,
    val actualSalary: BigDecimal,
    @OneToMany
    val departmentHistory: List<EmployerHistoric> = listOf(),
    @OneToMany
    val payrollHistory: List<PayrollEmployer> = listOf(),
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)