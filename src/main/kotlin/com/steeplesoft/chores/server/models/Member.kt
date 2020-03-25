package com.steeplesoft.chores.server.models

import java.util.UUID

data class Member(
        var id: UUID? = null,
        var familyId: UUID? = null,
        var name: String? = null,
        var email: String? = null,
        var password : String? = null,
        var isParent: Boolean = false
)
