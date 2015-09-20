package za.co.rettakid.carwash.utils.errorhandling;

/**
 * Created by Lwazi Prusent on 2015/09/05.
 */
public class CarshWashRuntimeError extends RuntimeException {

    private CarWashErrorCode carWashErrorCode;

    public CarshWashRuntimeError(CarWashErrorCode carWashErrorCode) {
        this.carWashErrorCode = carWashErrorCode;
    }
}
