lista = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
print(lista)
tam = len(lista)
ultimo = tam - 1
tam /= 2
for i in range(tam):
    aux = lista[i]
    lista[i] = lista[ultimo]
    lista[ultimo] = aux
    ultimo -= 1

print(lista)