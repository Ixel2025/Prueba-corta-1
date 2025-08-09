import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        System.out.println("*****GESTOR DE TAREAS PERSONALES*****");

        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion(scanner);

            switch (opcion) {
                case 1:
                    agregarTarea(scanner, gestor);
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    marcarCompletada(scanner, gestor);
                    break;
                case 4:
                    editarTarea(scanner, gestor);
                    break;
                case 5:
                    listarPorEstado(scanner, gestor);
                    break;
                case 6:
                    eliminarTarea(scanner, gestor);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("No es valido, elija una de las opciones anteriores");
            }
        } while (opcion != 7);

    }
    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar todas las tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Editar tarea");
        System.out.println("5. Listar tareas pendientes/completadas");
        System.out.println("6. Eliminar tarea");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // Limpiar el buffer
            System.out.print("Seleccione una opción: ");
        }
        return scanner.nextInt();
    }

    private static void agregarTarea(Scanner scanner, GestorTareas gestor) {
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("\n--- AGREGAR NUEVA TAREA ---");

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Fecha límite (formato libre): ");
        String fechaLimite = scanner.nextLine();

        System.out.print("Prioridad (Alta/Media/Baja): ");
        String prioridad = scanner.nextLine();

        System.out.print("Categoría (Trabajo/Estudio/Personal/Otro): ");
        String categoria = scanner.nextLine();

        Tarea nuevaTarea = new Tarea(descripcion, fechaLimite, prioridad, categoria);
        gestor.agregarTarea(nuevaTarea);

        System.out.println("Tarea agregada correctamente.");
    }

    private static void marcarCompletada(Scanner scanner, GestorTareas gestor) {
        if (gestor.cantidadTareas() == 0) {
            System.out.println("No hay tareas para marcar.");
            return;
        }

        System.out.print("\nIngrese el número de la tarea a marcar como completada: ");
        int indice = scanner.nextInt() - 1;
        gestor.marcarTareaComoCompletada(indice);
    }

    private static void editarTarea(Scanner scanner, GestorTareas gestor) {
        if (gestor.cantidadTareas() == 0) {
            System.out.println("No hay tareas para editar.");
            return;
        }

        scanner.nextLine(); // Para limpiar el buffer

        System.out.print("\nIngrese el número de la tarea a editar: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Deje en blanco los campos que no desea modificar.");

        System.out.print("Agregue una descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Agregue una fecha limite: ");
        String fechaLimite = scanner.nextLine();

        System.out.print("Agregue nueva prioridad: ");
        String prioridad = scanner.nextLine();

        System.out.print("Agregue nueva categoría: ");
        String categoria = scanner.nextLine();

        gestor.editarTarea(indice, descripcion, fechaLimite, prioridad, categoria);
    }

    private static void listarPorEstado(Scanner scanner, GestorTareas gestor) {
        System.out.println("**** LISTAR TAREAS POR ESTADo***");
        System.out.println("1. Tareas pendientes");
        System.out.println("2. Tareas completadas");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                gestor.listarTareasPorEstado(false);
                break;
            case 2:
                gestor.listarTareasPorEstado(true);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void eliminarTarea(Scanner scanner, GestorTareas gestor) {
        if (gestor.cantidadTareas() == 0) {
            System.out.println("No hay tareas para eliminar.");
            return;
        }

        System.out.print("\nIngrese el número de la tarea a eliminar: ");
        int indice = scanner.nextInt() - 1;
        gestor.eliminarTarea(indice);
    }
}