package com.estudio.listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicios prácticos de ArrayList para practicar
 * Basados en las preguntas del examen
 */
public class EjerciciosArrayList {

    /**
     * Ejercicio 1: Diferencia entre remove(índice) y remove(objeto)
     */
    public static void ejercicio1() {
        System.out.println("=== EJERCICIO 1: remove(2) vs remove(Integer.valueOf(2)) ===\n");
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(10);
        numeros.add(2);
        
        System.out.println("Lista original: " + numeros);
        
        // Caso A: remove(2) elimina por ÍNDICE
        ArrayList<Integer> caso1 = new ArrayList<>(numeros);
        caso1.remove(2);
        System.out.println("remove(2) [por índice]: " + caso1);
        
        // Caso B: remove(Integer.valueOf(2)) elimina el VALOR 2
        ArrayList<Integer> caso2 = new ArrayList<>(numeros);
        caso2.remove(Integer.valueOf(2));
        System.out.println("remove(Integer.valueOf(2)) [por valor]: " + caso2);
        
        System.out.println("\n✓ Respuesta: remove(2) elimina índice 2; remove(Integer.valueOf(2)) elimina el valor 2");
        System.out.println();
    }

    /**
     * Ejercicio 2: ¿Qué hace remove(0)?
     */
    public static void ejercicio2() {
        System.out.println("=== EJERCICIO 2: ¿Qué hace remove(0) sobre ['x','y','z']? ===\n");
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add("x");
        lista.add("y");
        lista.add("z");
        
        System.out.println("Lista original: " + lista);
        lista.remove(0);
        System.out.println("Después de remove(0): " + lista);
        
        System.out.println("\n✓ Respuesta: elimina 'x' y queda ['y', 'z']");
        System.out.println();
    }

    /**
     * Ejercicio 3: add() sobre lista vacía
     */
    public static void ejercicio3() {
        System.out.println("=== EJERCICIO 3: add(5) sobre lista vacía ===\n");
        
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Lista vacía: " + numeros);
        System.out.println("size(): " + numeros.size());
        
        numeros.add(5);
        System.out.println("\nDespués de add(5): " + numeros);
        System.out.println("Posición del 5: índice " + 0);
        System.out.println("size(): " + numeros.size());
        
        System.out.println("\n✓ Respuesta: se añade en la posición 0 (el 'final' de una lista vacía es índice 0)");
        System.out.println();
    }

    /**
     * Ejercicio 4: Permite duplicados?
     */
    public static void ejercicio4() {
        System.out.println("=== EJERCICIO 4: ¿ArrayList permite duplicados? ===\n");
        
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Ana");
        
        System.out.println("Lista: " + nombres);
        System.out.println("size(): " + nombres.size());
        System.out.println("Elementos duplicados 'Ana': 3 veces");
        
        System.out.println("\n✓ Respuesta: SÍ, ArrayList permite duplicados");
        System.out.println();
    }

    /**
     * Ejercicio 5: IndexOutOfBoundsException
     */
    public static void ejercicio5() {
        System.out.println("=== EJERCICIO 5: Error IndexOutOfBoundsException ===\n");
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        
        System.out.println("Lista: " + lista);
        System.out.println("size(): " + lista.size());
        System.out.println("Índices válidos: 0 hasta " + (lista.size() - 1));
        
        System.out.println("\nlista.get(0): " + lista.get(0) + " ✓");
        
        try {
            System.out.println("lista.get(1): ");
            lista.get(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  ✗ ERROR: IndexOutOfBoundsException");
            System.out.println("  ✗ Solo existe índice 0, no existe índice 1");
        }
        
        System.out.println("\n✓ Respuesta: Error en tiempo de ejecución - solo existe índice 0");
        System.out.println();
    }

    /**
     * Ejercicio 6: clear() y size()
     */
    public static void ejercicio6() {
        System.out.println("=== EJERCICIO 6: clear() y luego size() ===\n");
        
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        
        System.out.println("Lista original: " + colores);
        System.out.println("size() antes: " + colores.size());
        
        colores.clear();
        
        System.out.println("\nDespués de clear():");
        System.out.println("Lista: " + colores);
        System.out.println("size(): " + colores.size());
        System.out.println("isEmpty(): " + colores.isEmpty());
        
        System.out.println("\n✓ Respuesta: size() devuelve 0 después de clear()");
        System.out.println();
    }

    /**
     * Ejercicio 7: ¿Cuál es el índice del primer elemento?
     */
    public static void ejercicio7() {
        System.out.println("=== EJERCICIO 7: Índice del primer elemento ===\n");
        
        ArrayList<String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        System.out.println("Lista: " + letras);
        System.out.println("Primer elemento: " + letras.get(0));
        System.out.println("Índice del primer elemento: 0");
        
        System.out.println("\n✓ Respuesta: 0 (las colecciones indexadas inician en 0)");
        System.out.println();
    }

    /**
     * Ejercicio 8: Declaración correcta con generics
     */
    public static void ejercicio8() {
        System.out.println("=== EJERCICIO 8: Declaración correcta de lista de double ===\n");
        
        System.out.println("✗ INCORRECTO:");
        System.out.println("  ArrayList<double> precios; // Error: no se usan primitivos");
        
        System.out.println("\n✓ CORRECTO:");
        System.out.println("  ArrayList<Double> precios = new ArrayList<>();");
        
        ArrayList<Double> precios = new ArrayList<>();
        precios.add(19.99);
        precios.add(29.50);
        precios.add(9.99);
        
        System.out.println("\nEjemplo: " + precios);
        
        System.out.println("\n✓ Respuesta: ArrayList<Double> (wrapper Double, no primitivo double)");
        System.out.println();
    }

    /**
     * Ejercicio 9: ¿Qué recorrido usar para imprimir posición + valor?
     */
    public static void ejercicio9() {
        System.out.println("=== EJERCICIO 9: Recorrido para imprimir posición + valor ===\n");
        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        
        System.out.println("Objetivo: imprimir '[posición] valor'");
        System.out.println("\nSolución: for indexado (necesitas el índice)\n");
        
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("[" + i + "] " + frutas.get(i));
        }
        
        System.out.println("\n✓ Respuesta: for indexado (cuando necesitas acceso al índice)");
        System.out.println();
    }

