package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindTransactionService {

    public static TransactionServiceVo bindTransactionService(TransactionServiceDto transactionServiceDto) {
        TransactionServiceVo transactionServiceVo = null;
        if (transactionServiceDto != null)    {
            transactionServiceVo = new TransactionServiceVo();
            transactionServiceVo.setRealTransactionServiceId(transactionServiceDto.getTransactionServiceId());
            transactionServiceVo.setRealTransaction(BindTransaction.bindTransaction(transactionServiceDto.getTransaction()));
            transactionServiceVo.setRealService(BindService.bindService(transactionServiceDto.getService()));
        }
        return transactionServiceVo;
    }

    public static TransactionServiceDto bindTransactionService(TransactionServiceVo transactionServiceVo) {
        TransactionServiceDto transactionServiceDto = null;
        if (transactionServiceVo != null)    {
            transactionServiceDto = new TransactionServiceDto();
            transactionServiceDto.setTransactionServiceId(transactionServiceVo.getRealTransactionServiceId());
            transactionServiceDto.setTransaction(BindTransaction.bindTransaction(transactionServiceVo.getRealTransaction()));
            transactionServiceDto.setService(BindService.bindService(transactionServiceVo.getRealService()));
        }
        return transactionServiceDto;
    }

}
