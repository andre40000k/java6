package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class Controller {


    @FXML
    public TextField txtDt, txtDt1, txtDt2,txtDt3,txtDt4,txtDt5,txtDt6,txtDt7,txtDt8,txtDt9,txtDt10,txtDt11,txtDt12,txtDt13,txtDt14;



    public Controller() {
        txtDt = new TextField();
    }


    public void btn1Control(ActionEvent actionEvent) {
        JasonGet jasonGet = new JasonGet();
        JasonGet.url = "https://ifsc.razorpay.com/KARB0000001";
        jasonGet.run();

        //txtDt.setText("Waiting for data...");
        String jsonString = jasonGet.jsonIn;
        //txtDt.setText(jsonString);
        System.out.println(jsonString);

        Object obj = null;
        try
        {
            obj = new JSONParser().parse(jsonString);
        }
        catch (
                ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println(obj);

        JSONObject object = (JSONObject) obj;
        Bank bank = new Bank((String)object.get("BANK"),
                (String) object.get("CITY")
                ,(String) object.get("DISTRICT")
                ,(String) object.get("BRANCH"),
                (Boolean)object.get("RTGS")
                , (String) object.get("CENTRE")
                ,(String) object.get("ADDRESS")
                ,(String) object.get("CONTACT"),
                (Boolean)object.get("NEFT")
                , (Boolean) object.get("IMPS")
                ,(Boolean)object.get("UPI")
                ,(String)object.get("MICR"),
                (String)object.get("STATE"),
                (String) object.get("BANKCODE"),
                (String)object.get("IFSC"));

        System.out.println("After sorting by name ascending:\n" + bank);


        //txtDt.setText(String.valueOf(bank));
        txtDt.setText("Bank: " + String.valueOf(bank.getBANK()));
        txtDt1.setText("CITY: " + String.valueOf(bank.getCITY()));
        txtDt2.setText("DISTRICT: " + String.valueOf(bank.getDISTRICT()));
        txtDt3.setText("BRANCH: " + String.valueOf(bank.getBRANCH()));
        txtDt4.setText("RTGS: " + String.valueOf(bank.getRTGS()));
        txtDt5.setText("CENTRE: " + String.valueOf(bank.getCENTRE()));
        txtDt6.setText("ADDRESS: " + String.valueOf(bank.getADDRESS()));
        txtDt7.setText("CONTACT: " + String.valueOf(bank.getCONTACT()));
        txtDt8.setText("NEFT: " + String.valueOf(bank.getNEFT()));
        txtDt9.setText("IMPS: " + String.valueOf(bank.getIMPS()));
        txtDt10.setText("UPI: " + String.valueOf(bank.getUPI()));
        txtDt11.setText("MICR: " + String.valueOf(bank.getMICR()));
        txtDt12.setText("STATE: " + String.valueOf(bank.getSTATE()));
        txtDt13.setText("BANKCODE: " + String.valueOf(bank.getBANKCODE()));
        txtDt14.setText("IFSC: " + String.valueOf(bank.getIFSC()));

    }
}
