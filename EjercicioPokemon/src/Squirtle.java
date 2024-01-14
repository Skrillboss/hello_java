public class Squirtle extends Pokemon implements Agua{
    @Override
    public void atacarHidrobomba() {
        System.out.println(this.nombrePokemon + " ATAQUE DE HIDROBOMBA!!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(this.nombrePokemon + " ATAQUE BURBUJA!!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(this.nombrePokemon + " ATAQUE PISTOLA DE AGUA!!");
    }

    @Override
    protected void atacarConTodo() {
        ataquePlacaje();
        araniazo();
        mordisco();
        atacarHidrobomba();
        atacarBurbuja();
        atacarPistolaAgua();
    }
}
