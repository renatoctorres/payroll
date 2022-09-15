package com.rct.payroll.core.model.dto.hr

import java.util.UUID
import java.util.UUID.randomUUID

data class Department(
    val id: UUID = randomUUID(),
    val name: String,
    val description: String,
)
