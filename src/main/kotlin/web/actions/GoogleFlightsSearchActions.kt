package web.actions

import support.context.Context
import web.pages.google.MainPage
import kotlin.contracts.contract

class GoogleFlightsSearchActions(val context: Context, private val data: Pair<String, String>) {
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
            .commitSearch(data.first, data.second)

        return this
    }

    fun complete() {
        context.driver.quit()
    }



}