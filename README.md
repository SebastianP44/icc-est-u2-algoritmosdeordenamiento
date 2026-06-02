## Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.000 | 2544,51 ms | 19,69 ms | QuickSort | QuickSort fue mucho mas rapido. |
| 50.000 | 28994,86 ms | 32.89 ms | QuickSort | QuickSort sigue siendo mucho mas rapido y insercion subio significativamente. |
| 100.000 | 175590,60 ms | 358,43 ms | QuickSort | El metodo de insercion incremento demasiado. |

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.001 | 1,60 ms | 15,44 ms | Inserción | El metodo de insercion aprovecho que el arreglo estaba casi ordenado. |
| 50.001 | 9.70 ms | 113,39 ms | Inserción | El metodo de isercion sigue manteniendo tiempos bajos. |
| 100.001 | 23,01 ms | 354,79 ms | Inserción | El metodo Quicksort es muy lento en estos casos. |

## Análisis requerido

Después de completar las tablas, se debe responder:

- ¿Qué algoritmo fue más rápido en el escenario desordenado?
QuickSort fue mas rapido.
- ¿Qué algoritmo fue más rápido en el escenario casi ordenado?
Inserción fue mas rápido.
- ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?
No, afecto mas al metodo de insercion
- ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?
Porque con este metodo se deben realizar menos movimientos
- ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?
Porque ordena cantidades muy grandes con mayor eficiencia

**Nota:** Los resultados, observaciones y análisis deben ser escritos por cada uno con base en su ejecución. No se permite presentar análisis generados por IA.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

- Conclusión 1: QuickSort es mas rapido para аrreglos desordenаdos.
- Conclusión 2: EL metodo de insercion tuvo un mejor rendimiento para los arreglos cаsi ordenаdos.
- Conclusión 3: Cada metodo es mejor dependiendo del arreglo que se le den

**Importante:** Las conclusiones no pueden ser generadas con IA. Deben reflejar su análisis a partir de los resultados reales de la práctica.