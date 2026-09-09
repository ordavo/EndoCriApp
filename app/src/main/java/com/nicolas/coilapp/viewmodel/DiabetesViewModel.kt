package com.nicolas.coilapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicolas.coilapp.navigation.AppDestinations
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class DiabetesViewModel: ViewModel() {
    private val _navigationEvents = Channel<AppDestinations>()
    val navigationEvents = _navigationEvents.receiveAsFlow()

    fun onDiabetesRisksClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.DiabetesRisks)
        }
    }

    fun onDiabetesSymptomsClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.DiabetesSymptoms)
        }
    }

    fun onDiabetesRecommendations() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.DiabetesRecommendations)
        }
    }

    fun onBackClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.AccessInfo)
        }
    }
}