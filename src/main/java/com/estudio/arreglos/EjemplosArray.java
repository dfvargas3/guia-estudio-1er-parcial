package com.estudio.arreglos;

/**
 * Ejemplos prácticos de Arrays (arreglos) en Java
 * Conceptos clave para el examen parcial
 */
public class EjemplosArray {

    /**
     * 1. Conceptos básicos: declaración y características
     */
    public static void conceptosBasicos() {
        System.out.println("=== 1. CONCEPTOS BÁSICOS DE ARRAYS ===\n");
        
        // Declaración de arrays (tamaño FIJO)
        int[] numeros = new int[5];      // Array de 5 enteros
        String[] nombres = new String[3]; // Array de 3 strings
        double[] precios = {19.99, 29.50, 9.99}; // Inicialización directa
        
        System.out.println("✓ Array creado con tamaño FIJO");
        System.out.println("✓ Tamaño de numeros: " + numeros.length);
        System.out.println("✓ Tamaño de nombres: " + nombres.length);
        System.out.println("✓ Tamaño de precios: " + precios.length);
        
        System.out.println("\n⚠ IMPORTANTE: El tamaño es FIJO, no puede cambiar");
        System.out.println();
    }

    /**
     * 2. Atributo .length: obtener tamaño
     */
    public static void atributoLength() {
        System.out.println("=== 2. ATRIBUTO .LENGTH (NO ES MÉTODO) ===\n");
        
        int[] a = {10, 20, 30};
        String[] s = {"Hola", "Mundo"};
        
        System.out.println("Array a: " + java.util.Arrays.toString(a));
        System.out.println("a.length: " + a.length + " ✓");
        
        System.out.println("\nArray s: " + java.util.Arrays.toString(s));
        System.out.println("s.length: " + s.length + " ✓");
        
        System.out.println("\n✓ .length es un ATRIBUTO (sin paréntesis)");
        System.out.println("✗ .length() NO EXISTE en arrays (daría error)");
        
        System.out.println("\n⚠ RECORDAR:");
        System.out.println("  Array: .length (atributo)");
        System.out.println("  ArrayList: .size() (método)");
        System.out.println();
    }

    /**
     * 3. Acceso por índice: leer y modificar
     */
    public static void accesoPorIndice() {
        System.out.println("=== 3. ACCESO POR ÍNDICE ===\n");
        
        int[] numeros = {5, 10, 15, 20, 25};
        
        System.out.println("Array: " + java.util.Arrays.toString(numeros));
        
        // Acceso de lectura
        System.out.println("\nAcceso de lectura:");
        System.out.println("numeros[0]: " + numeros[0]);
        System.out.println("numeros[2]: " + numeros[2]);
        System.out.println("numeros[4]: " + numeros[4]);
        
        // Acceso de escritura (modificar)
        System.out.println("\nModificando elementos:");
        numeros[0] = 100;
        numeros[2] = 200;
        System.out.println("Después de modificar: " + java.util.Arrays.toString(numeros));
        
        System.out.println("\n✓ Se accede por índice usando corchetes: array[i]");
        System.out.println("✓ Los índices van de 0 hasta length-1");
        System.out.println();
    }

    /**
     * 4. Recorridos: for tradicional, for-each
     */
    public static void recorridos() {
        System.out.println("=== 4. RECORRIDOS DE ARRAYS ===\n");
        
        String[] frutas = {"Manzana", "Banana", "Naranja", "Pera"};
        
        // For tradicional (con índice)
        System.out.println("1. For tradicional (con índice):");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("  [" + i + "] " + frutas[i]);
        }
        
