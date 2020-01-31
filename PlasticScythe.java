public class PlasticScythe extends Weapon{
    public PlasticScythe(int dmg,int crit){
        super(dmg,"Plastic", crit);
        WEAPON_TYPE = "Sycthe";
    }
    @Override
    public int attack(Character target){
        double possible = Math.random();

        if (target.isWeakTo(WEAPON_TYPE)){
            if(possible <= this.getCrit() ){
                target.takeDmg(this.getDmg() + 5 * 2);
                System.out.println("The plastic does a lot of damage to you and the earth.");
                return this.getDmg() + 5 * 2;
            }
            target.takeDmg(this.getDmg() + 5);
            System.out.println("You are weak to plastic much like the earth.");
            return this.getDmg() + 5;

        }

        else if (possible <= this.getCrit()){
            target.takeDmg(this.getDmg() * 2);
            System.out.println("Oh you didn't get lucky with this crit just like the earth not getting lucky with plastic");
            return this.getDmg() * 2;
        }
        target.takeDmg(this.getDmg());
        System.out.println("It only did base damage but it dealt massive damage to fish life.");
        return this.getDmg();


    }
    

    







































}