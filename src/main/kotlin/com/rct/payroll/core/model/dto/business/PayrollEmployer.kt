package com.rct.payroll.core.model.dto.business


import com.rct.payroll.core.model.dto.hr.Employer
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID
import java.util.UUID.randomUUID

data class PayrollEmployer(
    val id: UUID = randomUUID(),
    val employer: Employer,
    val createdAt: LocalDateTime,
    val month: Int,
    val year: Int,
    val salary: BigDecimal,
    val discounts: List<Discount> = listOf(),
    val benefits: List<Benefit> = listOf(),
    val overtime: List<Inclusion> = listOf(),
    val totalDiscounts: BigDecimal,
    val totalBenefits: BigDecimal,
    val totalOvertime: BigDecimal,
    val amount: BigDecimal
)