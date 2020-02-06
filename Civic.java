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
                System.out.println("The 2001 Honda Civic runs you over with ease.");
                return this.getDmg() + 5 * 2;
            }
            target.takeDmg(this.getDmg() + 5);
            System.out.println("The 2001 Honda Civic hits you but breaks its own windshield in the process.");
            return this.getDmg() + 5;
        }
        else if (critical <= this.getCrit()) {
            target.takeDmg(this.getDmg() * 2);
            System.out.println("The 2001 Honda Civic hits you but dents itself in the process.");
            return this.getDmg() * 2;
        }
        target.takeDmg(this.getDmg());
        System.out.println("The 2001 Honda Civic hits you while playing this over its stereo: https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        return this.getDmg();
    }
}