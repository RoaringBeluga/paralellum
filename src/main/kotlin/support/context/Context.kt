package support.context

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.FluentWait
import java.time.Duration

class Context (
    var driver: WebDriver,
    timeout: Int = 20,
    pollingInterval: Int = 500
) {
    val wait: FluentWait<WebDriver>
    val executor: JavascriptExecutor
    init {
        wait = FluentWait(this.driver)
            .withTimeout(Duration.ofSeconds(timeout.toLong()))
            .pollingEvery(Duration.ofMillis(pollingInterval.toLong()))
        executor = driver as JavascriptExecutor
    }
}