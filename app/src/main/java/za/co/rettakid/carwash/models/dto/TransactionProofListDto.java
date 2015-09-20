package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "transactionprooflistdto")
public class TransactionProofListDto   {

    @ElementList(name = "transactionproofs",type = TransactionProofDto.class)
    private List<TransactionProofDto> transactionProofs;

    public List<TransactionProofDto> getTransactionProofList()   {
        return this.transactionProofs;
    }

    public void setTransactionProofList(List<TransactionProofDto> transactionProofs)   {
        this.transactionProofs = transactionProofs;
    }
}