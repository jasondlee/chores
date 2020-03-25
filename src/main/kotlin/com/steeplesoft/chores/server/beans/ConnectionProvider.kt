package com.steeplesoft.chores.server.beans

import org.eclipse.microprofile.config.inject.ConfigProperty
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.conf.RenderQuotedNames
import org.jooq.conf.Settings
import org.jooq.impl.DSL
import java.sql.Connection
import java.sql.DriverManager
import javax.enterprise.inject.Produces

class ConnectionProvider {
    @ConfigProperty(name = "quarkus.datasource.url")
    lateinit var url: String
    @ConfigProperty(name = "quarkus.datasource.username")
    lateinit var userName: String
    @ConfigProperty(name = "quarkus.datasource.password")
    lateinit var password: String

//    @Produces
    fun getConnection() : Connection {
        return DriverManager.getConnection(url, userName, password)
    }

    @Produces
    fun getDslContext() : DSLContext {
        return DSL.using(getConnection(), SQLDialect.POSTGRES,
                Settings().withRenderQuotedNames(RenderQuotedNames.NEVER));
    }
}
