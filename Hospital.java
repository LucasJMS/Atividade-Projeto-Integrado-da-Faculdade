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
		return "Número leitos de emergência: " + numLeitosEmergencia + "\n" +
               "Noúmero leitos de UTI: " + numLeitosUTI ;
	}

}
