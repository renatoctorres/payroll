package com.rct.payroll.core.model.dto.address

import java.util.UUID
import java.util.UUID.randomUUID

data class City(
    val id: UUID = randomUUID(),
    val state: State,
    val name: String
)