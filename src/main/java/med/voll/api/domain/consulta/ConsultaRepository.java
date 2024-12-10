package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    boolean existsByPacienteIdAndFechaBetween(@NotNull Long aLong, LocalDateTime primerHorario, LocalDateTime ultimoHorario);
    boolean existsByMedicoIdAndFecha(Long id, LocalDateTime fecha);
}
