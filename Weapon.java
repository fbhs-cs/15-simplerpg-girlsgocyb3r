
public class Weapon{
        private int dmg;
        private String dmgType;
        private double crit;
        private String WEAPON_TYPE;
        
        public Weapon(int damage, String damageType, double crits){
            dmg = damage;
            dmgType = damageType;
            crit = crits;
            WEAPON_TYPE = "Sword";
        }
        public int attack(Character joe){
            double possible = Math.random();
            if (possible > crit ){
                return dmg;
            }
            if (possible <= crit){
                return dmg * 2;
            }
            return dmg;

        }
        public String getWeaponType(){
            return WEAPON_TYPE;

        }
        
        public String getDmgType(){
            return dmgType;
        }
        public int getDmg(){
            return dmg;
        }
        public double getCrit(){
            return crit;
        }






































}