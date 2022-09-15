package com.rct.payroll.infra.persistence.repository.business

import com.rct.payroll.infra.persistence.entity.employer.PayrollEmployer
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface PayrollEmployerRepository  : CrudRepository<PayrollEmployer, UUID> {}