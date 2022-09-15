package com.rct.payroll.core.service

import com.rct.payroll.infra.persistence.entity.address.State
import com.rct.payroll.infra.persistence.repository.address.StateRepository
import org.springframework.http.HttpStatus.ACCEPTED
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.http.ResponseEntity.notFound
import org.springframework.stereotype.Service
import java.util.UUID


@Service
class StateService(private val repository: StateRepository) {
    fun findAll(): List<State> =
        repository.findAll()

    fun create(state: State): ResponseEntity<State> =
        ok(repository.save(state))

    fun getById(id: UUID): ResponseEntity<State> =
        repository.findById(id).map { state ->
            ok(state)
        }.orElse(notFound().build())

    fun put(id: UUID, newItem: State): ResponseEntity<State> =
        repository.findById(id).map { currentState ->
            val updated: State =
                currentState
                    .copy(
                        id = newItem.id,
                        country = newItem.country,
                        name = newItem.name,
                        initial = newItem.initial
                    )
            ok().body(repository.save(updated))
        }.orElse(notFound().build())

    fun deleteById(id: UUID): ResponseEntity<Void> =
        repository.findById(id).map { state ->
            repository.delete(state)
            ResponseEntity<Void>(ACCEPTED)
        }.orElse(notFound().build())

}