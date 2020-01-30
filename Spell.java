public class Spell {
    private int dmg;
    private String dmgType;
    private int manaReq;
    private String SPELL_TYPE;

    public void Spell(int dmg, String dmgType, int manaReq) {
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.manaReq = manaReq;
        this.SPELL_TYPE = "Dark";
    }

    /**
     * This method casts a spell.
     * @param sender the character casting the spell
     * @param receiver the character getting hit by the spell
     * @return damage caused by the spell
     */
    public int cast(Character sender, Character receiver) {
        if(sender.getMana() >= getManaReq()) {
            this.dmg = 10;
        }
        else this.dmg = 0;
        return this.dmg;
    }

    /**
     * This returns the damage a spell will deal.
     * @return damage
     */
    public int getDmg() {
        return this.dmg;
    }

    /**
     * This returns the damage type.
     * @return damage type
     */
    public String getDmgType() {
        return this.dmgType;
    }

    /**
     * This returns the amount of mana required to cast a specific spell
     * @return mana required
     */
    public int getManaReq() {
        return this.manaReq;
    }

    /**
     * This returns a string of probably useful information.
     * @return String of useful information
     */
    public String toString() {
        return this.dmg + " " + this.dmgType + " " + this.manaReq + " " + this.SPELL_TYPE;
    }
}