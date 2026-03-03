# Guía de estudio — Examen parcial (Semana 5)
**Curso:** Estructura de Datos  
**Enfoque del parcial:** Fundamentos de **arreglos**, **listas (ArrayList)** y **ordenamientos** en Java.  
**Formato:** preguntas de opción única y múltiple (20 preguntas).

---

## 1) Listas en Java (ArrayList): qué son y qué se evalúa

### 1.1 ¿Qué es una lista?
Una lista (en este contexto, un `ArrayList`) es una **colección ordenada** de elementos que se puede **recorrer y manipular** (agregar, eliminar, consultar).

**Ideas clave para el examen**
- Mantiene **orden de inserción**.
- Permite **elementos duplicados**.
- Su tamaño puede **crecer o disminuir** dinámicamente.  

---

## 2) Recorridos (loops) sobre listas

### 2.1 For-each (recomendado para imprimir/leer)
Sirve para recorrer todos los elementos de forma simple. En el examen se enfatiza que el recorrido correcto se hace con un **bucle** y que el `for-each` imprime cada elemento fácilmente.

**Ejemplo:**
```java
for (String n : nombres) {
    System.out.println(n);
}
```

### 2.2 For indexado (útil cuando necesitas el índice)
Se usa cuando necesitas la posición (`i`) para hacer `get(i)` o modificar.

```java
for (int i = 0; i < nombres.size(); i++) {
    System.out.println("i=" + i + " valor=" + nombres.get(i));
}
```

### 2.3 While (también válido)
El examen recuerda que los bucles `for` y `while` recorren listas; `if-else` solo evalúa condiciones.

---

## 3) Métodos esenciales de ArrayList (lo que TIENES que dominar)

### 3.1 size(): cuántos elementos hay
- `lista.size()` devuelve el **número de elementos**.
- Si devuelve `0`, la lista está **vacía**.

```java
if (lista.size() == 0) {
    System.out.println("Lista vacía");
}
```

### 3.2 get(indice): acceder por posición
Para acceder al elemento en una posición específica se usa `get()`.

```java
int x = edades.get(3); // obtiene el elemento en índice 3
```

> Nota típica de examen: confunden `get(3)` con `size(3)` o `index(3)`. El correcto para recuperar el valor es `get()`.

### 3.3 add(valor): agregar al final
`add()` agrega al **final**; si la lista está vacía, ese "final" es la posición `0`.

```java
ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(5); // queda en la posición 0
```

### 3.4 remove(...): eliminar
Formas comunes:
- `remove(indice)` elimina por posición.
- `remove(objeto)` elimina la primera ocurrencia del objeto.

```java
numeros.remove(0);              // por índice
nombres.remove("Diego");        // por objeto
```

### 3.5 clear(): vaciar completamente la lista
`clear()` borra **todo el contenido** de la lista (la lista sigue existiendo).

```java
nombres.clear();
```

### 3.6 OJO: métodos válidos y no válidos
El examen remarca que `ArrayList` usa métodos de colecciones como `.add()`, `.remove()`, `.clear()`.  
Y que **`.length()` NO es método de ArrayList**.

---

## 4) Arreglos (Array) vs ArrayList: diferencias que preguntan mucho

### 4.1 Tamaño fijo vs dinámico
- **Array**: tamaño **fijo** (se define al crearlo).
- **ArrayList**: tamaño **dinámico** (crece o se reduce).  

### 4.2 length vs size
- En **arrays** se usa el atributo **`.length`**.
- En **listas** se usa el método **`.size()`**.

Ejemplo:
```java
int[] a = {10, 20, 30};
System.out.println(a.length); // 3

ArrayList<Integer> l = new ArrayList<>();
l.add(10); l.add(20);
System.out.println(l.size()); // 2
```

### 4.3 Operaciones básicas en un Array
En un array puedes:
- acceder por índice
- recorrer elementos

Pero para "redimensionar" o "ordenar automáticamente" NO es nativo (normalmente usas utilidades).

---

## 5) Declaración correcta de listas genéricas (Integer vs int)

En colecciones no se usan primitivos (`int`), se usa su clase envolvente (`Integer`).

✅ Correcto:
```java
ArrayList<Integer> numeros = new ArrayList<>();
```

❌ Incorrecto:
```java
ArrayList<int> numeros = new ArrayList<>();
```

---

## 6) Ordenamientos vistos: Burbuja, Selección, Inserción

El examen se basa en los métodos "básicos": **burbuja, selección e inserción**.

### 6.1 Burbuja (Bubble Sort)
**Idea:** comparar pares **adyacentes** y cambiar si están en desorden; se repite por "pasadas".

**Cuándo se reconoce en preguntas:**
- “intercambiar vecinos”
- “en cada pasada los mayores van ‘subiendo’ al final”

**Complejidad (peor caso):** `O(n²)` (muchas comparaciones).

