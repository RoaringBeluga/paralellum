package support.context

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver

object ContextGenerator {
    fun generate(): Context {
        val driver: WebDriver = WebDriverManager
            .chromedriver()
            .avoidBrowserDetection()
            .create()

        return Context(driver)
    }
}