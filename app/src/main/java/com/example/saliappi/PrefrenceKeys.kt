package com.example.saliappi

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

//val Context.exercise: DataStore<Preferences> by preferencesDataStore(name = "userInfo")

object PrefrenceKeys {
    const val NIMI= stringPreferencesKey("nimi")
    const val PAINO= doublePreferencesKey("paino")

}