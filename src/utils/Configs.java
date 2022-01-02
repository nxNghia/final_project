package utils;

import java.util.HashMap;
import java.util.Map;

public class Configs {

    // api constants
    public static final String PROCESS_TRANSACTION_URL = "https://ecopark-system-api.herokuapp.com/api/card/processTransaction";
    public static final String appCode = "AkXXrVUanBU=";

    // database Configs
    public static final String DB_URL = "jdbc:mysql://localhost:3306/itss";
    public static final String DB_USERNAME = "nah";
    public static final String DB_PASSWORD = "xnauiagnenhugny";

    // static resource
    public static final String RESULT_SCREEN_PATH = "/views/result.fxml";
    public static final String PAYMENT_SCREEN_PATH = "/views/payment.fxml";
    public static final String SPLASH_SCREEN_PATH = "/views/splash.fxml";
    public static final String HOME_PATH = "/views/home.fxml";
    public static final String STATION_HOME_PATH = "/views/station_home.fxml";
    public static final String STATION_PATH = "/views/station.fxml";
    public static final String BIKE_STATION_PATH = "/views/bike_station.fxml";
    public static final String TRANSACTION_ERROR_SCREEN_PATH = "/views/transaction_error.fxml";
    public static final String RETURN_BIKE_SCREEN_PATH = "/views/return_bike.fxml";
    public static final String BIKE_INFO_PATH = "/views/bike.fxml";
    public static final String RENT_BIKE_INFO_PATH = "/views/rentingBike.fxml";
    public static final String BARCODE_SCREEN_PATH = "/views/barcode_screen.fxml";
    public static final String RENT_BIKE_PATH = "/views/rent_bike.fxml";
    public static final String HOME_SCREEN_PATH = "/views/home.fxml";
    public static final String BIKE_INFO = "/views/bike_info.fxml";
    public static final String RETURN_DOCK_ITEM_PATH = "/views/return_dock_item.fxml";
    public static final String SELECT_DOCK_TO_RETURN_BIKE_PATH = "/views/select_dock_to_return_bike.fxml";
    
    //card information
    public static final String CARD_CODE = "vn_group8_2021";
    public static final String OWNER = "Group 8";
    public static final String CVV = "714";
    public static final String DATE_EXPIRED = "1125";
    

    @SuppressWarnings("serial")
	public static final Map<String, String> errorCodes = new HashMap<String, String>() {{
        put("00", "Transaction successfully");
        put("01", "Invalid card");
        put("02", "Insufficient account balance");
        put("03", "Internal Server Error");
        put("04", "Fraud transaction");
        put("05", "Missing transaction information");
        put("06", "Missing version information");
        put("07", "Invalid amount");
    }};
}
