import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      /*  List<Persona> personas = new ArrayList<Persona>();
        Persona persona1 = new Persona(1, "Luis", 22);
        Persona persona2 = new Persona(2, "Cristina", 20);
        Persona persona3 = new Persona(3, "Wilfri", 24);
        Persona persona4 = new Persona(4, "Pariente", 45);

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        System.out.println("-------FOR-----");
        for(int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i).getNombre());
        }

        System.out.println("------FOREACH-------");
        for(Persona perso:personas){
            System.out.println(perso.getNombre());
        }*/

        Stack<Integer> numero = new Stack<Integer>();
        System.out.println("Lista vacia: " + numero);
        System.out.println("La lista esta vacia? " + numero.isEmpty());
        numero.push(1);
        numero.push(2);
        numero.push(3);
        numero.push(4);
        numero.push(5);

        for(Integer num:numero){
            System.out.println(num);
        }

        System.out.println("Pila: " + numero);
        System.out.println("La pila esta vacia ?" + numero.isEmpty());

        numero.pop();
        System.out.println("Esta el 3? " + numero.search(3));
        System.out.println("Ultimo agregado: " + numero.peek());
    }
}