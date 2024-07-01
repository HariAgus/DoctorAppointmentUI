package com.haw.doctorappointmentui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.haw.doctorappointmentui.R
import com.haw.doctorappointmentui.ui.theme.BluePrimary
import com.haw.doctorappointmentui.ui.theme.PurpleGrey
import com.haw.doctorappointmentui.ui.theme.WhiteBackground
import com.haw.doctorappointmentui.ui.theme.poppinsFontFamily

@Composable
fun MenuHome(modifier: Modifier = Modifier, icon: Int, title: String) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.size(72.dp),
            shape = RoundedCornerShape(100.dp),
            colors = ButtonDefaults.buttonColors(containerColor = WhiteBackground),
            onClick = { /*TODO*/ }
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = icon),
                contentDescription = "Icon",
                colorFilter = ColorFilter.tint(color = BluePrimary)
            )
        }

        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = title,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.W400,
            color = PurpleGrey
        )
    }
}

@Preview
@Composable
private fun MenuHomePreview() {
    MenuHome(icon = R.drawable.ic_covid, title = "Covid")
}