### 6.2 Selección (Selection Sort)
**Idea:** en cada pasada busca el **mínimo** (o máximo) y lo coloca en su posición correspondiente (típicamente al inicio).

**Se reconoce por frases como:**
- "buscar el menor y colocarlo al inicio"

### 6.3 Inserción (Insertion Sort)
**Idea:** construye una parte ordenada e **inserta** cada elemento en su posición correcta dentro de esa parte.

**Funciona mejor cuando:** el arreglo está **casi ordenado**, porque requiere pocos movimientos.

---

# Banco de preguntas (Repositorio para estudiar) — 50 en total
> Úsalas como “bademécum”: intenta responder primero sin mirar la solución. Luego revisa explicación.

**1.** Diferencia práctica entre `remove(2)` y `remove(Integer.valueOf(2))` en una lista de enteros.
**Respuesta:** el primero elimina por índice; el segundo elimina el elemento con valor 2. **Explicación:** sobrecarga del método.

**2.** ¿Qué hace `remove(0)` sobre `["x","y","z"]`?
**Respuesta:** elimina `"x"` y queda `["y","z"]`. **Explicación:** remove por índice.

**3.** Inserción funciona mejor cuando…  
**Respuesta:** el arreglo está casi ordenado.

**4.** Diferencia principal Array vs ArrayList:  
**Respuesta:** Array tamaño fijo; ArrayList dinámico.

**5.** Si ejecutas `numeros.add(5);` sobre una lista vacía, ¿qué ocurre?  
**Respuesta:** se añade en la posición 0. **Explicación:** `add()` agrega al final; si está vacía, el final es índice 0.

**6.** Inserción funciona mejor cuando…
**Respuesta:** cuando el arreglo está casi ordenado.

**7.** ¿Qué imprime?
```java
ArrayList<String> n = new ArrayList<>();
n.add("Ana"); n.add("Ana");
System.out.println(n.size());
```
**Respuesta:** `2`. **Explicación:** permite duplicados.

**8.** Diferencias entre arreglo y lista (elige varias):  
**Respuesta:** el arreglo tiene tamaño fijo; la lista puede crecer; la lista es parte de colecciones. **Explicación:** array fijo vs ArrayList dinámico.

**9.** ¿Cuál es la forma correcta de declarar una lista de `double`?
**Respuesta:** `ArrayList<Double>`. **Explicación:** wrapper `Double`, no `double`.

**10.** Burbuja se caracteriza por…  
**Respuesta:** intercambiar elementos adyacentes si están en desorden.

**11.** ¿Qué imprime?
```java
int[] a = {5, 6, 7};
System.out.println(a[0]);
```
**Respuesta:** `5`. **Explicación:** acceso por índice.

**12.** ¿Qué pasa aquí?
```java
ArrayList<Integer> l = new ArrayList<>();
l.add(10);
System.out.println(l.get(1));
```
**Respuesta:** error en tiempo de ejecución (IndexOutOfBounds). **Explicación:** solo existe índice 0.

**13.** Operaciones básicas sobre un Array en Java (elige varias):  
**Respuesta:** acceder por índice, recorrer elementos.

**14.** ¿Qué método devuelve el número de elementos en un `ArrayList`?  
**Respuesta:** `size()`. **Explicación:** `.length` es de arreglos, no de colecciones.

**15.** Verdadero/Falso: “Un array en Java puede crecer cuando agrego elementos”.
**Respuesta:** Falso. **Explicación:** tamaño fijo.

**16.** Verdadero/Falso: “Un ArrayList puede almacenar `int` directamente”.
**Respuesta:** Falso. **Explicación:** usa `Integer` (wrapper).

**17.** Complejidad temporal de burbuja en peor caso:  
**Respuesta:** `O(n²)`.

**18.** ¿Qué devuelve `isEmpty()` si la lista tiene 0 elementos?
**Respuesta:** `true`. **Explicación:** lista vacía.

**19.** ¿Cuál elegirías para datos cuyo tamaño no conoces al inicio?
**Respuesta:** `ArrayList`. **Explicación:** tamaño dinámico.

**20.** ¿Qué estructura de control recorre e imprime todos los valores de una lista `nombres`?  
**Respuesta:** for-each. **Explicación:** recorrer listas se hace con bucles y for-each imprime cada elemento fácilmente.

**21.** Traza 1 pasada de burbuja sobre `[3, 1, 2]` (comparando vecinos una vez de izquierda a derecha).
**Respuesta:** compara (3,1) → swap → `[1,3,2]`; compara (3,2) → swap → `[1,2,3]`.  
**Explicación:** burbuja intercambia adyacentes si están en desorden.

**22.** Métodos de ordenamiento vistos en clase (elige varios):  
**Respuesta:** Burbuja, Selección, Inserción.

**23.** Diferencia entre `a.length` y `a.length()` en arrays.
**Respuesta:** `a.length` existe; `a.length()` no (error). **Explicación:** length es atributo, no método.

