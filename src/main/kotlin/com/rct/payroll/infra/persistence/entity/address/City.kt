package com.rct.payroll.infra.persistence.entity.address

import java.util.UUID
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
data class City(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    @ManyToOne
    val state: State,
    val name: String
)