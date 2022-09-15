package com.rct.payroll.infra.persistence.repository.business

import com.rct.payroll.infra.persistence.entity.business.Benefit
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface BenefitRepository  : CrudRepository<Benefit, UUID> {}