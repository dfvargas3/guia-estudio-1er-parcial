package com.estudio.ordenamiento;

import java.util.Arrays;

/**
 * Ordenamiento Burbuja (Bubble Sort)
 * Compara e intercambia elementos ADYACENTES
 */
public class BubbleSort {

    /**
     * Ordenamiento burbuja básico
     */
    public static void ordenar(int[] array) {
        int n = array.length;
        
        // Pasadas (n-1 veces)
        for (int i = 0; i < n - 1; i++) {
            // Comparar elementos adyacentes
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar (swap)
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Ordenamiento burbuja con visualización paso a paso
     */
    public static void ordenarConVisualizacion(int[] array) {
        System.out.println("=== BUBBLE SORT PASO A PASO ===\n");
        System.out.println("Array inicial: " + Arrays.toString(array));
        System.out.println("\nConcepto: Comparar e intercambiar elementos ADYACENTES");
        System.out.println("Los mayores 'suben' al final como burbujas\n");
        
        int n = array.length;
        int pasada = 1;
        
        for (int i = 0; i < n - 1; i++) {
            System.out.println("--- Pasada " + pasada + " ---");
            boolean huboIntercambio = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  Comparar [" + j + "]=" + array[j] + 
                               " con [" + (j+1) + "]=" + array[j+1]);
                
                if (array[j] > array[j + 1]) {
                    // Intercambiar
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    huboIntercambio = true;
                    System.out.println(" → SWAP");
                } else {
                    System.out.println(" → OK (no swap)");
                }
            }
            
            System.out.println("  Estado: " + Arrays.toString(array));
            
            if (!huboIntercambio) {
                System.out.println("  ✓ No hubo intercambios, ¡ya está ordenado!");
                break;
            }
            
            System.out.println();
            pasada++;
        }
        
        System.out.println("Array final: " + Arrays.toString(array));
        System.out.println();
    }

    /**
     * Contar número de comparaciones y swaps
     */
    public static void analizarComplejidad(int[] array) {
        System.out.println("=== ANÁLISIS DE COMPLEJIDAD ===\n");
        System.out.println("Array: " + Arrays.toString(array));
        
        int n = array.length;
        int comparaciones = 0;
        int intercambios = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambios++;
                }
            }
        }
        
        System.out.println("Resultado: " + Arrays.toString(array));
        System.out.println("\nComparaciones realizadas: " + comparaciones);
        System.out.println("Intercambios realizados: " + intercambios);
        System.out.println("\nComplejidad temporal:");
        System.out.println("  Peor caso: O(n²) = " + (n * n));
        System.out.println("  Mejor caso: O(n) (si ya está ordenado con optimización)");
        System.out.println();
    }

    /**
     * Características clave de Bubble Sort
     */
    public static void caracteristicasClave() {
        System.out.println("=== CARACTERÍSTICAS CLAVE DE BUBBLE SORT ===\n");
        
        System.out.println("✓ IDEA PRINCIPAL:");
        System.out.println("  Comparar pares ADYACENTES y cambiar si están en desorden");
        System.out.println("  Los elementos mayores 'suben' al final como burbujas");
        
        System.out.println("\n✓ CÓMO RECONOCERLO EN EL EXAMEN:");
        System.out.println("  - Menciona 'intercambiar vecinos' o 'elementos adyacentes'");
        System.out.println("  - 'Los mayores suben al final en cada pasada'");
        System.out.println("  - Compara array[i] con array[i+1]");
        
        System.out.println("\n✓ COMPLEJIDAD:");
        System.out.println("  - Peor caso: O(n²) - muchas comparaciones");
        System.out.println("  - Mejor caso: O(n) - con optimización si ya está ordenado");
        
        System.out.println("\n✓ VENTAJAS:");
        System.out.println("  - Simple de entender e implementar");
        System.out.println("  - Estable (mantiene orden de elementos iguales)");
        
        System.out.println("\n✓ DESVENTAJAS:");
        System.out.println("  - Ineficiente para listas grandes (muchos swaps)");
        System.out.println("  - O(n²) es lento comparado con otros algoritmos");
        
        System.out.println("\n✓ PREGUNTA TÍPICA:");
        System.out.println("  '¿Qué algoritmo compara e intercambia elementos vecinos?'");
        System.out.println("  RESPUESTA: Burbuja (Bubble Sort)");
        System.out.println();
    }

    /**
     * Ejemplo de una pasada de burbuja (pregunta común en examen)
     */
    public static void ejemploUnaPasada() {
        System.out.println("=== EJEMPLO: UNA PASADA DE BURBUJA ===\n");
        System.out.println("Pregunta típica: Traza 1 pasada de burbuja sobre [3, 1, 2]\n");
        
        int[] array = {3, 1, 2};
        System.out.println("Array inicial: " + Arrays.toString(array));
        System.out.println("\nPasada 1 (comparar vecinos de izquierda a derecha):\n");
        
        // Comparación 1: posiciones 0 y 1
        System.out.println("1. Comparar [0]=3 con [1]=1");
        System.out.println("   3 > 1 → SWAP");
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.println("   Resultado: " + Arrays.toString(array));
        
        // Comparación 2: posiciones 1 y 2
        System.out.println("\n2. Comparar [1]=3 con [2]=2");
        System.out.println("   3 > 2 → SWAP");
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        System.out.println("   Resultado: " + Arrays.toString(array));
        
        System.out.println("\n✓ Después de 1 pasada completa: " + Arrays.toString(array));
        System.out.println("✓ El mayor (3) 'subió' al final");
        System.out.println();
    }

    /**
     * Optimización: detectar si ya está ordenado
     */
    public static void ordenarOptimizado(int[] array) {
        System.out.println("=== BUBBLE SORT OPTIMIZADO ===\n");
        System.out.println("Optimización: Si en una pasada NO hay intercambios, ya está ordenado\n");
        System.out.println("Array inicial: " + Arrays.toString(array));
        
        int n = array.length;
        int pasadas = 0;
        
        for (int i = 0; i < n - 1; i++) {
            pasadas++;
            boolean huboIntercambio = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            
            if (!huboIntercambio) {
                System.out.println("Pasada " + pasadas + ": No hubo intercambios");
                System.out.println("✓ El array ya está ordenado, terminamos antes!");
                break;
            }
        }
        
        System.out.println("Array final: " + Arrays.toString(array));
        System.out.println("Pasadas realizadas: " + pasadas + " de " + (n-1) + " máximas");
        System.out.println();
    }

    /**
     * Demostración completa
     */
    public static void demostracionCompleta() {
        caracteristicasClave();
        
        // Caso típico del examen
        ejemploUnaPasada();
        
        // Caso completo
        int[] arr1 = {5, 2, 8, 1, 9};
        ordenarConVisualizacion(arr1.clone());
        
        // Análisis de complejidad
        int[] arr2 = {4, 3, 2, 1};
        analizarComplejidad(arr2.clone());
        
        // Optimización
        int[] arr3 = {1, 2, 3, 4, 5};
        ordenarOptimizado(arr3.clone());
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   BUBBLE SORT - ORDENAMIENTO BURBUJA                    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        demostracionCompleta();
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LA DEMOSTRACIÓN                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
