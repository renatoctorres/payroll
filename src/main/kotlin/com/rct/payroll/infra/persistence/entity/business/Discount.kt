package com.rct.payroll.infra.persistence.entity.business

import com.rct.payroll.infra.persistence.entity.employer.PayrollEmployer
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.UUID
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
data class Discount(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    val amountValue: BigDecimal,
    @Enumerated(EnumType.STRING)
    val status: InclusionStatus,
    val updatedAt: LocalDateTime,
    val createdAt: LocalDateTime = now(),
    @ManyToOne
    val payroll : PayrollEmployer,
    @Enumerated(EnumType.STRING)
    val type: DiscountTypeEnum

)

enum class DiscountTypeEnum {
    TRANSPORT, VOUCHER, MEAL_TICKET, DELAY, ABSENCE, INCOME_TAX
}

