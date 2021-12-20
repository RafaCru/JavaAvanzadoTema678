package com.company;

public class ClienteSingleton {
    private static ClienteSingleton clienteSingleton;


    int codigo;
    String nombre;
    String direccion;
    int cp;
    String poblacion;
    int telefono;
    private ClienteSingleton(){}
    public static ClienteSingleton getInstance() {
         if (clienteSingleton==null){
             clienteSingleton=new ClienteSingleton();
         }
         return clienteSingleton;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

//    @Override
//    public String toString() {
//        return "ClienteSingleton{" +
//                "codigo=" + codigo +
//                ", nombre='" + nombre + '\'' +
//                ", direccion='" + direccion + '\'' +
//                ", cp=" + cp +
//                ", poblacion='" + poblacion + '\'' +
//                ", telefono=" + telefono +
//                '}';
//    }
}
