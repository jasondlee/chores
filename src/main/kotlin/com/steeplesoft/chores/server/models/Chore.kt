package com.steeplesoft.chores.server.models

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.UUID

data class Chore(
        var id: UUID? = null,
        var memberId: UUID? = null,
        var name: String? = null,
        var description: String? = null,
        var frequency: Frequency = Frequency.DAILY,
        var deleted: Boolean = false,
        var completed: Boolean = false,
        var startDate: OffsetDateTime = OffsetDateTime.now(),
        var endDate: OffsetDateTime? = null)
