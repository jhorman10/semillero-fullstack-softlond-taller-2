import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {
    private List<Alumno> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(String nombre, int edad) {
        Alumno alumno = new Alumno(nombre, edad);
        alumnos.add(alumno);
    }

    public void asignarCalificacion(String nombreAlumno, double calificacion) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                alumno.agregarCalificacion(calificacion);
                break;
            }
        }
    }

    public void mostrarInformacionAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Calificaciones: " + alumno.getCalificaciones());
            System.out.println("Promedio de calificaciones: " + alumno.calcularPromedioCalificaciones());
            System.out.println("--------------------------");
        }
    }
}
