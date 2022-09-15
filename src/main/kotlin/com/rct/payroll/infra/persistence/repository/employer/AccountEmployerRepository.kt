package com.rct.payroll.infra.persistence.repository.employer

import com.rct.payroll.infra.persistence.entity.employer.AccountEmployer
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface AccountEmployerRepository : CrudRepository<AccountEmployer, UUID> {}