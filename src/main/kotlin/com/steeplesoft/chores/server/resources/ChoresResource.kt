package com.steeplesoft.chores.server.resources

import com.steeplesoft.chores.server.ChoresService
import com.steeplesoft.chores.server.models.Chore
import org.jooq.DSLContext
import java.sql.Connection
import javax.enterprise.context.RequestScoped
import javax.inject.Inject
import javax.transaction.Transactional
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

//@Path("/chores")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ChoresResource {
    @Inject lateinit var choresService : ChoresService

    @GET
    @Transactional
    fun getChores() : List<Chore> {
        return choresService.getChores()
    }
}
