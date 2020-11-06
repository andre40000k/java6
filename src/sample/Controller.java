package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Controller {

    @FXML
    public TextField txtData;

    public Controller() {
        txtData = new TextField();
    }


    public void btn1Control(ActionEvent actionEvent) {
        JasonGet jasonGet = new JasonGet();
        JasonGet.url = "https://ifsc.razorpay.com/KARB0000001";
        jasonGet.run();


        txtData.setText("Waiting for data...");
        String jsonString = jasonGet.jsonIn;
        txtData.setText(jsonString);
        System.out.println(jsonString);




        // Считываем json
        Object obj = " ";
        try
        {
            obj = new JSONParser().parse(jsonString);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println();

        JSONArray jsonArray = (JSONArray) obj;
        System.out.println(jsonArray.toJSONString());
        System.out.println();

        Banks banks = new Banks();

       /* for (Object jsonObject : jsonArray)
        {
            JSONObject object = (JSONObject) jsonObject;
            Bank bank = new Bank((String)object.get("BANK"), (String) object.get("IFSC"),(String) object.get("BRANCH"),(String) object.get("ADDRESS"),
                    (String)object.get("CONTACT"), (String) object.get("CITY"),(String) object.get("DISTRICT"),(String) object.get("STATE"),
                    (boolean)object.get("RTGS"), (String) object.get("BANKCODE"));


            banks.add(bank);
        }
        banks.getBanks().sort(Bank.byName);
        System.out.println("After sorting by name ascending:\n" + banks);

         /*System.out.println("Imported data after parsing:\n" + banks);

        banks.getBanks().sort(Bank.byIdAsc);
        System.out.println("After sorting by ID ascending:\n" + banks);*/
    }

    public void btn2Control(ActionEvent actionEvent) {
        
    }

}
