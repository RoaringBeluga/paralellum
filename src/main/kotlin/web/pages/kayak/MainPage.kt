package web.pages.kayak

import org.openqa.selenium.By
import support.context.Context
import web.pages.WebPage

class MainPage(c: Context): WebPage(c) {
    private val mainPageHeading: By = By.xpath("//h2[text()='Where are you flying?']")
    private val searchOrigin: By = By.cssSelector("input[placeholder='From?']")
    private val searchDestination: By = By.cssSelector("input[placeholder='To?']")
    private val submitButton: By = By.cssSelector("button[type='submit']")

    fun open(): MainPage {
        context.driver.get("https://www.kayak.com")

        return this
    }

    fun isMainPage(): Boolean = elementPresent(mainPageHeading)

    fun enterOrigin(location: String): MainPage {
        getElement<MainPage>(searchOrigin).click()
        getElement<MainPage>(searchOrigin).sendKeys(location)

        return this
    }

    fun enterDestination(location: String): MainPage {
        getElement<MainPage>(searchDestination).click()
        getElement<MainPage>(searchDestination).sendKeys(location)

        return this
    }

    fun commitSearch(): MainPage {
        getElement<MainPage>(submitButton).click()

        return this
    }

}