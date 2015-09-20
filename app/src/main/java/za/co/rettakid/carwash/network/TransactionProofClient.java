package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class TransactionProofClient extends BaseClient   {

    public TransactionProofClient(Context context) {
        super("/transactionproofs",context);
    }

    public TransactionProofListDto getTransactionProofs()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, TransactionProofListDto.class);
    }

    public TransactionProofDto getTransactionProofs(Long transactionProofId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, TransactionProofDto.class,transactionProofId);
    }

    public TransactionProofDto postTransactionProof(TransactionProofDto transactionProofDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, transactionProofDto, TransactionProofDto.class);
    }

    public TransactionProofListDto postTransactionProof(TransactionProofListDto transactionProofListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, transactionProofListDto, TransactionProofListDto.class);
    }

    public void putTransactionProof(TransactionProofDto transactionProofDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, transactionProofDto, TransactionProofDto.class,transactionProofDto.getTransactionProofId());
    }

    public void deleteTransactionProof(Long transactionProofId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,transactionProofId);
    }

}