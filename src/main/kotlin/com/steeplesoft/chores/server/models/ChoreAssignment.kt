package com.steeplesoft.chores.server.models

import java.time.LocalDateTime
import java.util.UUID

data class ChoreAssignment(
        var id: UUID? = null,
        var chore: Chore? = null,
        var completed: Boolean = false,
        var startDate: LocalDateTime? = LocalDateTime.now(),
        var endDate: LocalDateTime? = null)
