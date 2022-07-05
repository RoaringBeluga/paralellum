package net.nowherelands

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking
import net.nowherelands.flows.WebFlow
import net.nowherelands.flows.data.DataProvider
import net.nowherelands.flows.data.GoogleFlightsFlow
import net.nowherelands.flows.data.MockDataProvider
import support.context.ContextGenerator

class Runner {

    val testData: DataProvider = MockDataProvider()
    val resultsFine: MutableList<Pair<*, *>> = mutableListOf()
    val resultsBad: MutableList<Pair<*, *>> = mutableListOf()


    @OptIn(DelicateCoroutinesApi::class)
    fun runRunRun() = runBlocking {
        var data = testData.fetch()
        val tp = newFixedThreadPoolContext(nThreads = 3, name = "Executioner")
        for(i in 1..24) async(tp) {
            val runner: WebFlow = GoogleFlightsFlow()
            if (i.rem(3) !=0) resultsFine.add(data[i-1]) else resultsBad.add(data[i-1])
            runner.setup(
                ContextGenerator.generate(),
                data[i-1] as Pair<String, String>
            )
            runner.run()
        }
        println("All asyncs started!")
    }

}

class Worker {
    fun run(info: String) {
        println("Running the job with info: $info")
    }
}

fun main(args: Array<String>) {
    val runABunch = Runner()
    runABunch.runRunRun()

}