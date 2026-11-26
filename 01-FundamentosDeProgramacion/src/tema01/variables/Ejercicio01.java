package tema01.variables;
/**
 *      Desarrolla un programa que almacene la siguiente información de una persona
 *      ficticia:
 *      Nombre: Fernando 
 *      Edad: 21
 *      Estatura: 1.75
 *      Inicial del apellido: M
 *      Es estudiante: Verdadero
 *      Numero de control: "23240001"
 *      Semestre: 7
 *      Promedio general: 92.5
 * 
 */
public class Ejercicio01 {

    private String nombre;
    private int edad;
    private double estatura;
    private char inicialApellido;
    private boolean esEstudiante;
    private String numeroControl;
    private int semestre;
    private double promedioGeneral;

    public Ejercicio01() {
        this.nombre = "Fernando";
        this.edad = 21;
        this.estatura = 1.75;
        this.inicialApellido = 'M';
        this.esEstudiante = true;
        this.numeroControl = "23240001";
        this.semestre = 7;
        this.promedioGeneral = 92.5;
    }

    public static void main(String[] args) {
        new Ejercicio01().mostrarInformacion();
    }

    private void mostrarInformacion() {
        System.out.println("========= INFORMACIÓN PERSONAL ==========\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estatura: " + estatura + " metros");
        System.out.println("Inicial del Apellido: " + inicialApellido);
        System.out.println("Es estudiante: " + esEstudiante);
        System.out.println("Numero de Control: " + numeroControl);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio General: " + promedioGeneral);
        System.out.println("\n==================");
    }
}
