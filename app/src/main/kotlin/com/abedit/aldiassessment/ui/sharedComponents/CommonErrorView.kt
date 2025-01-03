package com.abedit.aldiassessment.ui.sharedComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abedit.aldiassessment.R
import com.abedit.aldiassessment.ui.coinDetailsComponents.CoinDetailsBox
import com.abedit.aldiassessment.ui.theme.Blue
import com.abedit.aldiassessment.ui.theme.White

/**
 * The error view in the list and details screen
 */
@Composable
fun CommonErrorView(
    errorMessage: String,
    tryAgainClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = errorMessage,
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp)
        )
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue,
                contentColor = White
            ),
            onClick = { tryAgainClicked.invoke() }
        ) {
            Text(
                text = stringResource(R.string.try_again),
                fontSize = 16.sp
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CoinDetailsErrorPreview() {
    CoinDetailsBox(roundedCornerShape = RoundedCornerShape(12.dp)) {
        CommonErrorView(
            "error loading data",
            tryAgainClicked = {})
    }
}