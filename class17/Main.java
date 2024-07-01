package class17;

public class Main {
    /**
     * Xây dựng 1 con tướng liên minh có
     * 1. các chỉ số: Tấn công, phòng thủ, di chuyển,
     * tầm đánh
     * <p>
     * Có 4 chiêu thức
     * <p>
     * Khi gọi chiêu thức thì sẽ thực hiện tấn công bằng
     * chiêu thức đó (in ra màn hình tên của chiêu thức)
     * <p>
     * Trong trường hoợp nhấn Q thì in ra "Tôi đã dùng
     * skill Q"
     * <p>
     * <p>
     * Cho yasuo chém riven 1 hit
     * Cho riven chém yasuo 1 hit
     * <p>
     * -> Tính máu bị mất của 2
     */

    public static void main(String[] args) {
        Champion yasuo = new Champion();
        yasuo.name = "Yasuo";
        yasuo.armor = 40;
        yasuo.attackDamage = 65;
        yasuo.HP = 650;
        yasuo.skillQ();

        Champion riven = new Champion();
        riven.name = "Riven";
        riven.armor = 40;
        riven.attackDamage = 70;
        riven.HP = 700;
        riven.skillR();

        int yasuoDame = yasuo.finallyDame(riven.armor);
        int rivenDame = riven.finallyDame(yasuo.armor);

        System.out.println("yasuoDame: " + yasuoDame);
        System.out.println("rivenDame: " + rivenDame);


        Skill baoKiem = new Skill();
        baoKiem.name = "Bão kiếm";
        baoKiem.AD = yasuo.attackDamage;
        baoKiem.AP = yasuo.abilityPower;
        baoKiem.percentAD = 1.05;
        baoKiem.percentAP = 0;
        baoKiem.skillDame();

    }


}
