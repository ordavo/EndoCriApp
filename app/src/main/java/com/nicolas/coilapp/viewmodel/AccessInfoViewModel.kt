package com.nicolas.coilapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicolas.coilapp.navigation.AppDestinations
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class AccessInfoViewModel: ViewModel() {
    private val _navigationEvents = Channel<AppDestinations>()
    val navigationEvents = _navigationEvents.receiveAsFlow()

    fun onDiabetesClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.Diabetes)
        }
    }

    fun onDislipidemiaClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.Dislipidemia)
        }
    }

    fun onBackClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.Home)
        }
    }
}