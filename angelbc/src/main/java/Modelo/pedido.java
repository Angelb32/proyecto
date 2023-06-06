package Modelo;

import java.util.Date;

public class pedido {
    private int pedidoId;
    private int clienteId;
    private int trabajoId;
    private Date fechaPedido;
    private double total;
    private Date fechaCreacion;

    public pedido(int pedidoId, int clienteId, int trabajoId, Date fechaPedido, double total, Date fechaCreacion) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.trabajoId = trabajoId;
        this.fechaPedido = fechaPedido;
        this.total = total;
        this.fechaCreacion = fechaCreacion;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTrabajoId() {
        return trabajoId;
    }

    public void setTrabajoId(int trabajoId) {
        this.trabajoId = trabajoId;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}