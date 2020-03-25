package com.steeplesoft.chores.server.resources

import javax.enterprise.context.RequestScoped
import javax.ws.rs.Path
import javax.ws.rs.container.ResourceContext
import javax.ws.rs.core.Context


@Path("/api")
@RequestScoped
class ApiResource {
    @Context
    private lateinit var context: ResourceContext

    @Path("/chores")
    fun getChores() : ChoresResource {
        return this.context.getResource(ChoresResource::class.java)
    }
}
