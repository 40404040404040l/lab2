package Moves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon deff, double damage) {
        super.applyOppDamage(deff, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.2){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Waterfall";
    }
}