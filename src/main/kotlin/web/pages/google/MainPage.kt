package web.pages.google

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import support.context.Context
import web.pages.WebPage

class MainPage(c: Context): WebPage(c) {
    private val mainPageHeading: By = By.cssSelector("img[alt='Google']")
    private val searchBar: By = By.cssSelector("input[name='q']")

    fun open(): MainPage {
        context.driver.get("https://www.google.com")

        return this
    }

    fun isMainPage(): Boolean = elementPresent(mainPageHeading)


    fun commitSearch(from: String, to: String): MainPage {
        getElement<MainPage>(searchBar).click()
        getElement<MainPage>(searchBar).sendKeys("$from to $to", Keys.ENTER)
        return this
    }

}