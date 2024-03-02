package com.chokosoft.mealzapp.model

import com.chokosoft.mealzapp.model.api.MealsWebService
import com.chokosoft.mealzapp.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// Gets and maps the data from the server.
class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        return webService.getMeals().enqueue(object : Callback<MealsCategoriesResponse> {
            override fun onResponse(
                call: Call<MealsCategoriesResponse>,
                response: Response<MealsCategoriesResponse>
            ) {
                if (response.isSuccessful) {
                    successCallback(response.body())
                }

            }

            override fun onFailure(call: Call<MealsCategoriesResponse>, t: Throwable) {
                // TODO("Not yet implemented")
            }

        })
    }

}