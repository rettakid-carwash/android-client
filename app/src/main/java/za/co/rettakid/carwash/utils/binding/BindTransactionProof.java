package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindTransactionProof {

    public static TransactionProofVo bindTransactionProof(TransactionProofDto transactionProofDto) {
        TransactionProofVo transactionProofVo = null;
        if (transactionProofDto != null)    {
            transactionProofVo = new TransactionProofVo();
            transactionProofVo.setRealTransactionProofId(transactionProofDto.getTransactionProofId());
            transactionProofVo.setRealTransactionProofUrl(transactionProofDto.getTransactionProofUrl());
            transactionProofVo.setRealTransactionProofFile(transactionProofDto.getTransactionProofFile());
        }
        return transactionProofVo;
    }

    public static TransactionProofDto bindTransactionProof(TransactionProofVo transactionProofVo) {
        TransactionProofDto transactionProofDto = null;
        if (transactionProofVo != null)    {
            transactionProofDto = new TransactionProofDto();
            transactionProofDto.setTransactionProofId(transactionProofVo.getRealTransactionProofId());
            transactionProofDto.setTransactionProofUrl(transactionProofVo.getRealTransactionProofUrl());
            transactionProofDto.setTransactionProofFile(transactionProofVo.getRealTransactionProofFile());
        }
        return transactionProofDto;
    }

}
