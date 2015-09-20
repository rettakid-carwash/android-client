package za.co.rettakid.carwash.utils.errorhandling;

/**
 * Created by Lwazi Prusent on 2015/09/05.
 */
public enum CarWashErrorCode {

    CANNOT_FIND_CONNECTION(10001,"Cannot connect to internet");

    private Integer code;
    private String message;

    CarWashErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
