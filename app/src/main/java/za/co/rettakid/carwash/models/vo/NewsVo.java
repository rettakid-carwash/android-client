package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsVo extends BaseObservable   {

    private Long newsId;
    private String newsHeading;
    private DataContentVo dataContent;
    private Date newsDate;

    @Bindable
    public String getNewsId()   {
        return String.valueOf(this.newsId);
    }

    public void setNewsId(String newsId)   {
        this.newsId = Long.parseLong(newsId);
        notifyPropertyChanged(BR.newsId);
    }
    @Bindable
    public String getNewsHeading()   {
        return String.valueOf(this.newsHeading);
    }

    public void setNewsHeading(String newsHeading)   {
        this.newsHeading = newsHeading;
        notifyPropertyChanged(BR.newsHeading);
    }
    @Bindable
    public DataContentVo getDataContent()   {
        return this.dataContent;
    }

    public void setDataContent(DataContentVo dataContent)   {
        this.dataContent = dataContent;
        notifyPropertyChanged(BR.dataContent);
    }
    @Bindable
    public String getNewsDate()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.newsDate);
    }

    public void setNewsDate(String newsDate)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.newsDate = simpleDateFormat.parse(newsDate);
        } catch (ParseException e) {
            Log.e("NewsVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.newsDate);
    }

/* real getters and setters */

    public Long getRealNewsId()   {
        return this.newsId;
    }

    public void setRealNewsId(Long newsId)   {
        this.newsId = newsId;
    }
    public String getRealNewsHeading()   {
        return this.newsHeading;
    }

    public void setRealNewsHeading(String newsHeading)   {
        this.newsHeading = newsHeading;
    }
    public DataContentVo getRealDataContent()   {
        return this.dataContent;
    }

    public void setRealDataContent(DataContentVo dataContent)   {
        this.dataContent = dataContent;
    }
    public Date getRealNewsDate()   {
        return this.newsDate;
    }

    public void setRealNewsDate(Date newsDate)   {
        this.newsDate = newsDate;
    }

}