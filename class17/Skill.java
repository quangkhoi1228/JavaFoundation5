package class17;

public class Skill {
    String name;
    String desciption;
    int AD;
    int AP;
    double percentAD;
    double percentAP;

    public void skillDame() {
        double dame = AD * percentAD + AP * percentAP;
        System.out.println(name + " đã gây : " + dame);
    }

}
