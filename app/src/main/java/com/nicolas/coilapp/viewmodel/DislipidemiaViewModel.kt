package com.nicolas.coilapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicolas.coilapp.navigation.AppDestinations
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class DislipidemiaViewModel: ViewModel() {
    private val _navigationEvents = Channel<AppDestinations>()
    val navigationEvents = _navigationEvents.receiveAsFlow()

    fun onDislipidemiaRisksClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.DislipidemiaRisks)
        }
    }

    fun onDislipidemiaSymptomsClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.DislipidemiaSymptoms)
        }
    }

    fun onDislipidemiaRecommendationsClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.DislipidemiaRecommendations)
        }
    }

    fun onBackClick() {
        viewModelScope.launch {
            _navigationEvents.send(AppDestinations.AccessInfo)
        }
    }

}
