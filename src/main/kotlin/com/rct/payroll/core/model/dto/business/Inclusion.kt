package com.rct.payroll.core.model.dto.business

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

open class Inclusion(
    open var id: UUID,
    open var value: BigDecimal,
    open var status: InclusionStatus = InclusionStatus.CREATED,
    open var createdAt: LocalDateTime,
    open var updatedAt: LocalDateTime
)

enum class InclusionStatus {
    CREATED, GENERATED, PAYED
}
