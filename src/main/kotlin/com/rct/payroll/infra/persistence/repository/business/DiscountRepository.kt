package com.rct.payroll.infra.persistence.repository.business

import com.rct.payroll.infra.persistence.entity.business.Discount
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface DiscountRepository  : CrudRepository<Discount, UUID> {}