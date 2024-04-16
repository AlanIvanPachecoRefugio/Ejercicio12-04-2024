//Pacheco Refugio Alan Ivan | Atributos en Java | Paradigmas de Programación | Practica 12/04/2024

public class Persona {      //representa una persona con atributo nombre con el poder de acceder y modificar 
    
    public String nombre;   //atributo 1
    public int edad;        //atributo 2
    public int telefono;    //atributo 3
    public String escuela;  //atributo 4
    public String color;    //atributo 5

    public Persona(String n, int e, int t, String s, String c)    //constructor
    {
        nombre=n;
        edad=e;
        telefono=t;
        escuela=s;
        color=c;
    }
    
    public String getNombre()   //devuleve el valor del atributo nombre 
    {
        return nombre;
    }
    
    public void setNombre(String n) //recibe a "n" como parametro y lo asigna a nombre 
    {
        nombre=n;
    }
    
    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int e)
    {
        edad=e;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public void setTelefono(int t)
    {
        telefono=t;
    }

    public String getEscuela()
    {
        return escuela;
    }

    public void setEscuela(String s)
    {
        escuela=s;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String c)
    {
        color=c;
    }

    @Override
    public String toString()    //devuelve la cadena en este caso el nombre 
    {
        return nombre+"-"+edad+"-"+telefono+"-"+escuela+"-"+color;
    }

    public static void main(String[] args) {        //ejecución se crea la instancia "Persona" y se obtiene, muestra y cambia le nombre 
        // Crea una instancia  de Persona
        Persona persona = new Persona("Alan", 19,554002621, "ESCOM", "verde");

        // Obtiene el nombre de la persona
        String nombre = persona.getNombre();
        int edad = persona.edad;
        int telefono = persona.telefono;
        String escuela = persona.escuela;
        String color = persona.color;
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La edad de la persona es: " + edad);
        System.out.println("El telefono de la persona es: " + telefono);
        System.out.println("La escuela de la persona es:" + escuela);
        System.out.println("El color favorito es: " + color);

        // Cambia el nombre de la persona
        persona.setNombre("Ivan");
        persona.edad=20;
        persona.telefono=5577878;
        persona.escuela="UPIICSA";
        persona.color="Verde";

        // Obtiene el nuevo nombre de la persona
        nombre = persona.getNombre();
        edad = persona.edad;
        telefono = persona.telefono;
        escuela = persona.escuela;
        color = persona.color;
        System.out.println("El nuevo nombre de la persona es: " + nombre);
        System.out.println("La nueva edad de la persona es: "+ edad);
        System.out.println("El nuevo telefono es: "+ telefono);
        System.out.println("La nueva escuela es: "+ escuela);
        System.out.println("El nuevo color favorito es: "+ color);
    }

}
