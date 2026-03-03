package com.estudio.ordenamiento;

import java.util.Arrays;

/**
 * Comparador de algoritmos de ordenamiento
 * Compara Burbuja, Selección e Inserción
 */
public class ComparadorOrdenamientos {

    /**
     * Clase para almacenar estadísticas de ordenamiento
     */
    static class Estadisticas {
        String algoritmo;
        int comparaciones;
        int intercambios;
        long tiempoNanosegundos;
        
        Estadisticas(String algoritmo) {
            this.algoritmo = algoritmo;
        }
        
        @Override
        public String toString() {
            return String.format("%-15s | Comparaciones: %-6d | Swaps: %-6d | Tiempo: %d ns",
                    algoritmo, comparaciones, intercambios, tiempoNanosegundos);
        }
    }

    /**
     * Bubble Sort con conteo
     */
    public static Estadisticas bubbleSortConConteo(int[] array) {
        Estadisticas stats = new Estadisticas("Burbuja");
        long inicio = System.nanoTime();
        
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                stats.comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    stats.intercambios++;
                }
            }
        }
        
        stats.tiempoNanosegundos = System.nanoTime() - inicio;
        return stats;
    }

    /**
     * Selection Sort con conteo
     */
    public static Estadisticas selectionSortConConteo(int[] array) {
        Estadisticas stats = new Estadisticas("Selección");
        long inicio = System.nanoTime();
        
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            
            for (int j = i + 1; j < n; j++) {
                stats.comparaciones++;
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            if (indiceMinimo != i) {
                int temp = array[i];
                array[i] = array[indiceMinimo];
                array[indiceMinimo] = temp;
                stats.intercambios++;
            }
        }
        
        stats.tiempoNanosegundos = System.nanoTime() - inicio;
        return stats;
    }

    /**
     * Insertion Sort con conteo
     */
    public static Estadisticas insertionSortConConteo(int[] array) {
        Estadisticas stats = new Estadisticas("Inserción");
        long inicio = System.nanoTime();
        
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int elementoActual = array[i];
            int j = i - 1;
            
            while (j >= 0) {
                stats.comparaciones++;
                if (array[j] > elementoActual) {
                    array[j + 1] = array[j];
                    stats.intercambios++;
                    j--;
                } else {
                    break;
                }
            }
            array[j + 1] = elementoActual;
        }
        
        stats.tiempoNanosegundos = System.nanoTime() - inicio;
        return stats;
    }

    /**
     * Comparar los tres algoritmos
     */
    public static void compararAlgoritmos(int[] arrayOriginal) {
        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        System.out.println();
        
        // Bubble Sort
        int[] arr1 = arrayOriginal.clone();
        Estadisticas statsBubble = bubbleSortConConteo(arr1);
        System.out.println(statsBubble);
        
        // Selection Sort
        int[] arr2 = arrayOriginal.clone();
        Estadisticas statsSelection = selectionSortConConteo(arr2);
        System.out.println(statsSelection);
        
        // Insertion Sort
        int[] arr3 = arrayOriginal.clone();
        Estadisticas statsInsertion = insertionSortConConteo(arr3);
        System.out.println(statsInsertion);
        
        System.out.println("\nResultado (todos): " + Arrays.toString(arr1));
        System.out.println();
    }

    /**
     * Tabla comparativa de características
     */
    public static void tablaComparativa() {
        System.out.println("=== TABLA COMPARATIVA DE ALGORITMOS ===\n");
        
        System.out.println("┌────────────────────┬─────────────┬─────────────┬──────────────┐");
        System.out.println("│ CARACTERÍSTICA     │ BURBUJA     │ SELECCIÓN   │ INSERCIÓN    │");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Idea principal     │ Intercambiar│ Buscar      │ Insertar en  │");
        System.out.println("│                    │ adyacentes  │ mínimo      │ parte ordenada│");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Palabras clave     │ vecinos,    │ mínimo,     │ insertar,    │");
        System.out.println("│                    │ adyacentes  │ seleccionar │ construir    │");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Complejidad (peor) │ O(n²)       │ O(n²)       │ O(n²)        │");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Complejidad (mejor)│ O(n)*       │ O(n²)       │ O(n)         │");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Número de swaps    │ Muchos      │ Pocos       │ Medio        │");
        System.out.println("│                    │ (O(n²))     │ (O(n))      │ (O(n²))      │");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Mejor para...      │ Arrays      │ Cuando      │ Arrays CASI  │");
        System.out.println("│                    │ pequeños    │ swaps son   │ ORDENADOS    │");
        System.out.println("│                    │             │ costosos    │              │");
        System.out.println("├────────────────────┼─────────────┼─────────────┼──────────────┤");
        System.out.println("│ Estable?           │ Sí          │ No          │ Sí           │");
        System.out.println("└────────────────────┴─────────────┴─────────────┴──────────────┘");
        System.out.println("\n* Con optimización de detección temprana");
        System.out.println();
    }

    /**
     * Preguntas típicas del examen
     */
    public static void preguntasDelExamen() {
        System.out.println("=== PREGUNTAS TÍPICAS DEL EXAMEN ===\n");
        
        System.out.println("1. ¿Qué algoritmo compara e intercambia elementos ADYACENTES?");
        System.out.println("   RESPUESTA: Burbuja");
        System.out.println();
        
        System.out.println("2. ¿Qué algoritmo busca el MÍNIMO en cada pasada?");
        System.out.println("   RESPUESTA: Selección");
        System.out.println();
        
        System.out.println("3. ¿Qué algoritmo INSERTA cada elemento en su posición correcta?");
        System.out.println("   RESPUESTA: Inserción");
        System.out.println();
        
        System.out.println("4. ¿Qué algoritmo funciona mejor con arrays CASI ORDENADOS?");
        System.out.println("   RESPUESTA: Inserción (mejor caso O(n))");
        System.out.println();
        
        System.out.println("5. ¿Qué algoritmo hace MÁS swaps: burbuja o selección?");
        System.out.println("   RESPUESTA: Burbuja (O(n²) vs O(n) de selección)");
        System.out.println();
        
        System.out.println("6. ¿Cuál es la complejidad del PEOR CASO de burbuja?");
        System.out.println("   RESPUESTA: O(n²)");
        System.out.println();
        
        System.out.println("7. Si en burbuja no hubo intercambios en una pasada...");
        System.out.println("   RESPUESTA: El array ya está ordenado (puedes terminar)");
        System.out.println();
    }

    /**
     * Escenarios de prueba
     */
    public static void escenariosDePrueba() {
        System.out.println("=== ESCENARIOS DE PRUEBA ===\n");
        
        // Escenario 1: Array aleatorio
        System.out.println("1. ARRAY ALEATORIO");
        int[] random = {5, 2, 8, 1, 9, 3, 7};
        compararAlgoritmos(random);
        
        // Escenario 2: Array casi ordenado (mejor para Insertion)
        System.out.println("2. ARRAY CASI ORDENADO (favorece Inserción)");
        int[] casiOrdenado = {1, 2, 3, 4, 5, 6, 8, 7, 9, 10};
        compararAlgoritmos(casiOrdenado);
        
        System.out.println("✓ Nota: Inserción hace MUCHAS menos comparaciones y swaps");
        System.out.println("         cuando el array está casi ordenado");
        System.out.println();
        
        // Escenario 3: Array invertido (peor caso)
        System.out.println("3. ARRAY INVERTIDO (peor caso para todos)");
        int[] invertido = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        compararAlgoritmos(invertido);
        
        System.out.println("✓ Nota: Selección hace menos swaps incluso en el peor caso");
        System.out.println();
        
        // Escenario 4: Array ya ordenado (mejor caso)
        System.out.println("4. ARRAY YA ORDENADO (mejor caso)");
        int[] ordenado = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        compararAlgoritmos(ordenado);
        
        System.out.println("✓ Nota: Inserción es MUY eficiente (O(n))");
        System.out.println("         Burbuja y Selección siguen haciendo comparaciones");
        System.out.println();
    }

    /**
     * Resumen para el examen
     */
    public static void resumenParaExamen() {
        System.out.println("=== RESUMEN PARA EL EXAMEN ===\n");
        
        System.out.println("BURBUJA (Bubble Sort)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ Palabras clave: adyacentes, vecinos, burbujas suben");
        System.out.println("✓ Complejidad: O(n²) en peor caso");
        System.out.println("✓ Hace muchos swaps");
        System.out.println();
        
        System.out.println("SELECCIÓN (Selection Sort)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ Palabras clave: buscar mínimo, seleccionar, colocar al inicio");
        System.out.println("✓ Complejidad: O(n²) siempre");
        System.out.println("✓ Hace POCOS swaps (máximo n-1)");
        System.out.println();
        
        System.out.println("INSERCIÓN (Insertion Sort)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("✓ Palabras clave: insertar, construir parte ordenada, como cartas");
        System.out.println("✓ Complejidad: O(n²) peor caso, O(n) mejor caso");
        System.out.println("✓ MEJOR para arrays CASI ORDENADOS");
        System.out.println();
        
        System.out.println("COMPARACIONES IMPORTANTES");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("• Más swaps: Burbuja > Inserción > Selección");
        System.out.println("• Array casi ordenado: Inserción es el MEJOR");
        System.out.println("• Todos son O(n²) en peor caso");
        System.out.println("• Selección siempre hace O(n²) comparaciones");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║   COMPARACIÓN DE ALGORITMOS DE ORDENAMIENTO                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
        
        tablaComparativa();
        preguntasDelExamen();
        escenariosDePrueba();
        resumenParaExamen();
        
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LA COMPARACIÓN                                      ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }
}
