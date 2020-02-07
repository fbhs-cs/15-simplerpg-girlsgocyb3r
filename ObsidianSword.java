public class ObsidianSword extends Weapon{
    public ObsidianSword(int dmg,int crit){
        super(dmg,"Dark", crit);
        WEAPON_TYPE = "Sword";
    }
    @Override
    public int attack(Character target){
        double possible = Math.random();

        if (target.isWeakTo(WEAPON_TYPE)){
            if(possible <= this.getCrit() ){
                target.takeDmg(this.getDmg() * 4);
                System.out.println("A critical hit and it's super effective!");
                return this.getDmg() * 4;
            }
            target.takeDmg(this.getDmg() + 5);
            System.out.println("It's super effective!");
            return this.getDmg() + 5;

        }

        else if (possible <= this.getCrit()){
            target.takeDmg(this.getDmg() * 2);
            System.out.println("A critical hit!");
            return this.getDmg() * 2;
        }
        target.takeDmg(this.getDmg());
        return this.getDmg();


    }
}