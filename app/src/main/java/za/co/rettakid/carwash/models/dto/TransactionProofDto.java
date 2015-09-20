package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "transactionproofdto")
public class TransactionProofDto implements Serializable    {


    @Element(name = "transactionproofid" , required = false)
    private Long transactionProofId;

    @Element(name = "transactionproofurl")
    private String transactionProofUrl;

    @Element(name = "transactionprooffile")
    private String transactionProofFile;


    public Long getTransactionProofId()   {
        return this.transactionProofId;
    }

    public void setTransactionProofId(Long transactionProofId)   {
        this.transactionProofId = transactionProofId;
    }

    public String getTransactionProofUrl()   {
        return this.transactionProofUrl;
    }

    public void setTransactionProofUrl(String transactionProofUrl)   {
        this.transactionProofUrl = transactionProofUrl;
    }

    public String getTransactionProofFile()   {
        return this.transactionProofFile;
    }

    public void setTransactionProofFile(String transactionProofFile)   {
        this.transactionProofFile = transactionProofFile;
    }

}