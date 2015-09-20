package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class TransactionClient extends BaseClient   {

    public TransactionClient(Context context) {
        super("/transactions",context);
    }

    public TransactionListDto getTransactions()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, TransactionListDto.class);
    }

    public TransactionDto getTransactions(Long transactionId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, TransactionDto.class,transactionId);
    }

    public TransactionDto postTransaction(TransactionDto transactionDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, transactionDto, TransactionDto.class);
    }

    public TransactionListDto postTransaction(TransactionListDto transactionListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, transactionListDto, TransactionListDto.class);
    }

    public void putTransaction(TransactionDto transactionDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, transactionDto, TransactionDto.class,transactionDto.getTransactionId());
    }

    public void deleteTransaction(Long transactionId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,transactionId);
    }

}