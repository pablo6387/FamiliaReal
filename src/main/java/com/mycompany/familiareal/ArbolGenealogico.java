package com.mycompany.familiareal;

import java.util.ArrayList;
import java.util.List;

public class ArbolGenealogico {
    Miembro raiz;

    public ArbolGenealogico() {
        this.raiz = null;
    }
    
    public Miembro insertarRec(Miembro actual, Miembro miembro) {
 if (actual == null) {
            actual = miembro; // Insertar en el lugar correcto
            return actual;
        } else if (miembro.getNacimiento().isBefore(actual.getNacimiento())) {
            actual.izq = insertarRec(actual.izq, miembro); // Insertar en el subárbol izquierdo
        } else {
            actual.der = insertarRec(actual.der, miembro); // Insertar en el subárbol derecho
        }
        return actual;
    }

    
    public void insertar(Miembro miembro) {
        raiz = insertarRec(raiz, miembro);
    }
    
        

   
    
        public Miembro buscarAntecesor(Miembro miembro) {
    List<Miembro> camino = new ArrayList<>(); // Lista para guardar el camino recorrido
    Miembro antecesor = buscarAntecesorRec(raiz, miembro, null, camino);
    System.out.println("Camino recorrido:");
    for (int i = 0; i < camino.size(); i++) {
        Miembro m = camino.get(i);
        System.out.println(
            (i > 0 ? "  |\n  V\n" : "") + 
            "Nombre: " + m.getNombre() + 
            ", Fecha de nacimiento: " + m.getNacimiento() + 
            (m.getConyuge().isEmpty() ? "" : ", Cónyuge: " + m.getConyuge()) + 
            " (Antecesor)"
        );
    }
    // Mostrar el miembro seleccionado al final
    System.out.println("  |\n  V\n" + 
        "Nombre: " + miembro.getNombre() + 
        ", Fecha de nacimiento: " + miembro.getNacimiento() + 
        (miembro.getConyuge().isEmpty() ? "" : ", Cónyuge: " + miembro.getConyuge()) + 
        " (Seleccionado)"
    );
    return antecesor;
}
         private Miembro buscarAntecesorRec(Miembro actual, Miembro miembro, Miembro antecesor, List<Miembro> camino) {
    if (actual == null) {
        return antecesor;
    }
    
    // No agregar el nodo actual si es el miembro buscado
    if (!actual.getNombre().equals(miembro.getNombre())) {
        camino.add(actual); // Agregar el nodo actual al camino si no es el miembro buscado
    }

    if (actual.getNacimiento().isBefore(miembro.getNacimiento())) {
        if (antecesor == null || actual.getNacimiento().isAfter(antecesor.getNacimiento())) {
            antecesor = actual;
        }
        return buscarAntecesorRec(actual.der, miembro, antecesor, camino); // Buscar en el subárbol derecho
    } else if (actual.getNacimiento().isAfter(miembro.getNacimiento())) {
        return buscarAntecesorRec(actual.izq, miembro, antecesor, camino); // Buscar en el subárbol izquierdo
    } else {
        // Si la fecha de nacimiento es la misma, el nodo actual es el ancestro más cercano
        return antecesor;
    }
}
    
}