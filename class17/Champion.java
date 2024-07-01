package class17;

public class Champion {

    // Class attribute
    String name;

    int HP;
    int attackDamage;
    int abilityPower;
    int armor;
    int abilityArmor;

    int attackRange;
    int moveSpeed;

    // 4 skills
    // Class attribute
    public void skillQ() {
        System.out.println("Tôi là " + name + " đã dùng skill Q");
    }

    public void skillW() {
        System.out.println("Tôi là " + name + " đã dùng skill W");
    }

    public void skillE() {
        System.out.println("Tôi là " + name + " đã dùng skill E");
    }

    public void skillR() {
        System.out.println("Tôi là " + name + " đã dùng skill R");
    }

    public int finallyDame(int enemyArmor) {
        return (attackDamage * 100) / (100 + enemyArmor);
    }



}
