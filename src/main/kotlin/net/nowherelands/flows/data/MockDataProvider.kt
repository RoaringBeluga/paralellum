package net.nowherelands.flows.data

class MockDataProvider: DataProvider {
    override fun fetch() = listOf(
        Pair("San Francisco", "Istanbul"),
        Pair("San Francisco", "Seoul"),
        Pair("San Francisco", "Shanghai"),
        Pair("San Francisco", "Austin"),
        Pair("San Francisco", "Chicago"),
        Pair("San Francisco", "Ottawa"),
        Pair("San Francisco", "Seattle"),
        Pair("San Francisco", "Toronto"),
        Pair("San Jose", "Los Angeles"),
        Pair("San Jose", "Manila"),
        Pair("San Jose", "Tokyo"),
        Pair("San Jose", "Osaka"),
        Pair("San Jose", "Chicago"),
        Pair("San Jose", "New York"),
        Pair("San Jose", "Berlin"),
        Pair("San Jose", "Ottawa"),
        Pair("Los Angeles", "San Jose"),
        Pair("Los Angeles", "San Francisco"),
        Pair("Los Angeles", "Beijing"),
        Pair("Los Angeles", "Shanghai"),
        Pair("Los Angeles", "Guangzhou"),
        Pair("Los Angeles", "Berlin"),
        Pair("Los Angeles", "Chicago"),
        Pair("Los Angeles", "Toronto"),
    )
}