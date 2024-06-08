package com.mycompany.familiareal;

import java.time.LocalDate;
import java.util.Scanner;

public class FamiliaReal {

    public static void main(String[] args) {

         Miembro georgeV = new Miembro(LocalDate.of(1865, 6, 3), "George V", "Mary of Teck", 2);
        Miembro edwardVIII = new Miembro(LocalDate.of(1894, 6, 24), "Edward VIII", "", 0);
        Miembro georgeVI = new Miembro(LocalDate.of(1895, 12, 14), "George VI", "Elizabeth Bowes-Lyon", 2);
        Miembro elizabethII = new Miembro(LocalDate.of(1926, 4, 21), "Elizabeth II", "Philip Duke of Edinburgh", 2);
        Miembro princessMargaret = new Miembro(LocalDate.of(1930, 8, 21), "Princess Margaret", "Antony Armstrong-Jones", 0);
        Miembro princeCharles = new Miembro(LocalDate.of(1948, 11, 14), "Prince Charles", "Princess Diana", 2);
        Miembro princessAnne = new Miembro(LocalDate.of(1950, 8, 15), "Princess Anne", "Mark Phillips", 0);
        Miembro princeWilliam = new Miembro(LocalDate.of(1982, 6, 21), "Prince William", "Catherine", 2);
        Miembro princeHenry = new Miembro(LocalDate.of(1984, 9, 15), "Prince Henry", "Meghan", 0);
        Miembro princeGeorge = new Miembro(LocalDate.of(2013, 7, 22), "Prince George", "", 0);
        Miembro princessCharlotte = new Miembro(LocalDate.of(2015, 5, 2), "Princess Charlotte", "", 0);

        // Crear árbol genealógico
        ArbolGenealogico windsor = new ArbolGenealogico();

        int op;
        Scanner entry = new Scanner(System.in);

        do {
            System.out.println("Arbol Genealogico: La Casa de Windsor");
            System.out.println("");
            System.out.println("Elija una opcion: (1, 2, 3)");
            System.out.println("");
            System.out.println("1 - Cargar miembros");
            System.out.println("2 - Buscar antecedores");
            System.out.println("3 - Salir");
            op = entry.nextInt();
            entry.nextLine(); // Consumir newline
            System.out.print("\n\n\n\n");

            switch (op) {
                case 1:

                    // Insertar miembros en el árbol
                    windsor.insertar(georgeV);
                    windsor.insertar(edwardVIII);
                    windsor.insertar(georgeVI);
                    windsor.insertar(elizabethII);
                    windsor.insertar(princessMargaret);
                    windsor.insertar(princeCharles);
                    windsor.insertar(princessAnne);
                    windsor.insertar(princeWilliam);
                    windsor.insertar(princeHenry);
                    windsor.insertar(princeGeorge);
                    windsor.insertar(princessCharlotte);
                    System.out.println("Árbol Genealógico:");
                     
                    System.out.println("Arbol Cargado");
                    break;
                case 2:
                    System.out.println("Elija a un miembro de la Familia Real");
                    System.out.println("");
                    System.out.println("1 - George V");
                    System.out.println("2 - Edward VIII");
                    System.out.println("3 - George VI");
                    System.out.println("4 - Elizabeth II");
                    System.out.println("5 - Princess Margaret");
                    System.out.println("6 - Prince Charles");
                    System.out.println("7 - Princess Anne");
                    System.out.println("8 - Prince William");
                    System.out.println("9 - Prince Henry");
                    System.out.println("10 - Prince George");
                    System.out.println("11 - Princess Charlotte");
                    op = entry.nextInt();
                    Miembro miembro = null;
                    switch (op) {
                        case 1: miembro = georgeV; break;
                        case 2: miembro = edwardVIII; break;
                        case 3: miembro = georgeVI; break;
                        case 4: miembro = elizabethII; break;
                        case 5: miembro = princessMargaret; break;
                        case 6: miembro = princeCharles; break;
                        case 7: miembro = princessAnne; break;
                        case 8: miembro = princeWilliam; break;
                        case 9: miembro = princeHenry; break;
                        case 10: miembro = princeGeorge; break;
                        case 11: miembro = princessCharlotte; break;
                        default: break;
                    }
                    if (miembro != null) {
                        Miembro antecesor = windsor.buscarAntecesor(miembro);
                        if (antecesor != null) {
                            System.out.println("Ancestro más cercano en términos de edad: " + antecesor.getNombre() + ", Fecha de nacimiento: " + antecesor.getNacimiento());
                        } else {
                            System.out.println("No se encontró ancestro cercano.");
                        }
                    }
                    break;
                default:
                    break;
            }

        } while (op != 3);
        entry.close();
        
    }
}