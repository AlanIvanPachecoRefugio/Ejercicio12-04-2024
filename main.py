#Pacheco Refugio Alan Ivan Paradigmas de Programacion -- Practica 12/04/2024

class Persona:
    def __init__(self, nombre, veces, edad, telefono, color):
        self.nombre = nombre    #Atributo 1
        self.veces = veces      #Atributo 2
        self.edad = edad        #Atributo 3
        self.telefono = telefono    #Atributo 4
        self.color = color      #Atributo 5

    def saludar(self):
        for i in range(self.veces):
            print(f'Hola{self.nombre}')

    def __str__(self):
        return f'Nombre {self.nombre}, Edad: {self.edad}, Telefono: {self.telefono}, Color: {self.color} y veces {self.veces}'


persona1 = Persona('Alan', 2,19,5540026211,'Verde')
persona1.saludar()
print(persona1)