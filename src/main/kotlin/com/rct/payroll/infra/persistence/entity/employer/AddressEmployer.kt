package com.rct.payroll.infra.persistence.entity.employer

import com.rct.payroll.core.model.dto.employer.StreetType
import com.rct.payroll.infra.persistence.entity.address.City
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*
import javax.persistence.EnumType.STRING
import javax.persistence.GenerationType.AUTO

@Entity
data class AddressEmployer(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    @Enumerated(STRING)
    val streetType: StreetType,
    val street: String,
    val number: Number,
    @OneToOne
    val city: City,
    val zipCode: String,
    val employerId: UUID,
    val active : Boolean,
    val createdAt: LocalDateTime,
    var updatedAt: LocalDateTime

)
