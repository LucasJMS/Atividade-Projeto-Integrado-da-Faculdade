public class Posto extends UnidadesAtendimento {

    private String vacinas;
    private String atendimentos;

    public Posto() {}

    public Posto(String vacinas) {
		this.setVacinas(vacinas);
	}

	public Posto(String atendimentos) {
		this.setAtendimentos(atendimentos);
	}

    public Posto(String vacinas, String atendimentos) {
		this.setVacinas(vacinas);
		this.setAtendimentos(atendimentos);
	}

    public int getVacinas() {
		return vacinas;
	}
	public void setVacinas(double vacinas) {
		this.vacinas = vacinas;
	}

	public int getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(int atendimentos) {
		this.atendimentos = atendimentos;
	}


	@Override
	public String toString() {
		return "Vacinas: " + vacinas + "\n" +
               "Atendimentos prestados: " + atendimentos ;
	}

}
