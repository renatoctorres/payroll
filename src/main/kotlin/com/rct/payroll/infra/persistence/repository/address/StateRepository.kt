package com.rct.payroll.infra.persistence.repository.address

import com.rct.payroll.infra.persistence.entity.address.State
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface StateRepository : JpaRepository<State, UUID> {}