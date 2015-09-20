package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "transactionservicelistdto")
public class TransactionServiceListDto   {

    @ElementList(name = "transactionservices",type = TransactionServiceDto.class)
    private List<TransactionServiceDto> transactionServices;

    public List<TransactionServiceDto> getTransactionServiceList()   {
        return this.transactionServices;
    }

    public void setTransactionServiceList(List<TransactionServiceDto> transactionServices)   {
        this.transactionServices = transactionServices;
    }
}