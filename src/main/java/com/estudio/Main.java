package com.estudio;

import com.estudio.listas.EjemplosArrayList;
import com.estudio.listas.EjerciciosArrayList;
import com.estudio.arreglos.EjemplosArray;
import com.estudio.arreglos.ComparacionArrayVsArrayList;
import com.estudio.ordenamiento.BubbleSort;
import com.estudio.ordenamiento.SelectionSort;
import com.estudio.ordenamiento.InsertionSort;
import com.estudio.ordenamiento.ComparadorOrdenamientos;

import java.util.Scanner;

/**
 * Programa principal - Guía de Estudio para Estructura de Datos
 * Cubre: ArrayList, Arrays y Algoritmos de Ordenamiento
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarBienvenida();
        
        boolean continuar = true;
        while (continuar) {
            mostrarMenuPrincipal();
            int opcion = leerOpcion();
            
            switch (opcion) {
                case 1:
                    menuArrayList();
                    break;
                case 2:
                    menuArrays();
                    break;
                case 3:
                    menuOrdenamientos();
                    break;
                case 4:
                    mostrarResumenCompleto();
                    break;
                case 5:
                    mostrarConsejos();
                    break;
                case 0:
                    continuar = false;
                    mostrarDespedida();
                    break;
                default:
                    System.out.println("\n✗ Opción inválida. Intenta de nuevo.\n");
            }
            
            if (continuar) {
                pausar();
            }
        }
        
        scanner.close();
    }

    private static void mostrarBienvenida() {
        System.out.println("\n╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                  ║");
        System.out.println("║          GUÍA DE ESTUDIO - ESTRUCTURA DE DATOS                   ║");
        System.out.println("║               Examen Parcial (Semana 5)                          ║");
        System.out.println("║                                                                  ║");
        System.out.println("║  Temas:                                                          ║");
        System.out.println("║    • ArrayList (Listas en Java)                                  ║");
        System.out.println("║    • Arrays (Arreglos)                                           ║");
        System.out.println("║    • Algoritmos de Ordenamiento (Burbuja, Selección, Inserción) ║");
        System.out.println("║                                                                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝\n");
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║         MENÚ PRINCIPAL                ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║                                       ║");
        System.out.println("║  1. ArrayList (Listas)                ║");
        System.out.println("║  2. Arrays (Arreglos)                 ║");
        System.out.println("║  3. Algoritmos de Ordenamiento        ║");
        System.out.println("║  4. Resumen Completo para el Examen   ║");
        System.out.println("║  5. Consejos para el Examen           ║");
        System.out.println("║  0. Salir                             ║");
        System.out.println("║                                       ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("\nSelecciona una opción: ");
    }

    private static void menuArrayList() {
        limpiarPantalla();
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║      MENÚ - ARRAYLIST                 ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║                                       ║");
        System.out.println("║  1. Ver todos los ejemplos            ║");
        System.out.println("║  2. Ver ejemplos específicos          ║");
        System.out.println("║  3. Ver ejercicios prácticos          ║");
        System.out.println("║  4. Modo interactivo                  ║");
        System.out.println("║  0. Volver al menú principal          ║");
        System.out.println("║                                       ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("\nSelecciona una opción: ");
        
        int opcion = leerOpcion();
        limpiarPantalla();
        
        switch (opcion) {
            case 1:
                EjemplosArrayList.ejecutarTodos();
                break;
            case 2:
                menuEjemplosArrayList();
                break;
            case 3:
                EjerciciosArrayList.ejecutarTodos();
                break;
            case 4:
                EjerciciosArrayList.ejercicioInteractivo();
                break;
            case 0:
                break;
            default:
                System.out.println("\n✗ Opción inválida.\n");
        }
    }

    private static void menuEjemplosArrayList() {
        System.out.println("\n¿Qué ejemplo quieres ver?\n");
        System.out.println("1. Conceptos básicos");
        System.out.println("2. Método add()");
        System.out.println("3. Método get()");
        System.out.println("4. Método size()");
        System.out.println("5. Método remove()");
        System.out.println("6. Método clear()");
        System.out.println("7. Recorridos (for-each, for, while)");
        System.out.println("8. Métodos válidos e inválidos");
        System.out.print("\nSelecciona: ");
        
        int opcion = leerOpcion();
        limpiarPantalla();
        
        switch (opcion) {
            case 1: EjemplosArrayList.conceptosBasicos(); break;
            case 2: EjemplosArrayList.metodoAdd(); break;
            case 3: EjemplosArrayList.metodoGet(); break;
            case 4: EjemplosArrayList.metodoSize(); break;
            case 5: EjemplosArrayList.metodoRemove(); break;
            case 6: EjemplosArrayList.metodoClear(); break;
            case 7: EjemplosArrayList.recorridos(); break;
            case 8: EjemplosArrayList.metodosValidosInvalidos(); break;
            default: System.out.println("\n✗ Opción inválida.\n");
        }
    }

    private static void menuArrays() {
        limpiarPantalla();
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║      MENÚ - ARRAYS                    ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║                                       ║");
        System.out.println("║  1. Ver ejemplos de Arrays            ║");
        System.out.println("║  2. Comparación Array vs ArrayList    ║");
        System.out.println("║  3. Ver todos                         ║");
        System.out.println("║  0. Volver al menú principal          ║");
        System.out.println("║                                       ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("\nSelecciona una opción: ");
        
        int opcion = leerOpcion();
        limpiarPantalla();
        
        switch (opcion) {
            case 1:
                EjemplosArray.ejecutarTodos();
                break;
            case 2:
                ComparacionArrayVsArrayList.ejecutarTodas();
                break;
            case 3:
                EjemplosArray.ejecutarTodos();
                ComparacionArrayVsArrayList.ejecutarTodas();
                break;
            case 0:
                break;
            default:
                System.out.println("\n✗ Opción inválida.\n");
        }
    }

    private static void menuOrdenamientos() {
        limpiarPantalla();
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║   MENÚ - ALGORITMOS DE ORDENAMIENTO   ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║                                       ║");
        System.out.println("║  1. Bubble Sort (Burbuja)             ║");
        System.out.println("║  2. Selection Sort (Selección)        ║");
        System.out.println("║  3. Insertion Sort (Inserción)        ║");
        System.out.println("║  4. Comparar los 3 algoritmos         ║");
        System.out.println("║  5. Ver todos                         ║");
        System.out.println("║  0. Volver al menú principal          ║");
        System.out.println("║                                       ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("\nSelecciona una opción: ");
        
        int opcion = leerOpcion();
        limpiarPantalla();
        
        switch (opcion) {
            case 1:
                BubbleSort.demostracionCompleta();
                break;
            case 2:
                SelectionSort.demostracionCompleta();
                break;
            case 3:
                InsertionSort.demostracionCompleta();
                break;
            case 4:
                ComparadorOrdenamientos.main(new String[]{});
                break;
            case 5:
                BubbleSort.demostracionCompleta();
                SelectionSort.demostracionCompleta();
                InsertionSort.demostracionCompleta();
                ComparadorOrdenamientos.main(new String[]{});
                break;
            case 0:
                break;
            default:
                System.out.println("\n✗ Opción inválida.\n");
        }
    }

    private static void mostrarResumenCompleto() {
        limpiarPantalla();
        System.out.println("\n╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║           RESUMEN COMPLETO PARA EL EXAMEN PARCIAL                ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝\n");
        
        System.out.println("═══════════════════════════════════════════════════════════════════");
        System.out.println("                    1. ARRAYLIST (LISTAS)                          ");
        System.out.println("═══════════════════════════════════════════════════════════════════\n");
        
        System.out.println("✓ QUÉ ES:");
        System.out.println("  - Colección ORDENADA de elementos");
        System.out.println("  - Tamaño DINÁMICO (puede crecer/reducirse)");
        System.out.println("  - Permite DUPLICADOS");
        
        System.out.println("\n✓ MÉTODOS CLAVE:");
        System.out.println("  - size()        → cantidad de elementos");
        System.out.println("  - add(e)        → agregar al final");
        System.out.println("  - get(i)        → obtener elemento en índice i");
        System.out.println("  - remove(i)     → eliminar por índice");
        System.out.println("  - remove(obj)   → eliminar por objeto");
        System.out.println("  - clear()       → vaciar toda la lista");
        
        System.out.println("\n✓ RECORRIDOS:");
        System.out.println("  - for-each: ideal para solo lectura");
        System.out.println("  - for indexado: cuando necesitas el índice");
        System.out.println("  - while: alternativa válida");
        
        System.out.println("\n⚠ IMPORTANTE:");
        System.out.println("  - Usa WRAPPERS: ArrayList<Integer>, NO ArrayList<int>");
        System.out.println("  - Método de tamaño: .size() (NO .length)");
        System.out.println("  - First index: 0");
        
        System.out.println("\n═══════════════════════════════════════════════════════════════════");
        System.out.println("                    2. ARRAYS (ARREGLOS)                           ");
        System.out.println("═══════════════════════════════════════════════════════════════════\n");
        
        System.out.println("✓ QUÉ ES:");
        System.out.println("  - Estructura de tamaño FIJO");
        System.out.println("  - Definido al momento de creación");
        System.out.println("  - NO puede cambiar de tamaño");
        
        System.out.println("\n✓ OPERACIONES:");
        System.out.println("  - array.length  → tamaño (ATRIBUTO, sin paréntesis)");
        System.out.println("  - array[i]      → acceder por índice");
        System.out.println("  - array[i] = x  → modificar");
        
        System.out.println("\n✓ DIFERENCIAS CLAVE con ArrayList:");
        System.out.println("  - Array: tamaño FIJO / ArrayList: tamaño DINÁMICO");
        System.out.println("  - Array: .length / ArrayList: .size()");
        System.out.println("  - Array: primitivos OK / ArrayList: solo wrappers");
        System.out.println("  - Array: array[i] / ArrayList: lista.get(i)");
        
        System.out.println("\n═══════════════════════════════════════════════════════════════════");
        System.out.println("            3. ALGORITMOS DE ORDENAMIENTO (O(n²))                  ");
        System.out.println("═══════════════════════════════════════════════════════════════════\n");
        
        System.out.println("BURBUJA (Bubble Sort)");
        System.out.println("─────────────────────");
        System.out.println("  Idea: Intercambiar elementos ADYACENTES si están en desorden");
        System.out.println("  Palabras clave: vecinos, adyacentes, burbujas suben");
        System.out.println("  Complejidad: O(n²) peor caso");
        System.out.println("  Swaps: MUCHOS");
        
        System.out.println("\nSELECCIÓN (Selection Sort)");
        System.out.println("──────────────────────────");
        System.out.println("  Idea: Buscar el MÍNIMO y colocarlo al inicio");
        System.out.println("  Palabras clave: buscar mínimo, seleccionar");
        System.out.println("  Complejidad: O(n²) siempre");
        System.out.println("  Swaps: POCOS (máximo n-1)");
        
        System.out.println("\nINSERCIÓN (Insertion Sort)");
        System.out.println("──────────────────────────");
        System.out.println("  Idea: INSERTAR cada elemento en su posición en la parte ordenada");
        System.out.println("  Palabras clave: insertar, construir, como cartas");
        System.out.println("  Complejidad: O(n²) peor caso, O(n) MEJOR CASO");
        System.out.println("  Mejor para: Arrays CASI ORDENADOS");
        
        System.out.println("\n═══════════════════════════════════════════════════════════════════");
        System.out.println("                    4. PREGUNTAS TÍPICAS                           ");
        System.out.println("═══════════════════════════════════════════════════════════════════\n");
        
        System.out.println("• ¿Diferencia Array vs ArrayList? → Fijo vs Dinámico");
        System.out.println("• ¿.length o .size()? → Array usa .length, ArrayList usa .size()");
        System.out.println("• ¿ArrayList<int> o ArrayList<Integer>? → Integer (wrapper)");
        System.out.println("• ¿Qué hace remove(2) vs remove(Integer.valueOf(2))? → Índice vs Valor");
        System.out.println("• ¿Algoritmo para array casi ordenado? → Inserción");
        System.out.println("• ¿Algoritmo que intercambia adyacentes? → Burbuja");
        System.out.println("• ¿Algoritmo que busca mínimo? → Selección");
        System.out.println("• ¿Qué algoritmo hace menos swaps? → Selección");
        System.out.println("• ¿Complejidad de burbuja peor caso? → O(n²)");
        
        System.out.println("\n═══════════════════════════════════════════════════════════════════");
        System.out.println("                    5. CHECKLIST FINAL                             ");
        System.out.println("═══════════════════════════════════════════════════════════════════\n");
        
        System.out.println("☐ Sé usar add(), get(), remove(), clear(), size()");
        System.out.println("☐ NO confundo .length (array) con .size() (ArrayList)");
        System.out.println("☐ Sé que ArrayList<int> es ERROR → debe ser ArrayList<Integer>");
        System.out.println("☐ Conozco recorridos: for-each, for indexado, while");
        System.out.println("☐ Sé que if-else NO recorre, solo evalúa");
        System.out.println("☐ Reconozco Burbuja por 'adyacentes'");
        System.out.println("☐ Reconozco Selección por 'buscar mínimo'");
        System.out.println("☐ Reconozco Inserción por 'insertar en parte ordenada'");
        System.out.println("☐ Sé que Inserción es mejor para arrays CASI ORDENADOS");
        System.out.println("☐ Todos los algoritmos vistos son O(n²) en peor caso");
        
        System.out.println("\n═══════════════════════════════════════════════════════════════════\n");
    }

    private static void mostrarConsejos() {
        limpiarPantalla();
        System.out.println("\n╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║               CONSEJOS PARA EL EXAMEN PARCIAL                    ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝\n");
        
        System.out.println("💡 ESTRATEGIA GENERAL:");
        System.out.println("   • Lee TODAS las opciones antes de responder");
        System.out.println("   • Busca palabras CLAVE en las preguntas");
        System.out.println("   • Si dudas, elimina las respuestas obviamente incorrectas");
        System.out.println();
        
        System.out.println("💡 PARA ARRAYLIST:");
        System.out.println("   • Si ves 'tamaño', piensa en .size() (NO .length)");
        System.out.println("   • Si ves 'acceder posición', piensa en .get(i)");
        System.out.println("   • Si mencionan tipo primitivo en <>, es ERROR");
        System.out.println("   • Recuerda: el primer índice es 0");
        System.out.println();
        
        System.out.println("💡 PARA ARRAYS:");
        System.out.println("   • Si ves 'tamaño fijo', piensa en Array");
        System.out.println("   • Si ves '.length', piensa en Array (sin paréntesis)");
        System.out.println("   • Arrays NO pueden crecer después de creados");
        System.out.println();
        
        System.out.println("💡 PARA ORDENAMIENTOS:");
        System.out.println("   • 'Adyacentes' o 'vecinos' → Burbuja");
        System.out.println("   • 'Buscar mínimo' → Selección");
        System.out.println("   • 'Insertar' o 'casi ordenado' → Inserción");
        System.out.println("   • Todos son O(n²) en peor caso");
        System.out.println("   • Menos swaps → Selección");
        System.out.println();
        
        System.out.println("💡 ERRORES COMUNES A EVITAR:");
        System.out.println("   ✗ Confundir .length con .size()");
        System.out.println("   ✗ Usar ArrayList<int> en vez de ArrayList<Integer>");
        System.out.println("   ✗ Pensar que array.get(i) existe (es array[i])");
        System.out.println("   ✗ Pensar que lista[i] funciona (es lista.get(i))");
        System.out.println("   ✗ Confundir remove(2) con remove(Integer.valueOf(2))");
        System.out.println();
        
        System.out.println("💡 DURANTE EL EXAMEN:");
        System.out.println("   • Gestiona bien tu tiempo (20 preguntas)");
        System.out.println("   • No te quedes trabado en una pregunta");
        System.out.println("   • Marca las dudosas y vuelve después");
        System.out.println("   • Confía en lo que estudiaste");
        System.out.println();
        
        System.out.println("🎯 ¡ÉXITO EN TU EXAMEN!");
        System.out.println();
    }

    private static void mostrarDespedida() {
        System.out.println("\n╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                  ║");
        System.out.println("║          ¡Suerte en tu examen de Estructura de Datos!            ║");
        System.out.println("║                                                                  ║");
        System.out.println("║     Recuerda: La práctica hace al maestro. ¡Tú puedes!          ║");
        System.out.println("║                                                                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝\n");
    }

    private static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void pausar() {
        System.out.println("\n[Presiona ENTER para continuar...]");
        scanner.nextLine();
    }

    private static void limpiarPantalla() {
        // En sistemas Unix/Linux/Mac
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        // Alternativa: imprimir líneas en blanco
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
}
