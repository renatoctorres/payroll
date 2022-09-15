package com.rct.payroll.infra.persistence.entity.bank

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.GenerationType.AUTO

@Entity
data class Bank(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    val code: String,
    val name: String
)