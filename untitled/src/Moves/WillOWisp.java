package Moves;
import ru.ifmo.se.pokemon.*;
public class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, 85);
    }

    protected void applyOppDamage(Pokemon p) {
        Effect e = new Effect().condition(Status.BURN);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "использует Will-O-Wisp";
    }
}


