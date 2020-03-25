package com.steeplesoft.chores.server

import com.steeplesoft.chores.server.models.Chore
import com.steeplesoft.chores.server.models.Frequency
import com.steeplesoft.chores.server.models.jooq.Tables.CHORES
import org.jooq.DSLContext
import javax.enterprise.context.RequestScoped
import javax.inject.Inject

@RequestScoped
class ChoresService {
    @Inject
    lateinit var context: DSLContext

    fun getChores() : List<Chore> {
        return context.fetch(CHORES).map { row ->
            Chore(id = row.id,
                    memberId = row.memberId,
                    name = row.name,
                    description = row.description,
                    frequency = Frequency.valueOf(row.frequency),
                    deleted = row.deleted,
                    completed = row.completed,
                    startDate = row.startDate,
                    endDate = row.endDate
            )
        }
    }
}
