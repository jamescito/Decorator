package org.james;

// import java.sql.Date;

//import javax.xml.crypto.Data;

public class Cliente {
    private String dni;
    private String nombre;
    private Fecha fechaNac;
    private String direccion;
    private String tfno;

    // constructor
    public Cliente(String p_dni, String p_nombre, Fecha p_fecnac, String p_direccion,

            String p_tfno) {
        dni = p_dni;
        nombre = p_nombre;
        fechaNac = p_fecnac;
        direccion = p_direccion;
        tfno = p_tfno;
    }

    // métodos
    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setnombre( String nombre){
        this.nombre=nombre;
    }

    public Fecha getfechaNac()
    {
        return this.fechaNac;
    }

    public void setfechaNac(Fecha fecha){
        this.fechaNac=fecha;
    }

    public String getdireccion(){
        return this.direccion;
    }

    public void setdireccion(String direccion){
        this.direccion=direccion;
    }

    public String gettfno(){
        return this.tfno;
    }

    public void settfno(String telefono){
        this.tfno=telefono;
    }

}
