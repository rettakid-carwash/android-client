package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import za.co.rettakid.carwash.BR;

/**
 * Created by Lwazi Prusent on 2015/09/09.
 */
public class BindableBoolean extends BaseObservable {

    private Boolean aBoolean;

    @Bindable
    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
        notifyPropertyChanged(BR.aBoolean);
    }
}
