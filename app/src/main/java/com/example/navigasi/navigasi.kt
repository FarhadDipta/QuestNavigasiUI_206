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
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(paddingValues = isiRuang)){
            composable(route = Navigasi.Formulir.name){
                FormIsian (
                    onSubmitButtonClick = {
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData(
                    onSubmitButtonClick = {cancelAndBackToFormulir(navController)}
                )
            }
        }
    }
}

private fun cancelAndBackToFormulir(navController: NavHostController){
    navController.popBackStack(route = Navigasi.Formulir.name, inclusive = false)
}