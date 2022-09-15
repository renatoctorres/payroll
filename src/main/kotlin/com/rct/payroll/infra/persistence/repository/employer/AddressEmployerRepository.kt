package com.rct.payroll.infra.persistence.repository.employer

import com.rct.payroll.infra.persistence.entity.employer.AddressEmployer
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface AddressEmployerRepository : CrudRepository<AddressEmployer, UUID> {}