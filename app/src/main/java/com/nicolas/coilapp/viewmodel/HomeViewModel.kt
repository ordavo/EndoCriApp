package com.nicolas.coilapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicolas.coilapp.navigation.AppDestinations
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val _navigationEvents = Channel<AppDestinations>()
    val navigationEvents = _navigationEvents.receiveAsFlow()

    fun onAccessInfoClicked() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.AccessInfo)
        }
    }

    fun onColaboradoresClicked() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.Colaboradores)
        }
    }
    fun onRegisterResultsClicked() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.RegisterResults)
        }
    }


    fun onKnowMyProgressClicked() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.KnowMyProgress)
        }
    }
}