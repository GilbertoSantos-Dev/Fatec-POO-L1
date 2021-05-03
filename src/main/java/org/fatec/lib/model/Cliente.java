package org.fatec.lib.model;

public class Cliente extends Pessoa{
	private Pessoa pes;

	public Cliente(Pessoa pes) {
		super();
		this.pes = pes;
	}

	public Pessoa getPes() {
		return pes;
	}

	public void setPes(Pessoa pes) {
		this.pes = pes;
	}

	
}
