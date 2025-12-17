package entities;

/**
 * Clase Persona que representa a una persona con datos personales básicos.
 * Incluye atributos, constructores, métodos dinámicos y métodos estáticos.
 */
public class Persona {

    // ====== Atributos (8, todos private) ======
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double altura;
    private double peso;
    private String telefono;
    private String email;

    // ====== Constructor por defecto ======
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.dni = "";
        this.altura = 0.0;
        this.peso = 0.0;
        this.telefono = "";
        this.email = "";
    }

    // ====== Constructor con todos los atributos ======
    public Persona(String nombre, String apellidos, int edad, String dni,
                   double altura, double peso, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.telefono = telefono;
        this.email = email;
    }

    // ====== Métodos dinámicos ======

    /**
     * Muestra los datos completos de la persona.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }

    /**
     * Indica si la persona es mayor de edad.
     *
     * @return true si edad >= 18
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // ====== Métodos ESTÁTICOS (OBLIGATORIOS) ======

    /**
     * Valida si un DNI tiene un formato básico correcto.
     *
     * @param dni DNI a validar
     * @return true si tiene 8 números y una letra
     */
    public static boolean validarDni(String dni) {
        if (dni == null) return false;
        return dni.matches("\\d{8}[A-Z]");
    }

    /**
     * Calcula el IMC a partir de peso y altura.
     *
     * @param peso peso en kg
     * @param altura altura en metros
     * @return IMC calculado o 0 si la altura no es válida
     */
    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0) return 0;
        return peso / (altura * altura);
    }

    // ====== Getters y Setters ======

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
