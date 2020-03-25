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
        val result = context.select().from(CHORES).fetch()
        return result.map { row ->
            Chore(id = row.getValue(CHORES.ID),
                    memberId = row.getValue(CHORES.MEMBER_ID),
                    name = row.getValue(CHORES.NAME),
                    description = row.getValue(CHORES.DESCRIPTION),
                    frequency = Frequency.valueOf(row.getValue(CHORES.FREQUENCY)),
                    deleted = row.getValue(CHORES.DELETED),
                    completed = row.getValue(CHORES.COMPLETED),
                    startDate = row.getValue(CHORES.START_DATE),
                    endDate = row.getValue(CHORES.END_DATE)
            )
        }
    }
}
