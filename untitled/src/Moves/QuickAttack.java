package Moves;
import ru.ifmo.se.pokemon.*;
public class QuickAttack extends PhysicalMove {
    public QuickAttack() {
        super(Type.NORMAL, 40, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon deff, double damage) {
        super.applyOppDamage(deff, damage);
    }

    @Override
    protected String describe() {
        return "использует Quick Attack";
    }
}
