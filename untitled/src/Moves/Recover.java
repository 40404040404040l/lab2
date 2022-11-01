package Moves;
import ru.ifmo.se.pokemon.*;
public class Recover extends StatusMove {
    public Recover() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        double HP = p.getHP();
        p.setMod(Stat.HP, (int) -(HP/2));
    }

    @Override
    protected String describe() {
        return "использует Recover";
    }
}


