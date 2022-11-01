package Moves;

import ru.ifmo.se.pokemon.*;

public class IcicleSpear extends PhysicalMove {
    public IcicleSpear() {
        super(Type.ICE, 25, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon deff, double damage) {
        super.applyOppDamage(deff, (int) damage * (Math.random() + 3 + 2));
    }


    @Override
    protected String describe() {
        return "использовал Icicle Spear";
    }
}
