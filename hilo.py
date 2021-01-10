from timeit import timeit
import threading
def executeThread():
    contador = 0
    while contador<100:
        contador+=2
        print('Numero:', contador)
hilo1 = threading.Thread(target=executeThread)
hilo1.start()

print('Tiempo de ejecución en segundos.. ',(timeit(number=10000*3600)))

print('\n*****Numeros Pares en Python*****')

