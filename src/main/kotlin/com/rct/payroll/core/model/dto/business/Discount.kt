package com.rct.payroll.core.model.dto.business

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID
import java.util.UUID.randomUUID

data class Discount(
    override var id: UUID = randomUUID(),
    override var value: BigDecimal,
    override var createdAt: LocalDateTime,
    override var status: InclusionStatus = InclusionStatus.CREATED,
    override var updatedAt: LocalDateTime,
    val type: DiscountTypeEnum
) : Inclusion(
    id = id,
    value = value,
    createdAt = createdAt,
    status = status,
    updatedAt = updatedAt
)

enum class DiscountTypeEnum {
    TRANSPORT, VOUCHER, MEAL_TICKET, DELAY, ABSENCE, INCOME_TAX
}

