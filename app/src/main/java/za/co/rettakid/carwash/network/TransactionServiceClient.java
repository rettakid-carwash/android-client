package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class TransactionServiceClient extends BaseClient   {

    public TransactionServiceClient(Context context) {
        super("/transactionservices",context);
    }

    public TransactionServiceListDto getTransactionServices()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, TransactionServiceListDto.class);
    }

    public TransactionServiceDto getTransactionServices(Long transactionServiceId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, TransactionServiceDto.class,transactionServiceId);
    }

    public TransactionServiceDto postTransactionService(TransactionServiceDto transactionServiceDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, transactionServiceDto, TransactionServiceDto.class);
    }

    public TransactionServiceListDto postTransactionService(TransactionServiceListDto transactionServiceListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, transactionServiceListDto, TransactionServiceListDto.class);
    }

    public void putTransactionService(TransactionServiceDto transactionServiceDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, transactionServiceDto, TransactionServiceDto.class,transactionServiceDto.getTransactionServiceId());
    }

    public void deleteTransactionService(Long transactionServiceId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,transactionServiceId);
    }

}