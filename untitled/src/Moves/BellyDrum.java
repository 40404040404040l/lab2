package Moves;

import ru.ifmo.se.pokemon.*;

public class BellyDrum extends StatusMove {
    public BellyDrum() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        double HP = (int) p.getHP();
        if ( HP/2 > 0 ) {
            p.setMod(Stat.HP, (int) +HP/2);
            p.setMod(Stat.ATTACK, 6);

        }
    }

    @Override
    protected String describe() {
        return "использует Belly Drum";
    }
}