**24.** ¿Qué algoritmo realiza más swaps: selección o burbuja? (pensando en implementación típica)
**Respuesta:** burbuja suele hacer más swaps; selección hace a lo sumo 1 swap por pasada. **Explicación:** selección “elige mínimo” y ubica.

**25.** ¿Qué algoritmo busca el mínimo en cada pasada y lo coloca al inicio?
**Respuesta:** Selección.

**26.** ¿Qué imprime?
```java
int[] a = new int[3];
System.out.println(a.length);
```
**Respuesta:** `3`. **Explicación:** length es atributo del array.

**27.** ¿Qué ocurre si llamas `clear()` y luego `size()`?
**Respuesta:** `size()` devuelve 0. **Explicación:** se vacía contenido.

**28.** ¿Qué imprime este código?
```java
ArrayList<String> a = new ArrayList<>();
a.add("A"); a.add("B");
System.out.println(a.size());
```
**Respuesta:** `2`. **Explicación:** `size()` cuenta elementos.

**29.** ¿Cuál es el índice del primer elemento de un `ArrayList`?
**Respuesta:** 0. **Explicación:** colecciones indexadas inician en 0.

**30.** ¿Qué algoritmo va “insertando” cada elemento en la parte ya ordenada?
**Respuesta:** Inserción.

**31.** ¿Cuál es el peor caso de complejidad de burbuja?
**Respuesta:** `O(n²)`.

**32.** ¿Cuál usarías si necesitas máximo rendimiento y tamaño fijo?
**Respuesta:** Array. **Explicación:** estructura simple y fija.

**33.** ¿Se puede cambiar el tamaño de un array después de crearlo?
**Respuesta:** No. **Explicación:** tamaño fijo.

**34.** En selección sobre `[3, 1, 2]`, ¿qué queda después de la primera pasada (colocar el mínimo al inicio)?
**Respuesta:** mínimo=1, swap con primera posición → `[1,3,2]`.

**35.** ¿Qué hace `nombres.clear()`?  
**Respuesta:** vacía completamente la lista (borra su contenido).

**36.** ¿Qué algoritmo elegirías para una lista pequeña y casi ordenada?
**Respuesta:** inserción.

**37.** Si en burbuja no hubo intercambios en una pasada, ¿qué puedes concluir?
**Respuesta:** que el arreglo ya está ordenado (puedes terminar). **Explicación:** optimización típica.

**38.** Si `lista.size()` devuelve 0, la lista está…  
**Respuesta:** vacía. **Explicación:** size indica cantidad; 0 implica sin datos.

**39.** ¿Qué recorrido usarías si necesitas imprimir “posición + valor”?
**Respuesta:** `for` indexado. **Explicación:** necesitas el índice.

**40.** ¿Cuál usa `.size()` y cuál usa `.length`?
**Respuesta:** ArrayList usa `size()`; Array usa `length`.

**41.** Marca métodos válidos en `ArrayList`: `.add()`, `.remove()`, `.clear()`, `.length()`  
**Respuesta:** `.add()`, `.remove()`, `.clear()`. **Explicación:** `.length` es de arreglos.

**42.** ¿Qué imprime?
```java
String[] s = {"a","b"};
for (String x : s) System.out.print(x);
```
**Respuesta:** `ab`. **Explicación:** for-each recorre arreglos también.

**43.** En programación, una lista es…  
**Respuesta:** una colección ordenada de elementos que se pueden recorrer y manipular.

**44.** Declaración correcta de lista de enteros en Java:  
**Respuesta:** `ArrayList<Integer> numeros = new ArrayList<>();` **Explicación:** no se usan primitivos en colecciones; se usa `Integer`.

**45.** Características de `ArrayList` (elige varias):  
**Respuesta:** permite duplicados, crece dinámicamente.

**46.** ¿Cómo se accede a la longitud de un Array?  
**Respuesta:** `array.length`. **Explicación:** arrays usan `.length` y listas `.size()`.

**47.** Selección consiste en…  
**Respuesta:** buscar el mínimo y colocarlo al inicio (pasada a pasada).

**48.** Para acceder al elemento en la posición 3 de `edades` (ArrayList), ¿qué se usa?  
**Respuesta:** `edades.get(3)`. **Explicación:** `get()` recupera por índice.

**49.** ¿Qué recorridos se pueden usar en una lista? (elige varios)  
**Respuesta:** `for-each`, `for` indexado, `while`. **Explicación:** bucles recorren; if-else no.

**50.** ¿Qué algoritmo compara e intercambia elementos vecinos repetidamente?
**Respuesta:** Burbuja.

---

## Checklist final (para que sí pasen)
- No confundir: **`.length` (array)** vs **`.size()` (ArrayList)**.  
- Saber usar: `add`, `get`, `remove`, `clear`, `size`.  
- Tener claras las "frases clave" de cada ordenamiento:  
  - Burbuja = **adyacentes**.  
  - Selección = **buscar mínimo** y ubicar.  
  - Inserción = **mejor si casi ordenado**.
