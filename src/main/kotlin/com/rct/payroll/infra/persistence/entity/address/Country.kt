package com.rct.payroll.infra.persistence.entity.address

import java.util.*
import javax.persistence.*

@Entity
data class Country(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    val name: String,
)