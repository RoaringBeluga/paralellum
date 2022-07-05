package web.actions

import support.context.Context
import web.pages.kayak.MainPage

class KayakSearchActions(context: Context, private val data: Pair<String, String>) {
    private val mainPage = MainPage(context)
    fun openMainPage(): KayakSearchActions {

        assert(
            mainPage
                .open()
                .isMainPage()
            ) { "Main page not loaded!" }

        return this
    }

    fun searchRoute(): KayakSearchActions {
        mainPage
            .enterOrigin(data.first)
            .enterDestination(data.second)
            .commitSearch()

        return this
    }



}