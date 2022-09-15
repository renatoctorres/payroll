package com.rct.payroll.infra.persistence.entity.employer

import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.UUID
import javax.persistence.*
import javax.persistence.EnumType.STRING
import javax.persistence.GenerationType.AUTO


@Entity
data class PayrollEmployer(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    @ManyToOne
    val employer: Employer,
    val createdAt: LocalDateTime = now(),
    val salary: BigDecimal,
    val totalDiscounts: BigDecimal,
    val totalBenefits: BigDecimal,
    val amountValue: BigDecimal,
    @Enumerated(STRING)
    val payrollStatus: PayrollEmployerStatus = PayrollEmployerStatus.CREATED
)