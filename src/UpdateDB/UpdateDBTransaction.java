package UpdateDB;

/**
 * This class is used when transaction successful
 */
import entity.invoice.Invoice;
import entity.transaction.TransactionInfo;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public interface UpdateDBTransaction {
	/**
	 * insert invoice, insert/update order of the invoice to db
	 * @param invoice
	 * @throws SQLException
	 */
    void updateDB(Invoice invoice) throws SQLException;

    /**
     * Move to result screen
     * @param stage
     * @param invoice
     * @param transactionResult
     * @throws IOException
     */
    void moveToResultScreenHandler(Stage stage, Invoice invoice, TransactionInfo transactionResult) throws IOException;
}
