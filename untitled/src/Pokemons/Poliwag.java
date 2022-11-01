package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Poliwag extends Pokemon {
    public Poliwag(String name, int lvl) {
        super(name, lvl);

        setType(Type.WATER);
        setMove(new Facade(), new Scald());
        setStats(40, 50, 40, 40, 40, 90);
    }
}
