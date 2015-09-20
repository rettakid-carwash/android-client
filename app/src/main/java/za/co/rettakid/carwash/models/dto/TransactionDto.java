package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "transactiondto")
public class TransactionDto implements Serializable    {


    @Element(name = "transactionid" , required = false)
    private Long transactionId;

    @Element(name = "transactiontotal")
    private Float transactionTotal;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "transactiontype")
    private String transactionType;

    @Element(name = "transactionproofdto" , required = false)
    private TransactionProofDto transactionProof;

    @Element(name = "transactiondate")
    private Date transactionDate;


    public Long getTransactionId()   {
        return this.transactionId;
    }

    public void setTransactionId(Long transactionId)   {
        this.transactionId = transactionId;
    }

    public Float getTransactionTotal()   {
        return this.transactionTotal;
    }

    public void setTransactionTotal(Float transactionTotal)   {
        this.transactionTotal = transactionTotal;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public String getTransactionType()   {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType)   {
        this.transactionType = transactionType;
    }

    public TransactionProofDto getTransactionProof()   {
        return this.transactionProof;
    }

    public void setTransactionProof(TransactionProofDto transactionProof)   {
        this.transactionProof = transactionProof;
    }

    public Date getTransactionDate()   {
        return this.transactionDate;
    }

    public void setTransactionDate(Date transactionDate)   {
        this.transactionDate = transactionDate;
    }

}