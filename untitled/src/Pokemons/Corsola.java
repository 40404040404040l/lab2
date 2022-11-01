package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Corsola extends Pokemon {
    public Corsola(String name, int lvl) {
        super(name, lvl);

        setType(Type.WATER, Type.ROCK);
        setMove(new IcicleSpear(), new Rest(), new Refresh(), new Recover());
        setStats(65, 55, 95, 65, 95, 35);
    }
}