        // For-each (sin índice)
        System.out.println("\n2. For-each (sin índice):");
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }
        
        // While
        System.out.println("\n3. While (alternativa):");
        int i = 0;
        while (i < frutas.length) {
            System.out.println("  - " + frutas[i]);
            i++;
        }
        
        System.out.println("\n✓ Usa .length para el tamaño en loops");
        System.out.println("✓ For-each también funciona con arrays");
        System.out.println();
    }

    /**
     * 5. Inicialización de arrays
     */
    public static void inicializacion() {
        System.out.println("=== 5. FORMAS DE INICIALIZAR ARRAYS ===\n");
        
        // Forma 1: Declarar tamaño (valores por defecto)
        int[] numeros1 = new int[3];
        System.out.println("1. new int[3]: " + java.util.Arrays.toString(numeros1));
        System.out.println("   (valores por defecto: 0 para int)");
        
        // Forma 2: Inicialización con valores
        int[] numeros2 = {10, 20, 30};
        System.out.println("\n2. {10, 20, 30}: " + java.util.Arrays.toString(numeros2));
        
        // Forma 3: new int[] con valores
        int[] numeros3 = new int[]{40, 50, 60};
        System.out.println("\n3. new int[]{40, 50, 60}: " + java.util.Arrays.toString(numeros3));
        
        // Valores por defecto según tipo
        System.out.println("\nValores por defecto según tipo:");
        boolean[] bools = new boolean[2];
        double[] doubles = new double[2];
        String[] strings = new String[2];
        
        System.out.println("  boolean[]: " + java.util.Arrays.toString(bools) + " (false)");
        System.out.println("  double[]:  " + java.util.Arrays.toString(doubles) + " (0.0)");
        System.out.println("  String[]:  " + java.util.Arrays.toString(strings) + " (null)");
        
        System.out.println("\n✓ Arrays se inicializan con valores por defecto");
        System.out.println();
    }

    /**
     * 6. Operaciones básicas
     */
    public static void operacionesBasicas() {
        System.out.println("=== 6. OPERACIONES BÁSICAS EN ARRAYS ===\n");
        
        int[] numeros = {3, 1, 4, 1, 5};
        
        System.out.println("Array original: " + java.util.Arrays.toString(numeros));
        
        // Buscar un valor
        System.out.println("\n1. Buscar un valor:");
        int buscar = 4;
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        System.out.println("   ¿Existe " + buscar + "? " + encontrado + " (posición: " + posicion + ")");
        
        // Encontrar el máximo
        System.out.println("\n2. Encontrar el máximo:");
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("   Máximo: " + max);
        
        // Sumar todos los elementos
        System.out.println("\n3. Sumar todos los elementos:");
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("   Suma: " + suma);
        
        // Contar elementos que cumplen condición
        System.out.println("\n4. Contar elementos > 2:");
        int contador = 0;
        for (int num : numeros) {
            if (num > 2) {
                contador++;
            }
        }
        System.out.println("   Cantidad: " + contador);
        
        System.out.println("\n✓ Operaciones comunes: buscar, max/min, sumar, contar");
        System.out.println();
    }

    /**
     * 7. Limitaciones de los arrays
     */
    public static void limitaciones() {
        System.out.println("=== 7. LIMITACIONES DE LOS ARRAYS ===\n");
        
        int[] numeros = {1, 2, 3};
        
        System.out.println("Array: " + java.util.Arrays.toString(numeros));
        System.out.println("Tamaño: " + numeros.length);
        
        System.out.println("\n✗ NO SE PUEDEN hacer directamente:");
        System.out.println("  - Cambiar el tamaño (es FIJO)");
        System.out.println("  - Agregar elementos (no hay .add())");
        System.out.println("  - Eliminar elementos (no hay .remove())");
        System.out.println("  - Ordenar automáticamente (hay que usar Arrays.sort())");
        
        System.out.println("\n✓ SI SE PUEDEN hacer:");
        System.out.println("  - Acceder por índice: numeros[0]");
        System.out.println("  - Modificar elementos: numeros[0] = 10");
        System.out.println("  - Recorrer con loops");
        System.out.println("  - Obtener tamaño: numeros.length");
        
        System.out.println("\n⚠ Para redimensionar, necesitas crear un nuevo array");
        int[] nuevoArray = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            nuevoArray[i] = numeros[i];
        }
        System.out.println("Nuevo array más grande: " + java.util.Arrays.toString(nuevoArray));
        
        System.out.println();
    }

    /**
     * 8. Arrays multidimensionales (concepto básico)
     */
    public static void arraysMultidimensionales() {
        System.out.println("=== 8. ARRAYS MULTIDIMENSIONALES (Concepto) ===\n");
        
        // Array bidimensional (matriz)
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nAcceso: matriz[fila][columna]");
        System.out.println("matriz[0][0]: " + matriz[0][0]);
        System.out.println("matriz[1][2]: " + matriz[1][2]);
        System.out.println("matriz[2][1]: " + matriz[2][1]);
        
        System.out.println("\n✓ Arrays multidimensionales son 'arrays de arrays'");
        System.out.println();
    }

    /**
     * Ejecutar todos los ejemplos
     */
    public static void ejecutarTodos() {
        conceptosBasicos();
        atributoLength();
        accesoPorIndice();
        recorridos();
        inicializacion();
        operacionesBasicas();
        limitaciones();
        arraysMultidimensionales();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   EJEMPLOS DE ARRAYS - GUÍA DE ESTUDIO PARCIAL          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        ejecutarTodos();
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LOS EJEMPLOS                                    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
