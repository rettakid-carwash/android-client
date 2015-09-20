package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionVo extends BaseObservable   {

    private Long transactionId;
    private Float transactionTotal;
    private UserVo user;
    private String transactionType;
    private TransactionProofVo transactionProof;
    private Date transactionDate;

    @Bindable
    public String getTransactionId()   {
        return String.valueOf(this.transactionId);
    }

    public void setTransactionId(String transactionId)   {
        this.transactionId = Long.parseLong(transactionId);
        notifyPropertyChanged(BR.transactionId);
    }
    @Bindable
    public String getTransactionTotal()   {
        return String.valueOf(this.transactionTotal);
    }

    public void setTransactionTotal(String transactionTotal)   {
        this.transactionTotal = Float.parseFloat(transactionTotal);
        notifyPropertyChanged(BR.transactionTotal);
    }
    @Bindable
    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
        notifyPropertyChanged(BR.user);
    }
    @Bindable
    public String getTransactionType()   {
        return String.valueOf(this.transactionType);
    }

    public void setTransactionType(String transactionType)   {
        this.transactionType = transactionType;
        notifyPropertyChanged(BR.transactionType);
    }
    @Bindable
    public TransactionProofVo getTransactionProof()   {
        return this.transactionProof;
    }

    public void setTransactionProof(TransactionProofVo transactionProof)   {
        this.transactionProof = transactionProof;
        notifyPropertyChanged(BR.transactionProof);
    }
    @Bindable
    public String getTransactionDate()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.transactionDate);
    }

    public void setTransactionDate(String transactionDate)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.transactionDate = simpleDateFormat.parse(transactionDate);
        } catch (ParseException e) {
            Log.e("TransactionVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.transactionDate);
    }

/* real getters and setters */

    public Long getRealTransactionId()   {
        return this.transactionId;
    }

    public void setRealTransactionId(Long transactionId)   {
        this.transactionId = transactionId;
    }
    public Float getRealTransactionTotal()   {
        return this.transactionTotal;
    }

    public void setRealTransactionTotal(Float transactionTotal)   {
        this.transactionTotal = transactionTotal;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public String getRealTransactionType()   {
        return this.transactionType;
    }

    public void setRealTransactionType(String transactionType)   {
        this.transactionType = transactionType;
    }
    public TransactionProofVo getRealTransactionProof()   {
        return this.transactionProof;
    }

    public void setRealTransactionProof(TransactionProofVo transactionProof)   {
        this.transactionProof = transactionProof;
    }
    public Date getRealTransactionDate()   {
        return this.transactionDate;
    }

    public void setRealTransactionDate(Date transactionDate)   {
        this.transactionDate = transactionDate;
    }

}