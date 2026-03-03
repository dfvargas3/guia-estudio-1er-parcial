package com.estudio.listas;

import java.util.ArrayList;

/**
 * Ejemplos prácticos de ArrayList
 * Cubre todos los conceptos clave del examen parcial
 */
public class EjemplosArrayList {

    /**
     * 1. Conceptos básicos: creación y características
     */
    public static void conceptosBasicos() {
        System.out.println("=== 1. CONCEPTOS BÁSICOS DE ARRAYLIST ===\n");
        
        // Declaración correcta con wrapper Integer (NO int)
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        
        System.out.println("✓ ArrayList creado correctamente");
        System.out.println("✓ Usa wrapper classes: Integer, String, Double");
        System.out.println("✓ Tamaño inicial: " + numeros.size());
        System.out.println();
    }

    /**
     * 2. Método add(): agregar elementos
     */
    public static void metodoAdd() {
        System.out.println("=== 2. MÉTODO ADD() - AGREGAR ELEMENTOS ===\n");
        
        ArrayList<String> nombres = new ArrayList<>();
        
        // add() agrega al FINAL
        nombres.add("Ana");     // posición 0
        nombres.add("Pedro");   // posición 1
        nombres.add("María");   // posición 2
        nombres.add("Ana");     // posición 3 (PERMITE DUPLICADOS)
        
        System.out.println("Lista: " + nombres);
        System.out.println("Tamaño: " + nombres.size());
        System.out.println("✓ add() agrega al final");
        System.out.println("✓ ArrayList permite duplicados");
        System.out.println();
    }

    /**
     * 3. Método get(): acceder a elementos por índice
     */
    public static void metodoGet() {
        System.out.println("=== 3. MÉTODO GET() - ACCEDER POR ÍNDICE ===\n");
        
        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(20);  // índice 0
        edades.add(25);  // índice 1
        edades.add(30);  // índice 2
        edades.add(35);  // índice 3
        
        System.out.println("Lista: " + edades);
        System.out.println("edades.get(0): " + edades.get(0));
        System.out.println("edades.get(2): " + edades.get(2));
        System.out.println("edades.get(3): " + edades.get(3));
        
        // OJO: get(4) daría error IndexOutOfBoundsException
        System.out.println("\n⚠ IMPORTANTE: get() usa el ÍNDICE");
        System.out.println("⚠ NO confundir con size() o length()");
        System.out.println();
    }

    /**
     * 4. Método size(): cantidad de elementos
     */
    public static void metodoSize() {
        System.out.println("=== 4. MÉTODO SIZE() - CANTIDAD DE ELEMENTOS ===\n");
        
        ArrayList<String> frutas = new ArrayList<>();
        System.out.println("Lista vacía, size(): " + frutas.size());
        
        frutas.add("Manzana");
        System.out.println("Después de add('Manzana'), size(): " + frutas.size());
        
        frutas.add("Banana");
        frutas.add("Naranja");
        System.out.println("Después de 2 add() más, size(): " + frutas.size());
        
        // isEmpty() es útil para verificar si está vacía
        System.out.println("\nLista vacía? " + frutas.isEmpty());
        
        System.out.println("\n✓ size() devuelve el número de elementos");
        System.out.println("✓ Si size() == 0, la lista está vacía");
        System.out.println();
    }

    /**
     * 5. Método remove(): eliminar elementos
     */
    public static void metodoRemove() {
        System.out.println("=== 5. MÉTODO REMOVE() - ELIMINAR ELEMENTOS ===\n");
        
        // Remove por índice
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        
        System.out.println("Lista original: " + colores);
        colores.remove(0);  // Elimina "Rojo"
        System.out.println("Después de remove(0): " + colores);
        
        // Remove por objeto
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Pájaro");
        
        System.out.println("\nLista original: " + animales);
        animales.remove("Gato");  // Elimina el objeto "Gato"
        System.out.println("Después de remove('Gato'): " + animales);
        
        // DIFERENCIA IMPORTANTE con Integer
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        
        System.out.println("\nLista de números: " + nums);
        nums.remove(1);  // Elimina por ÍNDICE 1 (el valor 20)
        System.out.println("remove(1) elimina índice 1: " + nums);
        
        nums.add(20);
        nums.add(2);
        System.out.println("\nLista: " + nums);
        nums.remove(Integer.valueOf(2));  // Elimina el VALUE 2
        System.out.println("remove(Integer.valueOf(2)) elimina el valor 2: " + nums);
        
        System.out.println("\n✓ remove(índice) - elimina por posición");
        System.out.println("✓ remove(objeto) - elimina primera ocurrencia del objeto");
        System.out.println();
    }

