package com.chokosoft.mealzapp.model

import com.chokosoft.mealzapp.model.response.MealsCategoriesResponse

// Gets and maps the data from the server.
class MealsRepository {
    fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf())

}