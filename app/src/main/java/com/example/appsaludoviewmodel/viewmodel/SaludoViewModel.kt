package com.example.appsaludoviewmodel.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel

class SaludoViewModel :ViewModel() {

    private val _nombre = mutableStateOf("")
    val nombre: State<String> = _nombre
    private val _saludo = mutableStateOf("")
    val saludo: State<String> = _saludo
    fun onNombreChange(nuevoNombre:String) {
        _nombre.value=nuevoNombre
    }
    fun saludar() {
        _saludo.value="Hola ${_nombre.value}"
    }
}