    /**
     * 6. Método clear(): vaciar completamente
     */
    public static void metodoClear() {
        System.out.println("=== 6. MÉTODO CLEAR() - VACIAR LISTA ===\n");
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        
        System.out.println("Lista antes de clear(): " + numeros);
        System.out.println("size() antes: " + numeros.size());
        
        numeros.clear();
        
        System.out.println("\nLista después de clear(): " + numeros);
        System.out.println("size() después: " + numeros.size());
        System.out.println("isEmpty() después: " + numeros.isEmpty());
        
        System.out.println("\n✓ clear() elimina TODO el contenido");
        System.out.println("✓ La lista sigue existiendo pero vacía");
        System.out.println();
    }

    /**
     * 7. Recorridos: for-each, for indexado, while
     */
    public static void recorridos() {
        System.out.println("=== 7. RECORRIDOS DE ARRAYLIST ===\n");
        
        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        
        // FOR-EACH: recomendado para imprimir/leer
        System.out.println("1. For-each (ideal para recorrer e imprimir):");
        for (String dia : dias) {
            System.out.println("  - " + dia);
        }
        
        // FOR INDEXADO: útil cuando necesitas el índice
        System.out.println("\n2. For indexado (cuando necesitas posición):");
        for (int i = 0; i < dias.size(); i++) {
            System.out.println("  [" + i + "] " + dias.get(i));
        }
        
        // WHILE: también válido
        System.out.println("\n3. While (alternativa válida):");
        int i = 0;
        while (i < dias.size()) {
            System.out.println("  - " + dias.get(i));
            i++;
        }
        
        System.out.println("\n✓ For-each: simple, ideal para lectura");
        System.out.println("✓ For indexado: cuando necesitas el índice");
        System.out.println("✓ While: alternativa válida");
        System.out.println("⚠ if-else NO recorre, solo evalúa condiciones");
        System.out.println();
    }

    /**
     * 8. Métodos válidos y NO válidos
     */
    public static void metodosValidosInvalidos() {
        System.out.println("=== 8. MÉTODOS VÁLIDOS E INVÁLIDOS ===\n");
        
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("✓ MÉTODOS VÁLIDOS de ArrayList:");
        System.out.println("  - add(elemento)");
        System.out.println("  - get(indice)");
        System.out.println("  - remove(indice o objeto)");
        System.out.println("  - size()");
        System.out.println("  - clear()");
        System.out.println("  - isEmpty()");
        System.out.println("  - contains(objeto)");
        
        System.out.println("\n✗ MÉTODOS INVÁLIDOS (NO EXISTEN):");
        System.out.println("  - length() ← NO existe en ArrayList");
        System.out.println("  - length ← NO existe en ArrayList");
        
        System.out.println("\n⚠ RECORDAR:");
        System.out.println("  Array usa: .length (atributo)");
        System.out.println("  ArrayList usa: .size() (método)");
        System.out.println();
    }

    /**
     * Ejecutar todos los ejemplos
     */
    public static void ejecutarTodos() {
        conceptosBasicos();
        metodoAdd();
        metodoGet();
        metodoSize();
        metodoRemove();
        metodoClear();
        recorridos();
        metodosValidosInvalidos();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   EJEMPLOS DE ARRAYLIST - GUÍA DE ESTUDIO PARCIAL       ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        ejecutarTodos();
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LOS EJEMPLOS                                    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
