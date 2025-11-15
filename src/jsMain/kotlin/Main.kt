import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        var count by remember { mutableStateOf(0) }

        Button(attrs = {
            onClick { count++ }
        }) {
            Text("Clicked: $count")
        }
    }
}

