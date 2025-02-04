def suma(n):
    if n == 1:
        return 1
    return n + suma(n - 1)
print("La suma de los números del 1 al 5 es:", suma(5))