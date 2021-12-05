package com.example.vjezba;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoursesApiService {
    @GET("/v1/courses")
    Call<CoursesResponse> getCourses();
}
