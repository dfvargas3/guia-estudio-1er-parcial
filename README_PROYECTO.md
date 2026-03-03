# Guía de Estudio - Estructura de Datos (Java 17)

## 📚 Descripción del Proyecto

Proyecto educativo en **Java 17** diseñado como guía de estudio interactiva para el **examen parcial de Estructura de Datos**. Cubre los fundamentos de **ArrayList**, **Arrays** y **Algoritmos de Ordenamiento** (Burbuja, Selección e Inserción).

Este proyecto contiene:
- ✅ Ejemplos prácticos y detallados de cada concepto
- ✅ Ejercicios resueltos con explicaciones
- ✅ Implementaciones completas de algoritmos de ordenamiento
- ✅ Comparaciones y análisis de complejidad
- ✅ Modo interactivo para practicar
- ✅ Resumen completo para el examen

## 📋 Contenido

### 1️⃣ ArrayList (Listas en Java)
- **Conceptos básicos**: tamaño dinámico, elementos duplicados
- **Métodos esenciales**: 
  - `add()` - agregar elementos
  - `get()` - acceder por índice
  - `size()` - obtener tamaño
  - `remove()` - eliminar elementos
  - `clear()` - vaciar lista
- **Recorridos**: for-each, for indexado, while
- **Ejercicios prácticos**: basados en preguntas típicas del examen

### 2️⃣ Arrays (Arreglos)
- **Características**: tamaño fijo, acceso por índice
- **Diferencias con ArrayList**: 
  - `.length` vs `.size()`
  - Tamaño fijo vs dinámico
  - Operaciones disponibles
- **Comparación detallada** Array vs ArrayList

### 3️⃣ Algoritmos de Ordenamiento
- **Bubble Sort (Burbuja)**: intercambio de elementos adyacentes
- **Selection Sort (Selección)**: búsqueda del mínimo
- **Insertion Sort (Inserción)**: inserción en parte ordenada
- **Análisis de complejidad**: comparaciones, swaps, tiempo
- **Comparación de los tres algoritmos**: ventajas, desventajas, cuándo usar cada uno

## 🚀 Requisitos

- **Java 17** o superior
- **Maven 3.6+** (para compilación)

## 📦 Estructura del Proyecto

```
guia-estudio-1er-parcial/
├── src/main/java/com/estudio/
│   ├── Main.java                              # Programa principal con menú
│   ├── listas/
│   │   ├── EjemplosArrayList.java             # Ejemplos de ArrayList
│   │   └── EjerciciosArrayList.java           # Ejercicios prácticos
│   ├── arreglos/
│   │   ├── EjemplosArray.java                 # Ejemplos de Arrays
│   │   └── ComparacionArrayVsArrayList.java   # Comparación detallada
│   └── ordenamiento/
│       ├── BubbleSort.java                    # Ordenamiento Burbuja
│       ├── SelectionSort.java                 # Ordenamiento Selección
│       ├── InsertionSort.java                 # Ordenamiento Inserción
│       └── ComparadorOrdenamientos.java       # Comparación de algoritmos
├── pom.xml                                    # Configuración Maven
├── README.md                                  # Documentación del curso
└── README_PROYECTO.md                         # Esta guía
```

## 🔧 Instalación y Ejecución

### Opción 1: Compilar y ejecutar con Maven

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar el programa principal
mvn exec:java -Dexec.mainClass="com.estudio.Main"
```

### Opción 2: Ejecutar clases individuales

```bash
# Ejemplos de ArrayList
mvn exec:java -Dexec.mainClass="com.estudio.listas.EjemplosArrayList"

# Ejercicios de ArrayList
mvn exec:java -Dexec.mainClass="com.estudio.listas.EjerciciosArrayList"

# Ejemplos de Arrays
mvn exec:java -Dexec.mainClass="com.estudio.arreglos.EjemplosArray"

# Comparación Array vs ArrayList
mvn exec:java -Dexec.mainClass="com.estudio.arreglos.ComparacionArrayVsArrayList"

# Bubble Sort
mvn exec:java -Dexec.mainClass="com.estudio.ordenamiento.BubbleSort"

# Selection Sort
mvn exec:java -Dexec.mainClass="com.estudio.ordenamiento.SelectionSort"

# Insertion Sort
mvn exec:java -Dexec.mainClass="com.estudio.ordenamiento.InsertionSort"

# Comparación de algoritmos
mvn exec:java -Dexec.mainClass="com.estudio.ordenamiento.ComparadorOrdenamientos"
```

### Opción 3: Compilar manualmente

```bash
# Compilar
javac -d target/classes src/main/java/com/estudio/**/*.java

