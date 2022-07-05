package web.actions

import support.context.Context
import web.pages.kayak.MainPage

class GoogleFlightsSearchActions(context: Context, private val data: Pair<String, String>) {
    private val mainPage = MainPage(context)
    fun openMainPage(): GoogleFlightsSearchActions {

        assert(
            mainPage
                .open()
                .isMainPage()
            ) { "Main page not loaded!" }

        return this
    }

    fun searchRoute(): GoogleFlightsSearchActions {
        mainPage
            .enterOrigin(data.first)
            .enterDestination(data.second)
            .commitSearch()

        return this
    }



}