package com.chokosoft.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.chokosoft.mealzapp.model.MealsRepository
import com.chokosoft.mealzapp.model.response.MealResponse

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(): List<MealResponse>{
        return repository.getMeals().categories
    }
}