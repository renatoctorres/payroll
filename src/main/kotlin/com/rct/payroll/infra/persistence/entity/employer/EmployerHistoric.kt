package com.rct.payroll.infra.persistence.entity.employer

import com.rct.payroll.infra.persistence.entity.hr.Department
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*

@Entity
data class EmployerHistoric(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    @ManyToOne
    val employer: Employer,
    @OneToOne
    val department: Department,
    val current: Boolean = true,
    val salary: BigDecimal,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
