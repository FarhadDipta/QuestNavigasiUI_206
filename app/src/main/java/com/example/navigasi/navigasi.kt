package com.example.navigasi

import androidx.compose.material3.Scaffold

enum class  Navigasi {
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: navHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
        )
    }
}