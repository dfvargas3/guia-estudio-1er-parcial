package com.estudio.ordenamiento;

import java.util.Arrays;

/**
 * Ordenamiento por Inserción (Insertion Sort)
 * INSERTA cada elemento en su posición correcta en la parte ordenada
 */
public class InsertionSort {

    /**
     * Ordenamiento por inserción básico
     */
    public static void ordenar(int[] array) {
        int n = array.length;
        
        // Empezar desde el segundo elemento
        for (int i = 1; i < n; i++) {
            int elementoActual = array[i];
            int j = i - 1;
            
            // Mover elementos mayores hacia la derecha
            while (j >= 0 && array[j] > elementoActual) {
                array[j + 1] = array[j];
                j--;
            }
            
            // Insertar el elemento en su posición correcta
            array[j + 1] = elementoActual;
        }
    }

    /**
     * Ordenamiento por inserción con visualización paso a paso
     */
    public static void ordenarConVisualizacion(int[] array) {
        System.out.println("=== INSERTION SORT PASO A PASO ===\n");
        System.out.println("Array inicial: " + Arrays.toString(array));
        System.out.println("\nConcepto: INSERTAR cada elemento en su posición correcta");
        System.out.println("Se construye una parte ordenada e insertamos elementos en ella\n");
        
        int n = array.length;
        
        // Primera posición ya está "ordenada"
        System.out.println("Inicio: [" + array[0] + "] ya está ordenado");
        System.out.println();
        
        for (int i = 1; i < n; i++) {
            int elementoActual = array[i];
            System.out.println("--- Insertar elemento: " + elementoActual + " (posición " + i + ") ---");
            
            // Mostrar parte ordenada vs sin ordenar
            System.out.print("  Parte ordenada: [");
            for (int k = 0; k < i; k++) {
                System.out.print(array[k] + (k < i - 1 ? ", " : ""));
            }
            System.out.print("] | Sin ordenar: [");
            for (int k = i; k < n; k++) {
                System.out.print(array[k] + (k < n - 1 ? ", " : ""));
            }
            System.out.println("]");
            
            int j = i - 1;
            System.out.println("  Buscar dónde insertar " + elementoActual + ":");
            
            // Mover elementos
            boolean movio = false;
            while (j >= 0 && array[j] > elementoActual) {
                System.out.println("    " + array[j] + " > " + elementoActual + 
                                 " → mover " + array[j] + " a la derecha");
                array[j + 1] = array[j];
                j--;
                movio = true;
            }
            
            // Insertar
            array[j + 1] = elementoActual;
            
            if (movio) {
                System.out.println("  Insertar " + elementoActual + " en posición " + (j + 1));
            } else {
                System.out.println("  " + elementoActual + " ya está en su posición");
            }
            
            System.out.println("  Estado: " + Arrays.toString(array));
            System.out.println();
        }
        
        System.out.println("Array final: " + Arrays.toString(array));
        System.out.println();
    }

    /**
     * Contar número de comparaciones y movimientos
     */
    public static void analizarComplejidad(int[] array) {
        System.out.println("=== ANÁLISIS DE COMPLEJIDAD ===\n");
        System.out.println("Array: " + Arrays.toString(array));
        
        int n = array.length;
        int comparaciones = 0;
        int movimientos = 0;
        
        for (int i = 1; i < n; i++) {
            int elementoActual = array[i];
            int j = i - 1;
            
            while (j >= 0) {
                comparaciones++;
                if (array[j] > elementoActual) {
                    array[j + 1] = array[j];
                    movimientos++;
                    j--;
                } else {
                    break;
                }
            }
            
            array[j + 1] = elementoActual;
        }
        
        System.out.println("Resultado: " + Arrays.toString(array));
        System.out.println("\nComparaciones realizadas: " + comparaciones);
        System.out.println("Movimientos realizados: " + movimientos);
        System.out.println("\nComplejidad temporal:");
        System.out.println("  Peor caso: O(n²) (array invertido)");
        System.out.println("  Mejor caso: O(n) (array ya ordenado)");
        System.out.println("  → MUY eficiente si el array está CASI ordenado");
        System.out.println();
    }

    /**
     * Características clave de Insertion Sort
     */
    public static void caracteristicasClave() {
        System.out.println("=== CARACTERÍSTICAS CLAVE DE INSERTION SORT ===\n");
        
        System.out.println("✓ IDEA PRINCIPAL:");
        System.out.println("  Construir una parte ordenada e INSERTAR cada elemento");
        System.out.println("  Similar a ordenar cartas en tu mano");
        
        System.out.println("\n✓ CÓMO RECONOCERLO EN EL EXAMEN:");
        System.out.println("  - Menciona 'insertar en su posición correcta'");
        System.out.println("  - 'Construir parte ordenada'");
        System.out.println("  - 'Como ordenar cartas'");
        
        System.out.println("\n✓ COMPLEJIDAD:");
        System.out.println("  - Peor caso: O(n²) (array invertido)");
        System.out.println("  - Mejor caso: O(n) (array ya ordenado)");
        System.out.println("  - Promedio: O(n²)");
        
        System.out.println("\n✓ VENTAJAS:");
        System.out.println("  - MUY eficiente para arrays CASI ORDENADOS");
        System.out.println("  - Estable (mantiene orden de elementos iguales)");
        System.out.println("  - Funciona bien con datos que llegan en tiempo real");
        System.out.println("  - Mejor caso O(n) vs O(n²) de Selection");
        
        System.out.println("\n✓ DESVENTAJAS:");
        System.out.println("  - Ineficiente para arrays grandes desordenados");
        System.out.println("  - Peor caso sigue siendo O(n²)");
        
        System.out.println("\n✓ PREGUNTA TÍPICA:");
        System.out.println("  '¿Qué algoritmo va insertando elementos en la parte ordenada?'");
        System.out.println("  RESPUESTA: Inserción (Insertion Sort)");
        
        System.out.println("\n✓ PREGUNTA MUY COMÚN:");
        System.out.println("  '¿Cuándo funciona mejor Inserción?'");
        System.out.println("  RESPUESTA: Cuando el array está CASI ORDENADO");
        System.out.println();
    }

