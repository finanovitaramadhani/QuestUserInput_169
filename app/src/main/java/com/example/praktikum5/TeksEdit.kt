package com.example.praktikum5

import androidx.compose.runtime.Composable

@Composable

fun FormDataDiri(modifier: Modifier
){
    //variabel variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}

    //variabel untuk menyimpan data yg diperolah dari komponen UI
    var nama by remember {mutableStateOf("")}
    var alamat by remember {mutableStateOf("")}
    var jenis by remember {mutableStateOf("")}

    val gender:List<String> = ListOf("Laki-Laki","Perempuan")

    column(modifier = Modifier.padding(top = 50.dp),
        vertikalArrangement = Arrangement.Top,


    }
}