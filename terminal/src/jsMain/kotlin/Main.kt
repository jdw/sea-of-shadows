import com.github.jdw.seaofshadows.Terminal
import kotlinx.browser.window

@JsName("SeaOfShadowsMain")
suspend fun main() {
    println("Starting JS main...")
    Terminal().run("${window.location.protocol}/sea-of-shadows/settings")
}