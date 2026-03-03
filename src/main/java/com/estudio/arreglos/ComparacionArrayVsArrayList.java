package com.estudio.arreglos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Comparación detallada entre Array y ArrayList
 * Diferencias clave que preguntan en el examen
 */
public class ComparacionArrayVsArrayList {

    /**
     * 1. Diferencia principal: Tamaño fijo vs dinámico
     */
    public static void tamanioFijoVsDinamico() {
        System.out.println("=== 1. TAMAÑO: FIJO vs DINÁMICO ===\n");
        
        // ARRAY: tamaño FIJO
        System.out.println("ARRAY (tamaño FIJO):");
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println("  Array: " + Arrays.toString(array));
        System.out.println("  Tamaño: " + array.length);
        System.out.println("  ✗ NO puede crecer ni reducirse");
        
        // ARRAYLIST: tamaño DINÁMICO
        System.out.println("\nARRAYLIST (tamaño DINÁMICO):");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println("  Lista: " + lista);
        System.out.println("  Tamaño: " + lista.size());
        
        lista.add(40);  // Puede crecer
        lista.add(50);
        System.out.println("  Después de agregar más: " + lista);
        System.out.println("  Nuevo tamaño: " + lista.size());
        System.out.println("  ✓ Puede crecer y reducirse dinámicamente");
        
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ RESPUESTA CLAVE DEL EXAMEN:");
        System.out.println("  Array: tamaño FIJO");
        System.out.println("  ArrayList: tamaño DINÁMICO");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }

