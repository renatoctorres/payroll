package com.rct.payroll.core.model.dto.employer

import com.rct.payroll.core.model.dto.bank.Bank
import java.util.UUID
import java.util.UUID.randomUUID

data class AccountEmployer(
    val id: UUID = randomUUID(),
    val employerId: UUID,
    val bank: Bank,
    val number: Int,
    val digit: Int,
    val active: Boolean = true
)