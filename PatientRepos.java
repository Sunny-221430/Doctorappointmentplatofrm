package sunny.dpa.entities.repos;

import org.springframework.data.repository.CrudRepository;

import sunny.dpa.entities.Patient;

public interface PatientRepos extends CrudRepository<Patient, Long> {

}
