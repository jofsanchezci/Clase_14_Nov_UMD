def nombre(n):
	print(n,' Perez')

def nombre_edad(n,edad):
	print(n,' Perez', ' tiene ', edad)

def plusMethod(x,y):
	return x+y

nombre('Luis')
nombre('Juan')
nombre('Ana')

print("+++++++++++++++++++++++")

nombre_edad('Luis', 5)
nombre_edad('Juan', 8)
nombre_edad('Maria', 5)

print("+++++++++++++++++++++++")

print(plusMethod(8,5))
print(plusMethod(4.3,6.26))
print(plusMethod('Hola ','Mundo'))

print("+++++++++++++++++++++++")

x=10.0
y=20
z=x+y
print(z, type(z))
