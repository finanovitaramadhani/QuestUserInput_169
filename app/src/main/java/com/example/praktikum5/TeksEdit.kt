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

        horizontalAlignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),

            label = { Text(text = "Nama Lengkap") },

            onValueChange = {
                textNama = it
            }
        )

        Row {

            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,

                    onClick = {textJK = item}

                ), verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = textJK == item,

                        onClick = {
                            textJK = item
                        })
                    Text(item)
                }
            }
        }

}