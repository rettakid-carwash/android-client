package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "transactionservicedto")
public class TransactionServiceDto implements Serializable    {


    @Element(name = "transactionserviceid" , required = false)
    private Long transactionServiceId;

    @Element(name = "transactiondto")
    private TransactionDto transaction;

    @Element(name = "servicedto")
    private ServiceDto service;


    public Long getTransactionServiceId()   {
        return this.transactionServiceId;
    }

    public void setTransactionServiceId(Long transactionServiceId)   {
        this.transactionServiceId = transactionServiceId;
    }

    public TransactionDto getTransaction()   {
        return this.transaction;
    }

    public void setTransaction(TransactionDto transaction)   {
        this.transaction = transaction;
    }

    public ServiceDto getService()   {
        return this.service;
    }

    public void setService(ServiceDto service)   {
        this.service = service;
    }

}