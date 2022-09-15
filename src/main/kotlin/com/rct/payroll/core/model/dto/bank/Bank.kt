package com.rct.payroll.core.model.dto.bank

import java.util.UUID
import java.util.UUID.randomUUID

data class Bank(
    val id: UUID = randomUUID(),
    val code: String,
    val name: String
)