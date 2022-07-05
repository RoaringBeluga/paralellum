package net.nowherelands.flows

import support.context.Context
import web.actions.KayakSearchActions
import java.util.concurrent.TimeUnit

class AlternativesFlow: WebFlow {
    lateinit var context: Context
    lateinit var data: Pair<String, String>
    override fun run() {
        KayakSearchActions(context, data)
            .openMainPage()
            //.searchAlternatives()
        TimeUnit.SECONDS.sleep(10)
    }

    override fun setup(context: Context, data: Pair<String, String>) {
        this.context = context
        this.data = data
    }
}