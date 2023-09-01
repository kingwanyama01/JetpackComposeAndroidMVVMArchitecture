package com.example.augustmoringnavigationapp.ui.theme.pages.home

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.augustmoringnavigationapp.data.ProductRepository
import com.example.augustmoringnavigationapp.navigation.ROUTE_ADD_PRODUCTS
import com.example.augustmoringnavigationapp.navigation.ROUTE_VIEW_PRODUCTS
import com.example.augustmoringnavigationapp.ui.theme.AugustMoringNavigationAppTheme
import com.example.augustmoringnavigationapp.ui.theme.pages.login.LoginScreen

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current

        var productRepository = ProductRepository(navController,context)

        Text(text = "Welcome to home page")

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCTS)
        }) {
            Text(text = "Add products")
        }

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_PRODUCTS)
        }) {
            Text(text = "View products")
        }

    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreview() {
    AugustMoringNavigationAppTheme {
        HomeScreen(rememberNavController())
    }
}