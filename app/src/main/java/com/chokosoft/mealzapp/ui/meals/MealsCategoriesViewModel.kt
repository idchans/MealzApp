package com.chokosoft.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.chokosoft.mealzapp.model.MealsRepository
import com.chokosoft.mealzapp.model.response.MealResponse
import com.chokosoft.mealzapp.model.response.MealsCategoriesResponse
import retrofit2.Callback

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals() { response ->
            successCallback(response)
        }
    }
}