import Pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Battleground {
    public static void main(String[] args) {
        Battle field = new Battle();

        field.addAlly( new Corsola("Corsola", 1) );
        field.addAlly( new Vulpix("Vulpix", 1) );
        field.addAlly( new Ninetales("Ninetales", 1) );

        field.addFoe( new Poliwag("Poliwag", 1) );
        field.addFoe( new Poliwhirl("Poliwhirl", 1) );
        field.addFoe( new Politoed("Politoed", 1) );

        field.go();
    }
}
