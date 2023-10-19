package Class;
public class Perro {
    private int edad;
    private float  altura, peso;
    private String nombre, raza, color;
    //metodos
    public void comer(String tipoComida, double cantidadGramos){
        System.out.println(nombre + " comió " + tipoComida + " de " + cantidadGramos + " gramos.");
    }
    public String ladrar(){
        return "guau guau";
    }
    public void informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + "cm");
        System.out.println("Peso: " + peso + "kg");
    }
    //getter
    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    //setter

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

}