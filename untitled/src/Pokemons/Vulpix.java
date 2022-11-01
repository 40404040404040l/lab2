package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Vulpix extends Pokemon {
    public Vulpix(String name, int lvl) {
        super(name, lvl);

        setType(Type.FIRE);
        setMove(new QuickAttack(), new WillOWisp(), new ConfuseRay());
        setStats(38, 41, 40, 50, 65, 65);
    }
}
