package scrumteamcolombia.smcsolutions.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import scrumteamcolombia.smcsolutions.models.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    public abstract ArrayList<Empresa>findByPrioridad(Integer prioridad);
}
