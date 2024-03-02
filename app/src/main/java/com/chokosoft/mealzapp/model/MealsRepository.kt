package com.chokosoft.mealzapp.model

import com.chokosoft.mealzapp.model.api.MealsWebService
import com.chokosoft.mealzapp.model.response.MealsCategoriesResponse

// Gets and maps the data from the server.
class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals(): MealsCategoriesResponse? {
        return webService.getMeals().execute().body() // blocking call. Will run on the main thread.
    }

}