# Ejecutar
java -cp target/classes com.estudio.Main
```

## 📖 Guía de Uso

### Programa Principal (Recomendado)

Ejecuta `Main.java` para acceder al menú interactivo:

```
╔═══════════════════════════════════════╗
║         MENÚ PRINCIPAL                ║
╠═══════════════════════════════════════╣
║                                       ║
║  1. ArrayList (Listas)                ║
║  2. Arrays (Arreglos)                 ║
║  3. Algoritmos de Ordenamiento        ║
║  4. Resumen Completo para el Examen   ║
║  5. Consejos para el Examen           ║
║  0. Salir                             ║
║                                       ║
╚═══════════════════════════════════════╝
```

### Modo Interactivo

Para practicar operaciones de ArrayList de forma interactiva:

```bash
mvn exec:java -Dexec.mainClass="com.estudio.listas.EjerciciosArrayList"
```

Luego comenta la línea `ejecutarTodos()` y descomenta `ejercicioInteractivo()` en el método `main`.

## 🎯 Conceptos Clave para el Examen

### ArrayList vs Array

| Característica | Array | ArrayList |
|----------------|-------|-----------|
| **Tamaño** | Fijo | Dinámico |
| **Obtener tamaño** | `.length` | `.size()` |
| **Acceder elemento** | `array[i]` | `lista.get(i)` |
| **Tipos de datos** | Primitivos | Wrappers |

### Algoritmos de Ordenamiento

| Algoritmo | Palabra Clave | Complejidad | Mejor para |
|-----------|---------------|-------------|------------|
| **Burbuja** | Adyacentes, vecinos | O(n²) | Arrays pequeños |
| **Selección** | Buscar mínimo | O(n²) | Pocos swaps |
| **Inserción** | Insertar, construir | O(n) mejor, O(n²) peor | Arrays casi ordenados |

### Errores Comunes

❌ **INCORRECTO**:
```java
ArrayList<int> numeros;           // Primitivo en ArrayList
array.length();                   // .length no es método
lista.length;                     // ArrayList no tiene .length
array.get(0);                     // Arrays no tienen .get()
lista[0];                         // ArrayList no usa []
```

✅ **CORRECTO**:
```java
ArrayList<Integer> numeros;       // Wrapper class
array.length;                     // Atributo sin paréntesis
lista.size();                     // Método con paréntesis
array[0];                         // Arrays usan []
lista.get(0);                     // ArrayList usa .get()
```

## 📝 Preguntas Típicas del Examen

1. **¿Diferencia principal entre Array y ArrayList?**
   - **Respuesta**: Array tiene tamaño fijo, ArrayList tiene tamaño dinámico

2. **¿Qué algoritmo compara e intercambia elementos adyacentes?**
   - **Respuesta**: Burbuja (Bubble Sort)

3. **¿Qué algoritmo funciona mejor con arrays casi ordenados?**
   - **Respuesta**: Inserción (Insertion Sort)

4. **¿Cuál es la forma correcta de declarar una lista de enteros?**
   - **Respuesta**: `ArrayList<Integer>` (NO `ArrayList<int>`)

5. **¿Qué hace `remove(2)` vs `remove(Integer.valueOf(2))`?**
   - **Respuesta**: El primero elimina por índice, el segundo elimina el valor 2

## 🎓 Consejos para el Examen

💡 **Estrategia General**:
- Lee TODAS las opciones antes de responder
- Busca palabras CLAVE en las preguntas
- Si dudas, elimina las respuestas obviamente incorrectas

💡 **Para ArrayList**:
- Si ves 'tamaño', piensa en `.size()` (NO `.length`)
- Si mencionan tipo primitivo en `<>`, es ERROR

💡 **Para Ordenamientos**:
- 'Adyacentes' o 'vecinos' → Burbuja
- 'Buscar mínimo' → Selección
- 'Insertar' o 'casi ordenado' → Inserción

## 🔗 Recursos Adicionales

- **README.md**: Guía de estudio completa con 50 preguntas
- **Código fuente**: Todos los archivos están comentados detalladamente
- **Ejemplos ejecutables**: Cada clase tiene su propio método `main()`

## 📄 Licencia

Este proyecto es de uso educativo para estudiantes del curso de Estructura de Datos.

## 👨‍🎓 Autor

Proyecto creado como guía de estudio para el examen parcial de Estructura de Datos.

---

**¡Buena suerte en tu examen! 🎯**

Recuerda: La práctica hace al maestro. Ejecuta los ejemplos, estudia las explicaciones y practica con los ejercicios.
