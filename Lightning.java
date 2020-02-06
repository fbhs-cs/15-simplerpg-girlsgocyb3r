public abstract class Lightning extends Spell {
    private int dmg;
    private String SPELL_TYPE;
    public Lightning(int dmg) {
        super(dmg,"Light",5);
        SPELL_TYPE = "Lightning";
    }
    @Override
    public int cast(Character sender, Character receiver) {
        if(sender.getMana() >= getManaReq()) {
            sender.setMana(sender.getMana()-getManaReq());
            if (receiver.isWeakTo("Light")){
                receiver.setHP(receiver.getHP()-dmg*2);
                return dmg*2;
            }
            else {
                receiver.setHP(receiver.getHP()-dmg);
                return dmg;
            }
        }
        else{
            return 0;
        }


    }
}