package br.ibm.reserva.service;

import java.util.List;

import br.ibm.reserva.exceptions.DuracaoReservaException;
import br.ibm.reserva.model.Reserva;

public interface ReservaService {
	Reserva criaReserva(Reserva reserva) throws DuracaoReservaException ;
	
	Reserva obtemReservaPorId(String idReserva);
	
	List<Reserva> obtemTodasAsReservas();
	
	Reserva atualizaReserva(Reserva reserva);
	
	void deletaReserva(String idReserva);
	
}
