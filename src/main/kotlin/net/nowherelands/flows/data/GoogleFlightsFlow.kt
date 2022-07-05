package net.nowherelands.flows.data

import net.nowherelands.flows.WebFlow
import support.context.Context
import web.actions.GoogleFlightsSearchActions
import java.util.concurrent.TimeUnit

class GoogleFlightsFlow: WebFlow {
    lateinit var context: Context
    lateinit var data: Pair<String, String>
    override fun run() {
        val actions = GoogleFlightsSearchActions(context, data)
        actions
            .openMainPage()
            .searchRoute()
        TimeUnit.SECONDS.sleep(10)
        actions.complete()
    }

    override fun setup(context: Context, data: Pair<String, String>) {
        this.context = context
        this.data = data
    }
}