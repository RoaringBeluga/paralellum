package web.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriverException
import support.context.Context

open class WebPage (val context: Context) {

    fun elementPresent(locator: By) = context.driver.findElements(locator).isNotEmpty()

    fun <T: WebPage> getElement(locator: By) = try {
        context.driver.findElement(locator)
    } catch (possible: WebDriverException) {
        throw possible
    }
}