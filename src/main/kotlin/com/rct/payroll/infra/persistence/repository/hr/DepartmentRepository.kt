package com.rct.payroll.infra.persistence.repository.hr

import com.rct.payroll.infra.persistence.entity.hr.Department
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface DepartmentRepository : CrudRepository<Department, UUID> {}