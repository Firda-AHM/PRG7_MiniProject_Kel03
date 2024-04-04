package id.ac.astra.polytechnic.prg7_miniproject_kel03.repository;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<Rent, Integer> {
}
