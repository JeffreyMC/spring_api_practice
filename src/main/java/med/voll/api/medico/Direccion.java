package med.voll.api.medico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.DatosDireccion;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String calle;
    private String distrito;
    private String ciudad;
    private String numero;
    private String complemento;

    public Direccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.distrito = direccion.distrito();
        this.numero = direccion.numero();
        this.ciudad = direccion.ciudad();
        this.complemento = direccion.complemento();
    }

    public Direccion actualizarDireccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.distrito = direccion.distrito();
        this.numero = direccion.numero();
        this.ciudad = direccion.ciudad();
        this.complemento = direccion.complemento();

        return this;
    }
}
