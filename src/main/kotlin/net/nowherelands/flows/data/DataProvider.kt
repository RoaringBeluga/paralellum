package net.nowherelands.flows.data

interface DataProvider {
    fun fetch(): List<Pair<*, *>>
}