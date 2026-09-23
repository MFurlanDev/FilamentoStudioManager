import java.time.LocalDate;

public class Cliente {
    //Atributos
    private int codigoCliente;
    private String nombreCliente;
    private String correoCliente;
    private String telefonoCliente;
    private String direccionCliente;
    private LocalDate fechaAltaCliente;

    //Constructor
    public Cliente (int codigoCliente, String nombreCliente, String correoCliente, String telefonoCliente, String direccionCliente, LocalDate fechaAltaCliente) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
        this.fechaAltaCliente = LocalDate.now();
    }
}
