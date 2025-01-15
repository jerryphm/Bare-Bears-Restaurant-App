import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bearbearsrestaurant.ui.theme.BearBlack
import com.example.bearbearsrestaurant.ui.theme.BearBrown
import com.example.bearbearsrestaurant.ui.theme.BearWhite
import com.example.bearbearsrestaurant.ui.theme.bearBodyTypeFace

@Composable
fun BearsBottomBar(
    onCancelPressed: () -> Unit = {},
    onNextPressed: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
            .navigationBarsPadding()
    ) {
        Text(
            text = "27$",
            fontFamily = bearBodyTypeFace,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 32.sp,
            lineHeight = 48.sp,
            letterSpacing = 0.sp,
            color = BearBlack
        )
        Spacer(Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextButton(
                onClick = onCancelPressed,
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, BearBlack),
                colors = ButtonColors(
                    containerColor = BearWhite,
                    contentColor = BearBlack,
                    disabledContainerColor = BearWhite,
                    disabledContentColor = BearBlack
                ),
                modifier = Modifier.fillMaxWidth(0.4f)
            ) {
                Text(
                    text = "Cancel",
                    fontFamily = bearBodyTypeFace,
                    fontWeight = FontWeight.Normal,
                    fontSize = 24.sp,
                    lineHeight = 36.sp,
                    letterSpacing = 0.sp,
                    color = BearBlack
                )
            }
            Spacer(Modifier.width(16.dp))
            TextButton(
                onClick = onNextPressed,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonColors(
                    containerColor = BearBrown,
                    contentColor = BearWhite,
                    disabledContainerColor = BearBrown,
                    disabledContentColor = BearWhite
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Next",
                    fontFamily = bearBodyTypeFace,
                    fontWeight = FontWeight.Normal,
                    fontSize = 24.sp,
                    lineHeight = 36.sp,
                    letterSpacing = 0.sp,
                    color = BearWhite
                )
            }
        }
    }
}