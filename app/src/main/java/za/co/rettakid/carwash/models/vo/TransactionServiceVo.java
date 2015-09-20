package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TransactionServiceVo extends BaseObservable   {

    private Long transactionServiceId;
    private TransactionVo transaction;
    private ServiceVo service;

    @Bindable
    public String getTransactionServiceId()   {
        return String.valueOf(this.transactionServiceId);
    }

    public void setTransactionServiceId(String transactionServiceId)   {
        this.transactionServiceId = Long.parseLong(transactionServiceId);
        notifyPropertyChanged(BR.transactionServiceId);
    }
    @Bindable
    public TransactionVo getTransaction()   {
        return this.transaction;
    }

    public void setTransaction(TransactionVo transaction)   {
        this.transaction = transaction;
        notifyPropertyChanged(BR.transaction);
    }
    @Bindable
    public ServiceVo getService()   {
        return this.service;
    }

    public void setService(ServiceVo service)   {
        this.service = service;
        notifyPropertyChanged(BR.service);
    }

/* real getters and setters */

    public Long getRealTransactionServiceId()   {
        return this.transactionServiceId;
    }

    public void setRealTransactionServiceId(Long transactionServiceId)   {
        this.transactionServiceId = transactionServiceId;
    }
    public TransactionVo getRealTransaction()   {
        return this.transaction;
    }

    public void setRealTransaction(TransactionVo transaction)   {
        this.transaction = transaction;
    }
    public ServiceVo getRealService()   {
        return this.service;
    }

    public void setRealService(ServiceVo service)   {
        this.service = service;
    }

}