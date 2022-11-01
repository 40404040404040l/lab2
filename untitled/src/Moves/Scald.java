package Moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon deff, double damage) {
        super.applyOppDamage(deff, damage);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.3){
            Effect e = new Effect().condition(Status.BURN);
            p.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "использует Scald";
    }
}