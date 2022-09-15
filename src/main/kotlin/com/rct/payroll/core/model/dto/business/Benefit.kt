package com.rct.payroll.core.model.dto.business

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID
import java.util.UUID.randomUUID

data class Benefit(
    override var id: UUID = randomUUID(),
    override var value: BigDecimal,
    override var createdAt: LocalDateTime,
    override var updatedAt: LocalDateTime,
    val type: BenefitTypeEnum
) : Inclusion(
    id = id,
    value = value,
    createdAt = createdAt,
    updatedAt = updatedAt
)

enum class BenefitTypeEnum {
    TRANSPORT, VOUCHER, MEAL_TICKET, DELAY, ABSENCE, INCOME_TAX
}

