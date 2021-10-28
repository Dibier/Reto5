
package co.usa.ciclo3.ciclo3.Modelo;

public class ClienteReservaciones {
    private Integer total;
    private Cliente cliente;

    public ClienteReservaciones(Integer total, Cliente cliente) {
        this.total = total;
        this.cliente = cliente;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
