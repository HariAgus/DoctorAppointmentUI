package com.haw.doctorappointmentui.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import com.haw.doctorappointmentui.presentation.components.MenuHome
import com.haw.doctorappointmentui.presentation.components.NearDoctorCard
import com.haw.doctorappointmentui.presentation.components.ScheduleTimeContent
import com.haw.doctorappointmentui.ui.theme.BluePrimary
import com.haw.doctorappointmentui.ui.theme.GraySecond
import com.haw.doctorappointmentui.ui.theme.PurpleGrey
import com.haw.doctorappointmentui.ui.theme.WhiteBackground
import com.haw.doctorappointmentui.ui.theme.poppinsFontFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .padding(top = 42.dp, start = 16.dp, end = 16.dp)
    ) {
        Column {
            // Header Content
            HeaderContent()

            Spacer(modifier = Modifier.height(32.dp))

            // Schedule Content
            ScheduleContent()

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                value = "",
                placeholder = {
                    Text(
                        text = "Search doctor or health issue",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.W400,
                        color = PurpleGrey
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = "Icon Search"
                    )
                },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = WhiteBackground,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(12.dp),
                onValueChange = {},
            )

            // Menu Home
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MenuHome(icon = R.drawable.ic_covid, title = "Covid")
                MenuHome(icon = R.drawable.ic_doctor, title = "Doctor")
                MenuHome(icon = R.drawable.ic_medicine, title = "Medicine")
                MenuHome(icon = R.drawable.ic_hospital, title = "Hospital")
            }

            // Near Content
            Text(
                modifier = Modifier.padding(top = 32.dp),
                text = "Near Doctor",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            LazyColumn(
                modifier = Modifier.padding(top = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                items(3) {
                    NearDoctorCard()
                }
            }
        }
    }
}

@Composable
private fun HeaderContent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Hello,",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.W400,
                color = PurpleGrey
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Hi, Shidiq",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Image(
            modifier = Modifier.size(56.dp),
            painter = painterResource(id = R.drawable.img_header_content),
            contentDescription = "Image Header Content"
        )
    }
}

@Composable
private fun ScheduleContent(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = BluePrimary,
        tonalElevation = 1.dp,
        shadowElevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    modifier = Modifier.size(48.dp),
                    painter = painterResource(id = R.drawable.img_doctor_1),
                    contentDescription = "Image Doctor"
                )

                Column(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Dr. Ibnu Sina",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Text(
                        text = "General Doctor",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Light,
                        color = GraySecond
                    )
                }

                Image(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Arrow Next",
                    colorFilter = ColorFilter.tint(color = Color.White)
                )
            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(1.dp)
                    .alpha(0.2f),
                color = Color.White
            )

            // Schedule Time Content
            ScheduleTimeContent()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}