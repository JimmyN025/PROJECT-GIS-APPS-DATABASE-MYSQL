package ac.id.atmaluhur.mahasiswa1811500025.ui.api;
import ac.id.atmaluhur.mahasiswa1811500025.ui.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker1.php")
    Call<ListLocationModel> getHospital();

    @GET("JsonDisplayMarker2.php")
    Call<ListLocationModel> getSekolah();

    @GET("JsonDisplayMarker3.php")
    Call<ListLocationModel> getRestaurant();
}
