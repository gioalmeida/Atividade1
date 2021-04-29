package entities;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {

	private Date data;
	private Status status;
	private Cargo cargo;
	public Contratacao(Date data, Status status, Cargo cargo) {
		
		this.data = data;
		this.status = status;
		this.cargo = cargo;
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
		
	}
	
	public void contratado() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitido() {
		this.status = Status.DEMITIDO;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Contratacao [data=" + data + ", status=" + status + ", cargo=" + cargo + "]";
	}
	
}