    /**
     * Ejercicio 10: Métodos válidos de ArrayList
     */
    public static void ejercicio10() {
        System.out.println("=== EJERCICIO 10: Métodos válidos de ArrayList ===\n");
        
        System.out.println("Marca los métodos válidos:");
        System.out.println("  [ ] .length()");
        System.out.println("  [✓] .add()");
        System.out.println("  [✓] .remove()");
        System.out.println("  [✓] .clear()");
        System.out.println("  [✓] .size()");
        System.out.println("  [ ] .length");
        
        System.out.println("\n✓ Respuesta: add(), remove(), clear(), size()");
        System.out.println("✗ .length y .length() NO existen en ArrayList");
        System.out.println("  (Recuerda: Array usa .length, ArrayList usa .size())");
        System.out.println();
    }

    /**
     * Ejercicio interactivo: Practicar operaciones
     */
    public static void ejercicioInteractivo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> miLista = new ArrayList<>();
        
        System.out.println("=== EJERCICIO INTERACTIVO: Practica ArrayList ===\n");
        System.out.println("Comandos disponibles:");
        System.out.println("  1. add <elemento>     - Agregar elemento");
        System.out.println("  2. remove <índice>    - Eliminar por índice");
        System.out.println("  3. get <índice>       - Obtener elemento");
        System.out.println("  4. size               - Ver tamaño");
        System.out.println("  5. clear              - Vaciar lista");
        System.out.println("  6. mostrar            - Mostrar lista completa");
        System.out.println("  7. salir              - Terminar");
        
        boolean continuar = true;
        while (continuar) {
            System.out.print("\nLista actual: " + miLista + " (size: " + miLista.size() + ")");
            System.out.print("\nComando: ");
            String comando = scanner.nextLine().trim();
            
            String[] partes = comando.split(" ", 2);
            String accion = partes[0].toLowerCase();
            
            try {
                switch (accion) {
                    case "add":
                        if (partes.length > 1) {
                            miLista.add(partes[1]);
                            System.out.println("✓ Agregado: " + partes[1]);
                        } else {
                            System.out.println("✗ Uso: add <elemento>");
                        }
                        break;
                    
                    case "remove":
                        if (partes.length > 1) {
                            int idx = Integer.parseInt(partes[1]);
                            String eliminado = miLista.remove(idx);
                            System.out.println("✓ Eliminado: " + eliminado);
                        } else {
                            System.out.println("✗ Uso: remove <índice>");
                        }
                        break;
                    
                    case "get":
                        if (partes.length > 1) {
                            int idx = Integer.parseInt(partes[1]);
                            System.out.println("✓ Elemento en [" + idx + "]: " + miLista.get(idx));
                        } else {
                            System.out.println("✗ Uso: get <índice>");
                        }
                        break;
                    
                    case "size":
                        System.out.println("✓ Tamaño: " + miLista.size());
                        break;
                    
                    case "clear":
                        miLista.clear();
                        System.out.println("✓ Lista vaciada");
                        break;
                    
                    case "mostrar":
                        System.out.println("Lista completa:");
                        for (int i = 0; i < miLista.size(); i++) {
                            System.out.println("  [" + i + "] " + miLista.get(i));
                        }
                        break;
                    
                    case "salir":
                        continuar = false;
                        System.out.println("¡Hasta luego!");
                        break;
                    
                    default:
                        System.out.println("✗ Comando no reconocido");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("✗ Error: Índice fuera de rango (0 hasta " + (miLista.size() - 1) + ")");
            } catch (NumberFormatException e) {
                System.out.println("✗ Error: Debes ingresar un número válido");
            }
        }
    }

    /**
     * Ejecutar todos los ejercicios
     */
    public static void ejecutarTodos() {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   EJERCICIOS DE ARRAYLIST - GUÍA DE ESTUDIO             ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        // Descomentar para ver todos los ejercicios
        ejecutarTodos();
        
        // Descomentar para modo interactivo
        // ejercicioInteractivo();
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LOS EJERCICIOS                                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
