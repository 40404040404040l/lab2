package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Politoed extends Pokemon {
    public Politoed(String name, int lvl) {
        super(name, lvl);

        setType(Type.WATER);
        setMove(new Facade(), new Scald(), new BellyDrum(), new Waterfall());
        setStats(90, 75, 75, 90, 100, 70);
    }
}
