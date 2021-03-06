package br.ibm.reserva.repository;

import java.time.LocalDateTime;
import java.util.List;

import br.ibm.reserva.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import br.ibm.reserva.model.Reserva;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

    Reserva findByIdAndStatus(String id, Status status);
}
