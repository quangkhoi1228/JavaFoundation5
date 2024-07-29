package class19;

public class Champion {
    private int AD;
    private int AP;
    private String name;

    // constructor không có parameter ==> contructor mặc định
    Champion() {

    }

    Champion(String championName, int championAD, int championAP) {
        this.name = championName;
        this.AD = championAD;
        this.AP = championAP;
    }


    public int getAD() {
        return this.AD;
    }

    public void setAD(int newADValue) {
        this.AD = newADValue; // 56
    }

    public int getAP() {
        return this.AP;
    }

    public void setAP(int newAPValue) {
        this.AP = newAPValue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newNameValue) {
        this.name = newNameValue;
    }
}
