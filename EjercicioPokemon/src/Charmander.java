public class Charmander extends Pokemon implements Fuego {

    @Override
    public void atacarPuntoFuego() {
        System.out.println(this.nombrePokemon + " ATAQUE PUNTO FUEGO!!");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println(this.nombrePokemon + " ATAQUE LANZA LLAMAS!!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(this.nombrePokemon + " ATAQUE ASCUAS!!");
    }

    @Override
    protected void atacarConTodo() {
        ataquePlacaje();
        araniazo();
        mordisco();
        atacarPuntoFuego();
        atacarLanzaLlamas();
        atacarAscuas();
    }
}