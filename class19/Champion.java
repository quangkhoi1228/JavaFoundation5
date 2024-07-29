package class19;

public class Champion {
    // static
    public final String publisher = "Khoa";

    // public
    private String name;
    // private
    private int AD;
    // protected
    private int AP;

    // constructor không có parameter ==> contructor mặc định
    public Champion() { // access modifier = default

    }

    public Champion(String championName, int championAD, int championAP) {
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
