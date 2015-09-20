package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindTransaction {

    public static TransactionVo bindTransaction(TransactionDto transactionDto) {
        TransactionVo transactionVo = null;
        if (transactionDto != null)    {
            transactionVo = new TransactionVo();
            transactionVo.setRealTransactionId(transactionDto.getTransactionId());
            transactionVo.setRealTransactionTotal(transactionDto.getTransactionTotal());
            transactionVo.setRealUser(BindUser.bindUser(transactionDto.getUser()));
            transactionVo.setRealTransactionType(transactionDto.getTransactionType());
            transactionVo.setRealTransactionProof(BindTransactionProof.bindTransactionProof(transactionDto.getTransactionProof()));
            transactionVo.setRealTransactionDate(transactionDto.getTransactionDate());
        }
        return transactionVo;
    }

    public static TransactionDto bindTransaction(TransactionVo transactionVo) {
        TransactionDto transactionDto = null;
        if (transactionVo != null)    {
            transactionDto = new TransactionDto();
            transactionDto.setTransactionId(transactionVo.getRealTransactionId());
            transactionDto.setTransactionTotal(transactionVo.getRealTransactionTotal());
            transactionDto.setUser(BindUser.bindUser(transactionVo.getRealUser()));
            transactionDto.setTransactionType(transactionVo.getRealTransactionType());
            transactionDto.setTransactionProof(BindTransactionProof.bindTransactionProof(transactionVo.getRealTransactionProof()));
            transactionDto.setTransactionDate(transactionVo.getRealTransactionDate());
        }
        return transactionDto;
    }

}
