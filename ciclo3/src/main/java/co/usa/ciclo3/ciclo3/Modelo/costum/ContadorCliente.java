
package co.usa.ciclo3.ciclo3.Modelo.costum;

import co.usa.ciclo3.ciclo3.Modelo.Cliente;

public class ContadorCliente {
    private Integer total;
    private Cliente client;

    public ContadorCliente(Integer total, Cliente client) {
        this.total = total;
        this.client = client;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
}
