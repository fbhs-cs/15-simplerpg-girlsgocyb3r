public abstract class Gun extends Spell {
    private int dmg;
    private String SPELL_TYPE;
    public Gun(int dmg, String dmgType) {
        super(60,"Dark",20);
        SPELL_TYPE = "Dark";
    }
    @Override
    public int cast(Character sender, Character receiver) {
        if(sender.getMana() >= getManaReq()) {
            this.dmg = 60;
        }
        else this.dmg = 0;
        return this.dmg;
    }
}