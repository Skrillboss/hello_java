public abstract class Pokemon {

    protected int numPokedex;
    protected  int numPokemon;
    protected String nombrePokemon;
    protected double peso;
    protected int temporada;
    protected char sexo;

    Pokemon(){
    }

    Pokemon(int numPokedex, int numPokemon, String nombrePokemon, double peso, int temporada, char sexo){
        this.numPokedex= numPokedex;
        this.numPokemon = numPokemon;
        this.nombrePokemon = nombrePokemon;
        this.peso = peso;
        this.temporada = temporada;
        this.sexo = sexo;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    protected void ataquePlacaje(){
        System.out.println(this.nombrePokemon + " ataque de placaje");
    }
    protected void araniazo(){
        System.out.println(this.nombrePokemon + " arañazo");
    }
    protected void mordisco(){
        System.out.println(this.nombrePokemon + " mordisco");
    }
    protected abstract void atacarConTodo();
}
