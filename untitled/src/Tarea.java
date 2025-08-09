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



