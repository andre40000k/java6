package sample;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Banks implements Serializable
{

    private ArrayList<Bank> banks;

    public Banks(ArrayList<Bank> banks) {
        this.banks = banks;
    }

    public Banks(){
        banks = new ArrayList<>();
    }

    public ArrayList<Bank> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<Bank> jokes) {
        this.banks = banks;
    }

    public void add(Bank bank) {
        this.banks.add(bank);
    }

    @Override
    public String toString() {

        String result = "";
        for (Bank j : banks) {
            result += j + System.lineSeparator();
        }
        return result;
    }
}
