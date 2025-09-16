package com.example.myfirebase.view

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfirebase.R
import com.example.myfirebase.repositori.route.DestinasiHome

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(),
                 modifier: Modifier){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController:NavHostController,
    modifier: Modifier = Modifier
){
    NavHost (navController = navController, startDestination = DestinasiHome.route,
        modifier = Modifier){
        composable(DestinasiHome.route){
            HomeScreen()/*(navigateToItemEntry = {navController.navigate(DestinasiEntry.route)},
                navigateToItemUpdate = {
                    navController.navigate("${DestinasiDetail.route}/${it}")
                })*/
        }
        /*composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = {navController.navigate(DestinasiHome.route)})
        }
        composable(DestinasiDetail.routeWithArg, arguments = listOf(navArgument(DestinasiDetail.itemIdArg){
            type = NavType.IntType })
        ){
            DetailSiswaScreen(navigateBack = { navController.navigate(DestinasiHome.route) })
        }
        composable(
            route = DestinasiEdit.routeWithArg,
            arguments = listOf(navArgument(DestinasiEdit.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            EditSiswaScreen(
                navigateBack = { navController.navigate(DestinasiHome.route) },
                onNavigateUp = { navController.navigateUp() }
            )
        }*/
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaTopAppBar(
    title: String,
    canNavigateBack: Boolean,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    navigateUp: () -> Unit = {}
) {
    CenterAlignedTopAppBar(title = { Text(title) },
        modifier = modifier,
        scrollBehavior = scrollBehavior,
        navigationIcon = {
            if (canNavigateBack){
                IconButton(onClick = navigateUp){
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back)
                    )
                }
            }
        }
    )
}