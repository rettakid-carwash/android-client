package za.co.rettakid.carwash.network;

import za.co.rettakid.carwash.dto.UserCarDto;
import za.co.rettakid.carwash.network.BaseClient;

public class UserCarClient extends BaseClient {

    public UserCarClient() {
        super("/usercars");
    }

    public UserCarDto getUserCars(Integer carId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserCarDto.class,carId);
    }

    public void postUserCar(UserCarDto userCarDto)  {
        String url = createUrl();
        getRestTemplate().postForObject(url, userCarDto, UserCarDto.class);
    }

    public void putUserCar(UserCarDto userCarDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userCarDto, UserCarDto.class, userCarDto.getCarId());
    }

    public void deleteUserCar(Integer carId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,carId);
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }
}