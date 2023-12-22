package it.corso.service;

import it.corso.model.Utente;

public class UtenteServiceImpl implements UtenteService
{

	@Override
	public void registrazioneUtente(Utente utente) {
		System.out.println(utente.getNome()+ " registrato");
	}

}
