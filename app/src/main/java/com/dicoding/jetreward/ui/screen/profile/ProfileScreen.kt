package com.dicoding.jetreward.ui.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.jetreward.R

@Composable
fun ProfileScreen(
) {
    Surface(modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background) {

             Column(modifier = Modifier
                 .padding(16.dp)
                 .padding(top = 64.dp),
             horizontalAlignment = Alignment.CenterHorizontally
             ) {
                 Image(painter = painterResource(R.drawable.my_picture),
                     contentDescription = "Profile Page",
                 modifier = Modifier
                     .size(350.dp)
                     .padding(bottom = 16.dp)
                     .clip(RoundedCornerShape(200.dp)),
                 contentScale = ContentScale.Crop
                 )
                 Text(
                     text = stringResource(R.string.my_name),
                 style = MaterialTheme.typography.headlineSmall,
                 modifier = Modifier.padding(bottom = 8.dp)
                 )
                 Text(
                     text = stringResource(R.string.my_email),
                 style = MaterialTheme.typography.bodyLarge)
             }

        }
    }

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun ProfilePreview() {
    ProfileScreen()
}