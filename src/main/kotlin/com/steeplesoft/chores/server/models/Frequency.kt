package com.steeplesoft.chores.server.models

enum class Frequency(var value : Int) {
    ONCE(0),
    DAILY(10),
    WEEKLY(20),
    MONTHLY(30);

    companion object {
        fun valueOf(value: Int) = Frequency.values().first { it.value == value }
    }
}
