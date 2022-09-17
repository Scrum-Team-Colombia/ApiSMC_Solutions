package scrumteamcolombia.smcsolutions.repositories; //el paquete esta diferente en el modelo esta bien

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import scrumteamcolombia.smcsolutions.models.Empresa;   //el proyecto esta diferente en el modelo esta bien

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    public abstract ArrayList<Empresa>findByPrioridad(Integer prioridad);
}