    /**
     * Ejemplo con array casi ordenado
     */
    public static void ejemploCasiOrdenado() {
        System.out.println("=== EJEMPLO: INSERCIÓN CON ARRAY CASI ORDENADO ===\n");
        
        // Array casi ordenado (solo 1 elemento fuera de lugar)
        int[] casiOrdenado = {1, 2, 3, 5, 4};
        System.out.println("Array casi ordenado: " + Arrays.toString(casiOrdenado));
        
        int movimientos = 0;
        int n = casiOrdenado.length;
        
        for (int i = 1; i < n; i++) {
            int elementoActual = casiOrdenado[i];
            int j = i - 1;
            
            while (j >= 0 && casiOrdenado[j] > elementoActual) {
                casiOrdenado[j + 1] = casiOrdenado[j];
                movimientos++;
                j--;
            }
            casiOrdenado[j + 1] = elementoActual;
        }
        
        System.out.println("Array ordenado: " + Arrays.toString(casiOrdenado));
        System.out.println("Movimientos: " + movimientos + " (MUY POCOS!)");
        
        System.out.println("\n--- Comparación ---");
        
        // Array completamente desordenado
        int[] desordenado = {5, 4, 3, 2, 1};
        System.out.println("\nArray totalmente invertido: " + Arrays.toString(desordenado));
        
        movimientos = 0;
        n = desordenado.length;
        
        for (int i = 1; i < n; i++) {
            int elementoActual = desordenado[i];
            int j = i - 1;
            
            while (j >= 0 && desordenado[j] > elementoActual) {
                desordenado[j + 1] = desordenado[j];
                movimientos++;
                j--;
            }
            desordenado[j + 1] = elementoActual;
        }
        
        System.out.println("Array ordenado: " + Arrays.toString(desordenado));
        System.out.println("Movimientos: " + movimientos + " (MUCHOS!)");
        
        System.out.println("\n✓ CONCLUSIÓN:");
        System.out.println("  Inserción es EXCELENTE para arrays casi ordenados");
        System.out.println("  Hace muy pocos movimientos en ese caso");
        System.out.println();
    }

    /**
     * Analogía con ordenar cartas
     */
    public static void analogiaCartas() {
        System.out.println("=== ANALOGÍA: ORDENAR CARTAS EN TU MANO ===\n");
        
        int[] cartas = {5, 2, 8, 1, 9};
        System.out.println("Imagina que recibes estas cartas una por una:");
        System.out.println(Arrays.toString(cartas));
        System.out.println();
        
        System.out.println("PASO A PASO (como ordenarías cartas en tu mano):\n");
        
        System.out.println("1. Recibes: 5");
        System.out.println("   Mano: [5]");
        System.out.println();
        
        System.out.println("2. Recibes: 2");
        System.out.println("   2 < 5, lo insertas antes del 5");
        System.out.println("   Mano: [2, 5]");
        System.out.println();
        
        System.out.println("3. Recibes: 8");
        System.out.println("   8 > 5, lo insertas al final");
        System.out.println("   Mano: [2, 5, 8]");
        System.out.println();
        
        System.out.println("4. Recibes: 1");
        System.out.println("   1 < 2, lo insertas al principio");
        System.out.println("   Mano: [1, 2, 5, 8]");
        System.out.println();
        
        System.out.println("5. Recibes: 9");
        System.out.println("   9 > 8, lo insertas al final");
        System.out.println("   Mano: [1, 2, 5, 8, 9]");
        System.out.println();
        
        System.out.println("✓ Así funciona Insertion Sort:");
        System.out.println("  Mantienes una parte ordenada (tu mano)");
        System.out.println("  Cada carta nueva se inserta en su lugar correcto");
        System.out.println();
    }

    /**
     * Demostración completa
     */
    public static void demostracionCompleta() {
        caracteristicasClave();
        
        // Analogía
        analogiaCartas();
        
        // Caso completo
        int[] arr1 = {5, 2, 8, 1, 9};
        ordenarConVisualizacion(arr1.clone());
        
        // Análisis de complejidad
        int[] arr2 = {4, 3, 2, 1};
        analizarComplejidad(arr2.clone());
        
        // Ventaja con array casi ordenado
        ejemploCasiOrdenado();
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   INSERTION SORT - ORDENAMIENTO POR INSERCIÓN           ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        demostracionCompleta();
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   FIN DE LA DEMOSTRACIÓN                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
