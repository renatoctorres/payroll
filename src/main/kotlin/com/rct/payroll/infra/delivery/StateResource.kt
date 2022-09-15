package com.rct.payroll.infra.delivery

import com.rct.payroll.core.service.StateService
import com.rct.payroll.infra.persistence.entity.address.State
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/states")
class StateResource(private val service: StateService) {

    @GetMapping
    fun findAll(): List<State> =
        service.findAll()

    @PostMapping
    fun create(@RequestBody state: State): ResponseEntity<State> =
        service.create(state)

    @GetMapping("/{id}")
    fun getById(@PathVariable(value = "id") id: UUID): ResponseEntity<State> =
        service.getById(id)

    @PutMapping("/{id}")
    fun update(
        @PathVariable(value = "id") id: UUID,
        @RequestBody state: State
    ): ResponseEntity<State> =
        service.put(id, state)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable(value = "id") id: UUID): ResponseEntity<Void> =
        service.deleteById(id)
}