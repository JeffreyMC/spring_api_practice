package med.voll.api.domain.paciente;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    //Page<Paciente> findAllByActivoTrue(Pageable paginacion);

    @Query("""
           select p.activo
           from Paciente p
           where
           p.id = :id
           """)
    boolean findActivoById(Long id);
}
