package Modelo;

import java.util.Date;

public class trabajo {
    private int trabajoId;
    private String titulo;
    private String descripcion;
    private Date fechaPublicacion;
    private int artistaId;
    private Date fechaCreacion;

    public trabajo(int trabajoId, String titulo, String descripcion, Date fechaPublicacion, int artistaId, Date fechaCreacion) {
        this.trabajoId = trabajoId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.artistaId = artistaId;
        this.fechaCreacion = fechaCreacion;
    }

    public int getTrabajoId() {
        return trabajoId;
    }

    public void setTrabajoId(int trabajoId) {
        this.trabajoId = trabajoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(int artistaId) {
        this.artistaId = artistaId;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}