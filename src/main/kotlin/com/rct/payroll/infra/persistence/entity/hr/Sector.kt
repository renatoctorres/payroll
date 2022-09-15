package com.rct.payroll.infra.persistence.entity.hr

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Sector(
    @Id
    @GeneratedValue(strategy = AUTO)
    val id: UUID,
    val name: String,
    val description: String,
    @ManyToOne
    val department: Department
)
