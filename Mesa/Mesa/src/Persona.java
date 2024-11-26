
// Clase Persona
public abstract class Persona {
    protected String nombre;
    protected String cedulaPersona;
    protected String email;
    protected String telefono;

    public Persona(String nombre, String cedulaPersona, String email, String telefono) {
        this.nombre = nombre;
        this.cedulaPersona = cedulaPersona;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}



