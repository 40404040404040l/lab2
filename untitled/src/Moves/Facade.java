package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon deff, double damage) {
        Status cond = deff.getCondition();
        if (cond.equals(Status.BURN) || cond.equals(Status.PARALYZE) || cond.equals(Status.POISON)) {
            super.applyOppDamage(deff, damage*2);
        }
        else {
            super.applyOppDamage(deff, damage);
        }
    }
    @Override
    protected String describe() {
        return "использовал Facade";
    }
}
