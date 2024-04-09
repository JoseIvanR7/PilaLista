
package pilaed;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class PilaLista {
    private ArrayList<Integer> list = new ArrayList<>();
    
    public void Agregar(int value) {
        list.add(value);
    }
    public int Eliminar() {
        if (EstaVacia()) {
            throw new EmptyStackException();
        }
        int value = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return value;
    }

    public int Devuelve () {
        if (EstaVacia()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }
    public boolean EstaVacia() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }
    public static void main(String[] args) {
        PilaLista stack = new PilaLista();
        stack.Agregar(1);
        stack.Agregar(2);
        stack.Agregar(3);
        stack.Agregar(4);
        stack.Agregar(5);
        stack.Agregar(6);
        
        System.out.println("Peek: " + stack.Devuelve());
        System.out.println("Pop: " + stack.Eliminar());
        System.out.println("Peek: " + stack.Devuelve());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Is empty: " + stack.EstaVacia());
    }
}
