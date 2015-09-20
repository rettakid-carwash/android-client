package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "transactionlistdto")
public class TransactionListDto   {

    @ElementList(name = "transactions",type = TransactionDto.class)
    private List<TransactionDto> transactions;

    public List<TransactionDto> getTransactionList()   {
        return this.transactions;
    }

    public void setTransactionList(List<TransactionDto> transactions)   {
        this.transactions = transactions;
    }
}