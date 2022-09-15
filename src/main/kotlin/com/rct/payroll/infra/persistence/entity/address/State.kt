package com.rct.payroll.infra.persistence.entity.address

import java.util.UUID
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
data class State(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    @ManyToOne
    val country: Country,
    val name: String,
    val initial: String,
)