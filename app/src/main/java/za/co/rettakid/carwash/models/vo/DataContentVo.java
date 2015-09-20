package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataContentVo extends BaseObservable   {

    private Long dataContentId;
    private String dataContentData;

    @Bindable
    public String getDataContentId()   {
        return String.valueOf(this.dataContentId);
    }

    public void setDataContentId(String dataContentId)   {
        this.dataContentId = Long.parseLong(dataContentId);
        notifyPropertyChanged(BR.dataContentId);
    }
    @Bindable
    public String getDataContentData()   {
        return String.valueOf(this.dataContentData);
    }

    public void setDataContentData(String dataContentData)   {
        this.dataContentData = dataContentData;
        notifyPropertyChanged(BR.dataContentData);
    }

/* real getters and setters */

    public Long getRealDataContentId()   {
        return this.dataContentId;
    }

    public void setRealDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }
    public String getRealDataContentData()   {
        return this.dataContentData;
    }

    public void setRealDataContentData(String dataContentData)   {
        this.dataContentData = dataContentData;
    }

}