package com.si5a.dailyquote.API;

import com.si5a.dailyquote.Model.QuoteModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quotes")
    Call<List<QuoteModel>> ardRetrieve();

}
