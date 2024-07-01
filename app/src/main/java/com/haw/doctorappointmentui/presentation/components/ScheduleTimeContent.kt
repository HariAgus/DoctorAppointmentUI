package com.haw.doctorappointmentui.presentation.components

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.haw.doctorappointmentui.R
import com.haw.doctorappointmentui.ui.theme.poppinsFontFamily

@Composable
fun ScheduleTimeContent(
    modifier: Modifier = Modifier, contentColor: Color = Color.White
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Content(icon = R.drawable.ic_date, title = "Sunday, 12 June", contentColor = contentColor)

        Content(icon = R.drawable.ic_clock, title = "11.00 - 12.00 PM", contentColor = contentColor)
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    icon: Int,
    title: String,
    contentColor: Color
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(16.dp),
            painter = painterResource(id = icon),
            colorFilter = ColorFilter.tint(color = contentColor),
            contentDescription = "Icon Date"
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = title,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.W400,
            color = contentColor,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ScheduleTimeContentPreview() {
    ScheduleTimeContent()
}