package com.rct.payroll.infra.persistence.entity.business

import com.rct.payroll.infra.persistence.entity.employer.PayrollEmployer
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.UUID
import javax.persistence.*
import javax.persistence.EnumType.STRING


@Entity
data class Benefit(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID = UUID.randomUUID(),
    val amountValue: BigDecimal,
    @Enumerated(STRING)
    val status: InclusionStatus,
    val updatedAt: LocalDateTime,
    val createdAt: LocalDateTime = now(),
    @Enumerated(STRING)
    val benefitType: BenefitTypeEnum,
    @ManyToOne
    val payroll : PayrollEmployer
) 

enum class BenefitTypeEnum {
    TRANSPORT, VOUCHER, MEAL_TICKET, DELAY, ABSENCE, INCOME_TAX, OVERTIME
}


