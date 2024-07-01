package com.haw.doctorappointmentui.presentation.components

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.haw.doctorappointmentui.R
import com.haw.doctorappointmentui.ui.theme.BluePrimary
import com.haw.doctorappointmentui.ui.theme.Orange
import com.haw.doctorappointmentui.ui.theme.PurpleGrey
import com.haw.doctorappointmentui.ui.theme.TextColorTitle
import com.haw.doctorappointmentui.ui.theme.poppinsFontFamily

@Composable
fun NearDoctorCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        tonalElevation = 0.5.dp,
        shadowElevation = 0.2.dp
    ) {
        Column(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 20.dp)
        ) {
            Row {
                Image(
                    modifier = Modifier.size(48.dp),
                    painter = painterResource(id = R.drawable.img_doctor_1),
                    contentDescription = "Image Doctor 1"
                )

                Column(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .weight(1f),
                ) {
                    Text(
                        text = "Dr. Ibnu Sina",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        color = TextColorTitle
                    )

                    Text(
                        text = "General Doctor",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Light,
                        color = PurpleGrey
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier.size(14.dp),
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Location Icon",
                        colorFilter = ColorFilter.tint(color = PurpleGrey)
                    )

                    Text(
                        modifier = Modifier.padding(start = 2.dp),
                        text = "1.2 km",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.W400,
                        color = PurpleGrey
                    )
                }
            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(1.dp)
                    .alpha(0.1f),
                color = Color.Gray
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BottomItem(
                    icon = R.drawable.ic_review,
                    title = "4.5 (Reviews)",
                    color = Orange
                )

                BottomItem(
                    icon = R.drawable.ic_clock,
                    title = "Open at 17.00",
                    color = BluePrimary
                )
            }
        }
    }
}

@Composable
private fun BottomItem(modifier: Modifier = Modifier, icon: Int, title: String, color: Color) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(16.dp),
            painter = painterResource(id = icon),
            contentDescription = "Icon",
            colorFilter = ColorFilter.tint(color = color)
        )

        Spacer(modifier = Modifier.width(6.dp))

        Text(
            text = title,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.W400,
            color = color,
            fontSize = 12.sp
        )
    }
}

@Preview
@Composable
private fun NearDoctorCardPreview() {
    NearDoctorCard()
}