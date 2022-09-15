package com.rct.payroll.infra.persistence.entity.hr

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GenerationType.AUTO
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Department(
    @Id
    @GeneratedValue(strategy = AUTO)
    val id: UUID,
    val name: String,
    val description: String,
)
