public abstract class Spell {
    private int dmg;
    private String dmgType;
    private int manaReq;
    private String SPELL_TYPE;

    /**
     * Constructor for Spell class
     * @param dmg Damage
     * @param dmgType Damage Type
     * @param manaReq Mana Required
     */
    public Spell(int dmg, String dmgType, int manaReq) {
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.manaReq = manaReq;
        this.SPELL_TYPE = SPELL_TYPE;
    }

    /**
     * This method casts a spell.
     * @param sender the character casting the spell
     * @param receiver the character getting hit by the spell
     * @return damage caused by the spell
     */
    public abstract int cast(Character sender, Character receiver);

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
     * This returns the amount of mana required to cast a specific spell.
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
        return "Damage: " + this.dmg + "   Damage Type: " + this.dmgType + "   Mana Required: " + this.manaReq + "   Spell Type: " + this.SPELL_TYPE;
    }
}