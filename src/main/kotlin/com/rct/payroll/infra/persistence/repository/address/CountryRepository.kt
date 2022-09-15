package com.rct.payroll.infra.persistence.repository.address

import com.rct.payroll.infra.persistence.entity.address.Country
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface CountryRepository : CrudRepository<Country, UUID> {}