    /**
     * 2. Diferencia: .length vs .size()
     */
    public static void lengthVsSize() {
        System.out.println("=== 2. .LENGTH vs .SIZE() ===\n");
        
        // ARRAY usa .length (ATRIBUTO)
        System.out.println("ARRAY usa .length (ATRIBUTO, sin paréntesis):");
        int[] array = {10, 20, 30};
        System.out.println("  Array: " + Arrays.toString(array));
        System.out.println("  array.length: " + array.length + " ✓");
        System.out.println("  array.length(): ✗ ERROR (no existe)");
        
        // ARRAYLIST usa .size() (MÉTODO)
        System.out.println("\nARRAYLIST usa .size() (MÉTODO, con paréntesis):");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println("  Lista: " + lista);
        System.out.println("  lista.size(): " + lista.size() + " ✓");
        System.out.println("  lista.length: ✗ ERROR (no existe)");
        
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ RESPUESTA CLAVE DEL EXAMEN:");
        System.out.println("  Array: .length (atributo)");
        System.out.println("  ArrayList: .size() (método)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }

    /**
     * 3. Diferencia: Operaciones disponibles
     */
    public static void operacionesDisponibles() {
        System.out.println("=== 3. OPERACIONES DISPONIBLES ===\n");
        
        System.out.println("OPERACIONES EN ARRAY:");
        System.out.println("  ✓ Acceder por índice: array[i]");
        System.out.println("  ✓ Modificar: array[i] = valor");
        System.out.println("  ✓ Recorrer con loops");
        System.out.println("  ✓ Obtener tamaño: array.length");
        System.out.println("  ✗ NO tiene .add()");
        System.out.println("  ✗ NO tiene .remove()");
        System.out.println("  ✗ NO tiene .clear()");
        System.out.println("  (Para ordenar: Arrays.sort())");
        
        System.out.println("\nOPERACIONES EN ARRAYLIST:");
        System.out.println("  ✓ Acceder por índice: lista.get(i)");
        System.out.println("  ✓ Modificar: lista.set(i, valor)");
        System.out.println("  ✓ Recorrer con loops");
        System.out.println("  ✓ Obtener tamaño: lista.size()");
        System.out.println("  ✓ Agregar: lista.add(valor)");
        System.out.println("  ✓ Eliminar: lista.remove(i)");
        System.out.println("  ✓ Vaciar: lista.clear()");
        System.out.println("  ✓ Buscar: lista.contains(valor)");
        System.out.println("  (Para ordenar: Collections.sort())");
        
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ RESPUESTA CLAVE DEL EXAMEN:");
        System.out.println("  Array: operaciones BÁSICAS (acceso, recorrido)");
        System.out.println("  ArrayList: MUCHAS operaciones (add, remove, etc.)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }

    /**
     * 4. Diferencia: Tipos de datos
     */
    public static void tiposDeDatos() {
        System.out.println("=== 4. TIPOS DE DATOS ===\n");
        
        System.out.println("ARRAY: Puede usar PRIMITIVOS directamente:");
        int[] numeros = {1, 2, 3};
        double[] decimales = {1.5, 2.5, 3.5};
        boolean[] flags = {true, false, true};
        System.out.println("  int[]: " + Arrays.toString(numeros) + " ✓");
        System.out.println("  double[]: " + Arrays.toString(decimales) + " ✓");
        System.out.println("  boolean[]: " + Arrays.toString(flags) + " ✓");
        
        System.out.println("\nARRAYLIST: Requiere WRAPPER CLASSES:");
        ArrayList<Integer> listaInt = new ArrayList<>();  // Integer, NO int
        ArrayList<Double> listaDouble = new ArrayList<>(); // Double, NO double
        ArrayList<Boolean> listaBool = new ArrayList<>();  // Boolean, NO boolean
        listaInt.add(1);
        listaDouble.add(1.5);
        listaBool.add(true);
        System.out.println("  ArrayList<Integer>: " + listaInt + " ✓");
        System.out.println("  ArrayList<Double>: " + listaDouble + " ✓");
        System.out.println("  ArrayList<Boolean>: " + listaBool + " ✓");
        
        System.out.println("\n✗ INCORRECTO:");
        System.out.println("  ArrayList<int> ← ERROR de compilación");
        System.out.println("  ArrayList<double> ← ERROR de compilación");
        
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ RESPUESTA CLAVE DEL EXAMEN:");
        System.out.println("  Array: Primitivos directos (int, double, etc.)");
        System.out.println("  ArrayList: Wrappers (Integer, Double, etc.)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }

    /**
     * 5. Cuándo usar cada uno
     */
    public static void cuandoUsarCadaUno() {
        System.out.println("=== 5. ¿CUÁNDO USAR CADA UNO? ===\n");
        
        System.out.println("USA ARRAY cuando:");
        System.out.println("  ✓ Tamaño es CONOCIDO y FIJO");
        System.out.println("  ✓ Necesitas MÁXIMO RENDIMIENTO");
        System.out.println("  ✓ Trabajas con tipos primitivos");
        System.out.println("  Ejemplo: matriz de 10x10, días de la semana");
        
        System.out.println("\nUSA ARRAYLIST cuando:");
        System.out.println("  ✓ Tamaño es DESCONOCIDO o VARIABLE");
        System.out.println("  ✓ Necesitas agregar/eliminar frecuentemente");
        System.out.println("  ✓ Quieres facilidad de uso");
        System.out.println("  Ejemplo: lista de estudiantes, carrito de compras");
        
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ PREGUNTA TÍPICA DEL EXAMEN:");
        System.out.println("  '¿Cuál elegirías si no conoces el tamaño?'");
        System.out.println("  RESPUESTA: ArrayList (tamaño dinámico)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }

    /**
     * 6. Comparación lado a lado
     */
    public static void comparacionLadoALado() {
        System.out.println("=== 6. COMPARACIÓN LADO A LADO ===\n");
        
        System.out.println("┌────────────────────┬──────────────────┬──────────────────────┐");
        System.out.println("│ CARACTERÍSTICA     │ ARRAY            │ ARRAYLIST            │");
        System.out.println("├────────────────────┼──────────────────┼──────────────────────┤");
        System.out.println("│ Tamaño             │ FIJO             │ DINÁMICO             │");
        System.out.println("│ Obtener tamaño     │ .length          │ .size()              │");
        System.out.println("│ Acceder elemento   │ array[i]         │ lista.get(i)         │");
        System.out.println("│ Modificar elemento │ array[i] = x     │ lista.set(i, x)      │");
        System.out.println("│ Agregar elemento   │ ✗ NO             │ lista.add(x)         │");
        System.out.println("│ Eliminar elemento  │ ✗ NO             │ lista.remove(i)      │");
        System.out.println("│ Tipos de datos     │ Primitivos       │ Wrappers             │");
        System.out.println("│ Ejemplo tipo       │ int[]            │ ArrayList<Integer>   │");
        System.out.println("│ Parte de           │ Lenguaje Java    │ Collections Framework│");
        System.out.println("│ Rendimiento        │ Más rápido       │ Poco más lento       │");
        System.out.println("│ Facilidad de uso   │ Básico           │ Más fácil            │");
        System.out.println("└────────────────────┴──────────────────┴──────────────────────┘");
        System.out.println();
    }

    /**
     * 7. Ejemplos prácticos comparados
     */
    public static void ejemplosPracticos() {
        System.out.println("=== 7. EJEMPLOS PRÁCTICOS COMPARADOS ===\n");
        
        // Ejemplo 1: Crear y agregar elementos
        System.out.println("TAREA: Crear y agregar 3 números\n");
        
        System.out.println("Con ARRAY:");
        System.out.println("  int[] nums = new int[3];  // Tamaño fijo de 3");
        System.out.println("  nums[0] = 10;");
        System.out.println("  nums[1] = 20;");
        System.out.println("  nums[2] = 30;");
        int[] nums = {10, 20, 30};
        System.out.println("  Resultado: " + Arrays.toString(nums));
        
        System.out.println("\nCon ARRAYLIST:");
        System.out.println("  ArrayList<Integer> lista = new ArrayList<>();");
        System.out.println("  lista.add(10);  // Crece automáticamente");
        System.out.println("  lista.add(20);");
        System.out.println("  lista.add(30);");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println("  Resultado: " + lista);
        
        // Ejemplo 2: ¿Puedo agregar un cuarto elemento?
        System.out.println("\n\nTAREA: ¿Puedo agregar un cuarto elemento?\n");
        
        System.out.println("Con ARRAY:");
        System.out.println("  ✗ NO directamente (tamaño fijo de 3)");
        System.out.println("  Necesitarías crear un nuevo array más grande");
        
        System.out.println("\nCon ARRAYLIST:");
        System.out.println("  ✓ SÍ, simplemente:");
        System.out.println("  lista.add(40);");
        lista.add(40);
        System.out.println("  Resultado: " + lista);
        
        System.out.println();
    }

    /**
     * 8. Errores comunes
     */
    public static void erroresComunes() {
        System.out.println("=== 8. ERRORES COMUNES EN EL EXAMEN ===\n");
        
        System.out.println("ERROR 1: Confundir .length y .size()");
        System.out.println("  ✗ array.size() ← NO EXISTE");
        System.out.println("  ✓ array.length ← CORRECTO");
        System.out.println("  ✗ lista.length ← NO EXISTE");
        System.out.println("  ✓ lista.size() ← CORRECTO");
        
        System.out.println("\nERROR 2: Usar primitivos en ArrayList");
        System.out.println("  ✗ ArrayList<int> ← ERROR");
        System.out.println("  ✓ ArrayList<Integer> ← CORRECTO");
        
        System.out.println("\nERROR 3: Intentar usar .add() en array");
        System.out.println("  ✗ array.add(10) ← NO EXISTE");
        System.out.println("  ✓ array[0] = 10 ← CORRECTO");
        
        System.out.println("\nERROR 4: Confundir acceso");
        System.out.println("  En Array:");
        System.out.println("    ✗ array.get(0) ← NO EXISTE");
        System.out.println("    ✓ array[0] ← CORRECTO");
        System.out.println("  En ArrayList:");
        System.out.println("    ✗ lista[0] ← NO FUNCIONA ASÍ");
        System.out.println("    ✓ lista.get(0) ← CORRECTO");
        
        System.out.println("\nERROR 5: Pensar que array puede cambiar de tamaño");
        System.out.println("  ✗ Array NO puede crecer ni reducirse");
        System.out.println("  ✓ ArrayList SÍ puede crecer y reducirse");
        
        System.out.println();
    }

    /**
     * Ejecutar todas las comparaciones
     */
    public static void ejecutarTodas() {
        tamanioFijoVsDinamico();
        lengthVsSize();
        operacionesDisponibles();
        tiposDeDatos();
        cuandoUsarCadaUno();
        comparacionLadoALado();
        ejemplosPracticos();
        erroresComunes();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║   COMPARACIÓN: ARRAY vs ARRAYLIST - GUÍA DE ESTUDIO         ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
        
        ejecutarTodas();
        
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LA COMPARACIÓN                                      ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }
}
