package com.estudio.ordenamiento;

import java.util.Arrays;

/**
 * Ordenamiento por Selección (Selection Sort)
 * Busca el MÍNIMO y lo coloca al inicio
 */
public class SelectionSort {

    /**
     * Ordenamiento por selección básico
     */
    public static void ordenar(int[] array) {
        int n = array.length;
        
        // Para cada posición
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el mínimo en el resto del array
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            // Intercambiar el mínimo con la posición actual
            int temp = array[i];
            array[i] = array[indiceMinimo];
            array[indiceMinimo] = temp;
        }
    }

    /**
     * Ordenamiento por selección con visualización paso a paso
     */
    public static void ordenarConVisualizacion(int[] array) {
        System.out.println("=== SELECTION SORT PASO A PASO ===\n");
        System.out.println("Array inicial: " + Arrays.toString(array));
        System.out.println("\nConcepto: Buscar el MÍNIMO y colocarlo al inicio");
        System.out.println("En cada pasada, se coloca un elemento en su posición correcta\n");
        
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            System.out.println("--- Pasada " + (i + 1) + " ---");
            System.out.println("  Buscar mínimo desde posición " + i + " hasta el final");
            
            // Buscar el mínimo
            int indiceMinimo = i;
            int valorMinimo = array[i];
            
            for (int j = i + 1; j < n; j++) {
                System.out.print("    Comparar [" + indiceMinimo + "]=" + array[indiceMinimo] + 
                               " con [" + j + "]=" + array[j]);
                
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                    valorMinimo = array[j];
                    System.out.println(" → Nuevo mínimo: " + valorMinimo);
                } else {
                    System.out.println(" → No cambia");
                }
            }
            
            // Intercambiar
            System.out.println("  Mínimo encontrado: " + valorMinimo + " en posición " + indiceMinimo);
            
            if (indiceMinimo != i) {
                System.out.println("  SWAP: [" + i + "]=" + array[i] + 
                                 " ↔ [" + indiceMinimo + "]=" + array[indiceMinimo]);
                int temp = array[i];
                array[i] = array[indiceMinimo];
                array[indiceMinimo] = temp;
            } else {
                System.out.println("  Ya está en su posición");
            }
            
            System.out.println("  Estado: " + Arrays.toString(array));
            System.out.println();
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
            int indiceMinimo = i;
            
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            if (indiceMinimo != i) {
                int temp = array[i];
                array[i] = array[indiceMinimo];
                array[indiceMinimo] = temp;
                intercambios++;
            }
        }
        
        System.out.println("Resultado: " + Arrays.toString(array));
        System.out.println("\nComparaciones realizadas: " + comparaciones);
        System.out.println("Intercambios realizados: " + intercambios);
        System.out.println("\nNota: Selection Sort hace MENOS swaps que Bubble Sort");
        System.out.println("      (a lo sumo 1 swap por pasada)");
        System.out.println("\nComplejidad temporal:");
        System.out.println("  Peor caso: O(n²)");
        System.out.println("  Mejor caso: O(n²) (siempre hace todas las comparaciones)");
        System.out.println();
    }

    /**
     * Características clave de Selection Sort
     */
    public static void caracteristicasClave() {
        System.out.println("=== CARACTERÍSTICAS CLAVE DE SELECTION SORT ===\n");
        
        System.out.println("✓ IDEA PRINCIPAL:");
        System.out.println("  Buscar el MÍNIMO (o máximo) y colocarlo en su posición");
        System.out.println("  En cada pasada, se 'selecciona' el menor del resto");
        
        System.out.println("\n✓ CÓMO RECONOCERLO EN EL EXAMEN:");
        System.out.println("  - Menciona 'buscar el mínimo'");
        System.out.println("  - 'Colocar el menor al inicio'");
        System.out.println("  - 'Seleccionar el elemento más pequeño'");
        
        System.out.println("\n✓ COMPLEJIDAD:");
        System.out.println("  - Peor caso: O(n²)");
        System.out.println("  - Mejor caso: O(n²) (siempre hace todas las comparaciones)");
        
        System.out.println("\n✓ VENTAJAS:");
        System.out.println("  - Hace MENOS intercambios que Burbuja");
        System.out.println("  - A lo sumo n-1 swaps (1 por pasada)");
        System.out.println("  - Simple de entender");
        
        System.out.println("\n✓ DESVENTAJAS:");
        System.out.println("  - O(n²) sigue siendo lento");
        System.out.println("  - NO es estable (puede cambiar orden de iguales)");
        
        System.out.println("\n✓ PREGUNTA TÍPICA:");
        System.out.println("  '¿Qué algoritmo busca el mínimo y lo coloca al inicio?'");
        System.out.println("  RESPUESTA: Selección (Selection Sort)");
        
        System.out.println("\n✓ COMPARACIÓN CON BURBUJA:");
        System.out.println("  Pregunta: '¿Qué algoritmo hace más swaps: selección o burbuja?'");
        System.out.println("  RESPUESTA: Burbuja hace más swaps;");
        System.out.println("            Selección hace a lo sumo 1 swap por pasada");
        System.out.println();
    }

    /**
     * Ejemplo de una pasada (pregunta común en examen)
     */
    public static void ejemploUnaPasada() {
        System.out.println("=== EJEMPLO: UNA PASADA DE SELECCIÓN ===\n");
        System.out.println("Pregunta típica: Primera pasada de selección sobre [3, 1, 2]\n");
        
        int[] array = {3, 1, 2};
        System.out.println("Array inicial: " + Arrays.toString(array));
        System.out.println("\nPasada 1: Buscar el mínimo desde posición 0\n");
        
        System.out.println("1. Mínimo inicial: [0]=3");
        System.out.println("2. Comparar con [1]=1 → 1 < 3, nuevo mínimo: 1");
        System.out.println("3. Comparar con [2]=2 → 2 > 1, mínimo sigue siendo: 1");
        System.out.println("\n   Mínimo encontrado: 1 en posición 1");
        System.out.println("   SWAP: posición 0 ↔ posición 1");
        
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        
        System.out.println("\n✓ Después de la primera pasada: " + Arrays.toString(array));
        System.out.println("✓ El mínimo (1) está en su posición correcta");
        System.out.println();
    }

    /**
     * Comparación con Bubble Sort
     */
    public static void comparacionConBurbuja() {
        System.out.println("=== SELECTION SORT vs BUBBLE SORT ===\n");
        
        int[] arr1 = {5, 2, 8, 1, 9};
        int[] arr2 = arr1.clone();
        
        System.out.println("Array inicial: " + Arrays.toString(arr1));
        System.out.println();
        
        // Selection Sort
        System.out.println("--- CON SELECTION SORT ---");
        int swapsSelection = 0;
        int n = arr1.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr1[j] < arr1[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                int temp = arr1[i];
                arr1[i] = arr1[indiceMinimo];
                arr1[indiceMinimo] = temp;
                swapsSelection++;
            }
        }
        
        System.out.println("Resultado: " + Arrays.toString(arr1));
        System.out.println("Swaps: " + swapsSelection);
        
        // Bubble Sort
        System.out.println("\n--- CON BUBBLE SORT ---");
        int swapsBubble = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    swapsBubble++;
                }
            }
        }
        
        System.out.println("Resultado: " + Arrays.toString(arr2));
        System.out.println("Swaps: " + swapsBubble);
        
        System.out.println("\n✓ CONCLUSIÓN:");
        System.out.println("  Selection Sort: " + swapsSelection + " swaps");
        System.out.println("  Bubble Sort: " + swapsBubble + " swaps");
        System.out.println("  → Selection Sort hace MENOS intercambios");
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
        
        // Comparación
        comparacionConBurbuja();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   SELECTION SORT - ORDENAMIENTO POR SELECCIÓN           ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        demostracionCompleta();
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LA DEMOSTRACIÓN                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
