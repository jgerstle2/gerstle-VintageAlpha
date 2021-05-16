package gerstle.stock;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.net.http.HttpResponse;

public interface LatestStockService
{
    @Headers("x-rapidapi-key", "3d3bec4cf6msh5e70c5761ec73d4p1df9e5jsne9a9941276b6")
    @Headers("x-rapidapi-host", "latest-stock-price.p.rapidapi.com")
    @GET("3d3bec4cf6msh5e70c5761ec73d4p1df9e5jsne9a9941276b6")
    Single<LatestStockFeed> getStockPrice();
}