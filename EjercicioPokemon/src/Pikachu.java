public class Pikachu extends Pokemon implements Electrico{
    @Override
    public void atacarImpactrueno() {
        System.out.println(this.nombrePokemon + " ATAQUE IMPACTRUENO!!");
    }

    @Override
    public void atacarPuntoTrueno() {
        System.out.println(this.nombrePokemon + " ATAQUE PUNTO TRUENO!!");
    }

    @Override
    public void atacarConTodo() {
        ataquePlacaje();
        araniazo();
        mordisco();
        atacarImpactrueno();
        atacarPuntoTrueno();
    }
}
