package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Ninetales extends Pokemon {
    public Ninetales(String name, int lvl) {
        super(name, lvl);

        setType(Type.FIRE);
        setMove(new QuickAttack(), new WillOWisp(), new ConfuseRay(), new NastyPlot());
        setStats(73, 76, 75, 81, 100, 100);
    }
}