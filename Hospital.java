public class Hospital extends UnidadesAtendimento {

    private int numLeitosEmergencia;
    private int numLeitosUTI;

    public Hospital() {}

    public Hospital(int numLeitosEmergencia, int numLeitosUTI) {
		this.setCodigo(numLeitosEmergencia);
		this.setNome(numLeitosUTI);
	}

    public int getNumLeitosEmergencia() {
		return numLeitosEmergencia;
	}
	public void setNumLeitosEmergencia(double numLeitosEmergencia) {
		this.numLeitosEmergencia = numLeitosEmergencia;
	}

	public int getNumLeitosUTI() {
		return numLeitosUTI;
	}
	public void setNumLeitosUTI(int numLeitosUTI) {
		this.numLeitosUTI = numLeitosUTI;
	}


	@Override
	public String toString() {
		return "N�mero leitos de emerg�ncia: " + numLeitosEmergencia + "\n" +
               "No�mero leitos de UTI: " + numLeitosUTI ;
	}

}
