import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Creamos los dos ArrayList (uno para estudiantes y otro para cursos)
    static ArrayList<String> listaEstudiantes = new ArrayList<>();
    static ArrayList<String> listaCursos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            System.out.println("\n===========================");
            System.out.println("   SISTEMA DE GESTIÓN");
            System.out.println("===========================");
            System.out.println("1. Gestionar Estudiantes");
            System.out.println("2. Gestionar Cursos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcionPrincipal = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcionPrincipal) {
                case 1:
                    menuEstudiantes();
                    break;
                case 2:
                    menuCursos();
                    break;
                case 3:
                    System.out.println("Saliendo del programa... ¡Chao!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcionPrincipal != 3);
    }

    // ==========================================
    // MENÚ Y FUNCIONES CRUD DE ESTUDIANTES
    // ==========================================
    public static void menuEstudiantes() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ ESTUDIANTES ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    actualizarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static void agregarEstudiante() {
        System.out.print("Escribe el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        listaEstudiantes.add(nombre);
        System.out.println("¡Estudiante agregado con éxito!");
    }

    public static void mostrarEstudiantes() {
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados todavía.");
        } else {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + listaEstudiantes.get(i));
            }
        }
    }

    public static void actualizarEstudiante() {
        mostrarEstudiantes();
        if (!listaEstudiantes.isEmpty()) {
            System.out.print("Número de estudiante que deseas actualizar: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < listaEstudiantes.size()) {
                System.out.print("Escribe el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                listaEstudiantes.set(index, nuevoNombre);
                System.out.println("¡Estudiante actualizado!");
            } else {
                System.out.println("Número no válido.");
            }
        }
    }

    public static void eliminarEstudiante() {
        mostrarEstudiantes();
        if (!listaEstudiantes.isEmpty()) {
            System.out.print("Número de estudiante que deseas eliminar: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < listaEstudiantes.size()) {
                listaEstudiantes.remove(index);
                System.out.println("¡Estudiante eliminado!");
            } else {
                System.out.println("Número no válido.");
            }
        }
    }


    // ==========================================
    // MENÚ Y FUNCIONES CRUD DE CURSOS
    // ==========================================
    public static void menuCursos() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ CURSOS ---");
            System.out.println("1. Agregar curso");
            System.out.println("2. Mostrar cursos");
            System.out.println("3. Actualizar curso");
            System.out.println("4. Eliminar curso");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarCurso();
                    break;
                case 2:
                    mostrarCursos();
                    break;
                case 3:
                    actualizarCurso();
                    break;
                case 4:
                    eliminarCurso();
                    break;
                case 5:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static void agregarCurso() {
        System.out.print("Escribe el nombre del curso: ");
        String curso = scanner.nextLine();
        listaCursos.add(curso);
        System.out.println("¡Curso agregado con éxito!");
    }

    public static void mostrarCursos() {
        System.out.println("\n--- LISTA DE CURSOS ---");
        if (listaCursos.isEmpty()) {
            System.out.println("No hay cursos registrados todavía.");
        } else {
            for (int i = 0; i < listaCursos.size(); i++) {
                System.out.println((i + 1) + ". " + listaCursos.get(i));
            }
        }
    }

    public static void actualizarCurso() {
        mostrarCursos();
        if (!listaCursos.isEmpty()) {
            System.out.print("Número de curso que deseas actualizar: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < listaCursos.size()) {
                System.out.print("Escribe el nuevo nombre del curso: ");
                String nuevoCurso = scanner.nextLine();
                listaCursos.set(index, nuevoCurso);
                System.out.println("¡Curso actualizado!");
            } else {
                System.out.println("Número no válido.");
            }
        }
    }

    public static void eliminarCurso() {
        mostrarCursos();
        if (!listaCursos.isEmpty()) {
            System.out.print("Número de curso que deseas eliminar: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < listaCursos.size()) {
                listaCursos.remove(index);
                System.out.println("¡Curso eliminado!");
            } else {
                System.out.println("Número no válido.");
            }
        }
    }
}