package com.rct.payroll.infra.persistence.repository.bank

import com.rct.payroll.infra.persistence.entity.bank.Bank
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface BankRepository : CrudRepository<Bank, UUID> {}