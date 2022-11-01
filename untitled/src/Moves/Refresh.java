package Moves;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Status cond = p.getCondition();
        if (cond.equals(Status.BURN) || cond.equals(Status.PARALYZE) || cond.equals(Status.POISON)) {
            super.applyOppEffects(p);
            Effect e = new Effect().condition(Status.NORMAL);
            p.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "использует Refresh";
    }
}