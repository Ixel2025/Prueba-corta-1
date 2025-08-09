import java.util.ArrayList;

public class GestorTareas {


    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea t) {
        listaTareas.add(t);
    }

    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
            return;
        }

        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println("Tarea #" + (i + 1));
            listaTareas.get(i).mostrarInfo();
        }
    }

    public void listarTareasPorEstado(boolean completadas) {
        boolean hayTareas = false;
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).isCompletada() == completadas) {
                System.out.println("Tarea #" + (i + 1));
                listaTareas.get(i).mostrarInfo();
                hayTareas = true;
            }
        }
        if (!hayTareas) {
            System.out.println(completadas ? "No hay tareas completadas." : "No hay tareas pendientes.");
        }
    }

    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).marcarComoCompletada();
            System.out.println("Tarea completada.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    public void editarTarea(int indice, String descripcion, String fechaLimite, String prioridad, String categoria) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).editarTarea(descripcion, fechaLimite, prioridad, categoria);
            System.out.println("Tarea editada correctamente.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
            System.out.println("Tarea eliminada correctamente.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    public int cantidadTareas() {
        return listaTareas.size();
    }
}