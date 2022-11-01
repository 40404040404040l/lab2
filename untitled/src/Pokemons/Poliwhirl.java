package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Poliwhirl extends Pokemon {
    public Poliwhirl(String name, int lvl) {
        super(name, lvl);

        setType(Type.WATER);
        setMove(new Facade(), new Scald(), new BellyDrum());
        setStats(65, 65, 65, 50, 50, 90);
    }
}
