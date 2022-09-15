package com.rct.payroll.infra.persistence.entity.employer


import com.rct.payroll.infra.persistence.entity.bank.Bank
import java.util.UUID
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
data class AccountEmployer(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(columnDefinition = "UUID")
    val id: UUID,
    @OneToOne
    val employer: Employer,
    @ManyToOne
    val bank: Bank,
    val number: Int,
    val digit: Int,
    val active: Boolean
)