package com.rct.payroll.infra.persistence.repository.address

import com.rct.payroll.infra.persistence.entity.address.City
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface CityRepository : CrudRepository<City, UUID> {}