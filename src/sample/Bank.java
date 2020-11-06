package sample;
import java.io.Serializable;
import java.util.Comparator;

public class Bank implements Serializable
{
    private String bANK;
    private String cITY;
    private String dISTRICT;
    private String bRANCH;
    private Boolean rTGS;
    private String cENTRE;
    private String aDDRESS;
    private String cONTACT;
    private Boolean nEFT;
    private Boolean iMPS;
    private Boolean uPI;
    private String mICR;
    private String sTATE;
    private String bANKCODE;
    private String iFSC;
    private final static long serialVersionUID = 3275387850599514087L;



    public Bank(String bANK, String cITY, String dISTRICT, String bRANCH, Boolean rTGS, String cENTRE, String aDDRESS, String cONTACT, Boolean nEFT, Boolean iMPS, Boolean uPI, String mICR, String sTATE,  String bANKCODE, String iFSC) {
        this.bANK = bANK;
        this.cITY = cITY;
        this.dISTRICT = dISTRICT;
        this.bRANCH = bRANCH;
        this.rTGS = rTGS;
        this.cENTRE = cENTRE;
        this.aDDRESS = aDDRESS;
        this.cONTACT = cONTACT;
        this.nEFT = nEFT;
        this.iMPS = iMPS;
        this.uPI = uPI;
        this.mICR = mICR;
        this.sTATE = sTATE;
        this.bANKCODE = bANKCODE;
        this.iFSC = iFSC;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "CITY='" + cITY + '\n' +
                ", DISTRICT='" + dISTRICT + '\n' +
                ", BRANCH='" + bRANCH + '\n' +
                ", RTGS=" + rTGS + '\n' +
                ", CENTRE='" + cENTRE + '\n' +
                ", ADDRESS='" + aDDRESS + '\n' +
                ", CONTACT='" + cONTACT + '\n' +
                ", NEFT=" + nEFT + '\n' +
                ", IMPS=" + iMPS + '\n' +
                ", UPI=" + uPI + '\n' +
                ", MICR='" + mICR + '\n' +
                ", STATE='" + sTATE + '\n' +
                ", BANK='" + bANK + '\n' +
                ", BANKCODE='" + bANKCODE + '\n' +
                ", IFSC='" + iFSC + '\n' +
                '}';
    }

    public String getCITY() {
        return cITY;
    }

    public void setCITY(String cITY) {
        this.cITY = cITY;
    }

    public String getDISTRICT() {
        return dISTRICT;
    }

    public void setDISTRICT(String dISTRICT) {
        this.dISTRICT = dISTRICT;
    }

    public String getBRANCH() {
        return bRANCH;
    }

    public void setBRANCH(String bRANCH) {
        this.bRANCH = bRANCH;
    }

    public Boolean getRTGS() {
        return rTGS;
    }

    public void setRTGS(Boolean rTGS) {
        this.rTGS = rTGS;
    }

    public String getCENTRE() {
        return cENTRE;
    }

    public void setCENTRE(String cENTRE) {
        this.cENTRE = cENTRE;
    }

    public String getADDRESS() {
        return aDDRESS;
    }

    public void setADDRESS(String aDDRESS) {
        this.aDDRESS = aDDRESS;
    }

    public String getCONTACT() {
        return cONTACT;
    }

    public void setCONTACT(String cONTACT) {
        this.cONTACT = cONTACT;
    }

    public Boolean getNEFT() {
        return nEFT;
    }

    public void setNEFT(Boolean nEFT) {
        this.nEFT = nEFT;
    }

    public Boolean getIMPS() {
        return iMPS;
    }

    public void setIMPS(Boolean iMPS) {
        this.iMPS = iMPS;
    }

    public Boolean getUPI() {
        return uPI;
    }

    public void setUPI(Boolean uPI) {
        this.uPI = uPI;
    }

    public String getMICR() {
        return mICR;
    }

    public void setMICR(String mICR) {
        this.mICR = mICR;
    }

    public String getSTATE() {
        return sTATE;
    }

    public void setSTATE(String sTATE) {
        this.sTATE = sTATE;
    }

    public String getBANK() {
        return bANK;
    }

    public void setBANK(String bANK) {
        this.bANK = bANK;
    }

    public String getBANKCODE() {
        return bANKCODE;
    }

    public void setBANKCODE(String bANKCODE) {
        this.bANKCODE = bANKCODE;
    }

    public String getIFSC() {
        return iFSC;
    }

    public void setIFSC(String iFSC) {
        this.iFSC = iFSC;
    }

    public static Comparator  <Bank> byName = Comparator.comparing(o -> o.bANK);



}
