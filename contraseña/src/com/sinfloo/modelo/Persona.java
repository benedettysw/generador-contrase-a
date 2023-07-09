
package com.sinfloo.modelo;

public class Persona {
    int id;
    String clave;
    String pagina;

    public Persona() {
    }

    public Persona(int id, String clave, String pagina) {
        this.id = id;
        this.clave = clave;
        this.pagina = pagina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

   
}
