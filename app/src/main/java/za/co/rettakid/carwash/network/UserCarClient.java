package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class UserCarClient extends BaseClient   {

    public UserCarClient(Context context) {
        super("/usercars",context);
    }

    public UserCarListDto getUserCars()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, UserCarListDto.class);
    }

    public UserCarDto getUserCars(Long carId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserCarDto.class,carId);
    }

    public UserCarDto postUserCar(UserCarDto userCarDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, userCarDto, UserCarDto.class);
    }

    public UserCarListDto postUserCar(UserCarListDto userCarListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, userCarListDto, UserCarListDto.class);
    }

    public void putUserCar(UserCarDto userCarDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userCarDto, UserCarDto.class,userCarDto.getCarId());
    }

    public void deleteUserCar(Long carId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,carId);
    }

}