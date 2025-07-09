public class Matango extends Monster {
    public Matango(char suffix, int hp) {
        super(suffix, hp);
    }

    public void attack(Creature target) {
        int damage = 6;
        System.out.println("お化けキノコ" + getSuffix() + "は体当たり攻撃！" + target.getName() + "に" + damage + "のダメージを与えた！");
        target.setHp(target.getHp() - damage);
    }
}
