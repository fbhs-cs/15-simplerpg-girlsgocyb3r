public abstract class  polycondensation extends Spell {
    private int dmg;
    private String SPELL_TYPE;
    public  polycondensation(int dmg) {
        super(dmg,"Plastic",5);
       
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