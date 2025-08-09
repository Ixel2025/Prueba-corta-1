import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {


        private String descripcion;
        private String fechaLimite;
        private String prioridad;
        private String categoria;
        private boolean completada;

        // Constructor
        public Tarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
            this.descripcion = descripcion;
            this.fechaLimite = fechaLimite;
            this.prioridad = prioridad;
            this.categoria = categoria;
            this.completada = false;
        }


        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getFechaLimite() {
            return fechaLimite;
        }

        public void setFechaLimite(String fechaLimite) {
            this.fechaLimite = fechaLimite;
        }

        public String getPrioridad() {
            return prioridad;
        }

        public void setPrioridad(String prioridad) {
            this.prioridad = prioridad;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public boolean isCompletada() {
            return completada;
        }

        public void setCompletada(boolean completada) {
            this.completada = completada;
        }

public void mostrarInfo() {
    String estado = completada ? "Completada" : "Pendiente";
    System.out.println("Descripción: " + descripcion);
    System.out.println("Fecha límite: " + fechaLimite);
    System.out.println("Prioridad: " + prioridad);
    System.out.println("Categoría: " + categoria);
    System.out.println("Estado: " + estado);
    System.out.println("----------------------------------");
}

public void marcarComoCompletada() {
    this.completada = true;}
public void editarTarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
    if (descripcion != null && !descripcion.isEmpty()) {
        this.descripcion = descripcion;
    }
    if (fechaLimite != null && !fechaLimite.isEmpty()) {
        this.fechaLimite = fechaLimite;
    }
    if (prioridad != null && !prioridad.isEmpty()) {
        this.prioridad = prioridad;
    }
    if (categoria != null && !categoria.isEmpty()) {
        this.categoria = categoria;
    }
}}


