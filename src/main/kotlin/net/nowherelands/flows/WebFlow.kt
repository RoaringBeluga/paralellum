package net.nowherelands.flows

import support.context.Context

interface WebFlow {
    fun run()

    fun setup(context: Context, data: Pair<String, String>)
}