package componentes

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomRadioButton(clickeable: Modifier.Companion.(() -> Unit?) -> Modifier) {
    var selectedOption by remember { mutableStateOf("Oopcion 1") }

    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = (selectedOption == "Oopcion 1"),
            onClick = { selectedOption = "Opcion 1" }
        )
        Text(
            text = "Opcion 1",
            modifier = Modifier.clickeable { selectedOption = "Opcion 1" }
        )

        Spacer(modifier = Modifier.width(16.dp))

        RadioButton(
            selected = (selectedOption == "Opcion 2"),
            onClick = { selectedOption = "Opcion 2" }
        )
        Text(
            text = "Opcion 2",
            modifier = Modifier.clickeable { selectedOption = "Opcion 2"}
        )
    }
}