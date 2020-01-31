
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
        
        /** 
         * @param Character class that is the charcter they are attacking  and then
         * decides if it crits or not
         * @return how much damage it does
         */
        public int attack(Character joe){
            double possible = Math.random();
            if (joe.isWeakTo(WEAPON_TYPE)){
                if(possible <= crit ){
                    joe.takeDmg(dmg + 5 * 2);
                    return dmg + 5 * 2;
                }
                joe.takeDmg(dmg + 5);
                return dmg + 5;

            }

            else if (possible <= crit){
                joe.takeDmg(dmg * 2);
                return dmg * 2;
            }
            joe.takeDmg(dmg);
            return dmg;


        }
        
        /** 
         * @return what type of weapon type it is
         */
        public String getWeaponType(){
            return WEAPON_TYPE;

        }
        
        
        /** 
         * @return what dmg type
         */
        public String getDmgType(){
            return dmgType;
        }
        
        /** 
         * @return how much damge it can do
         */
        public int getDmg(){
            return dmg;
        }
        
        /** 
         * @return double
         */
        public double getCrit(){
            return crit;
        }
        
        /** 
         * @return String
         */
        public String toString(){
            return "Weapon damage: " + dmg + "Weapon damagetype: " + dmgType + "Crit chance: " + crit;
        }





































}