public class Civic extends Weapon {
    public Civic(int dmg, int crit) {
        super(dmg,"Dark",crit);
        WEAPON_TYPE = "2001 Honda Civic";
    }
    @Override
    public int attack(Character target) {
        double critical = Math.random();

        if (target.isWeakTo(WEAPON_TYPE)) {
            if (critical <= this.getCrit()) {
                target.takeDmg(this.getDmg() + 5 * 2);
                System.out.println("The 2001 Honda Civic hits you and breaks its own windshield in the process.");
                return this.getDmg() + 5 * 2;
            }
            return this.getDmg() + 5;
        }
    }
}