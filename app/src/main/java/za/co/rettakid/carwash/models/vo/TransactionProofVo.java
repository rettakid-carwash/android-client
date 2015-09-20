package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TransactionProofVo extends BaseObservable   {

    private Long transactionProofId;
    private String transactionProofUrl;
    private String transactionProofFile;

    @Bindable
    public String getTransactionProofId()   {
        return String.valueOf(this.transactionProofId);
    }

    public void setTransactionProofId(String transactionProofId)   {
        this.transactionProofId = Long.parseLong(transactionProofId);
        notifyPropertyChanged(BR.transactionProofId);
    }
    @Bindable
    public String getTransactionProofUrl()   {
        return String.valueOf(this.transactionProofUrl);
    }

    public void setTransactionProofUrl(String transactionProofUrl)   {
        this.transactionProofUrl = transactionProofUrl;
        notifyPropertyChanged(BR.transactionProofUrl);
    }
    @Bindable
    public String getTransactionProofFile()   {
        return String.valueOf(this.transactionProofFile);
    }

    public void setTransactionProofFile(String transactionProofFile)   {
        this.transactionProofFile = transactionProofFile;
        notifyPropertyChanged(BR.transactionProofFile);
    }

/* real getters and setters */

    public Long getRealTransactionProofId()   {
        return this.transactionProofId;
    }

    public void setRealTransactionProofId(Long transactionProofId)   {
        this.transactionProofId = transactionProofId;
    }
    public String getRealTransactionProofUrl()   {
        return this.transactionProofUrl;
    }

    public void setRealTransactionProofUrl(String transactionProofUrl)   {
        this.transactionProofUrl = transactionProofUrl;
    }
    public String getRealTransactionProofFile()   {
        return this.transactionProofFile;
    }

    public void setRealTransactionProofFile(String transactionProofFile)   {
        this.transactionProofFile = transactionProofFile;
    }

}