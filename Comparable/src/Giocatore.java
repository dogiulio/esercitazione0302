public class Giocatore implements Comparable<Giocatore>{

	private int id;
    private String cognome;
    private String nome;
    private int eta;
    
    public Giocatore() {
		super();
	}
    
	public Giocatore(int id, String cognome, String nome, int eta) {
		super();
		this.id = id;
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public int compareTo(Giocatore altroGiocatore) {
	    return getCognome().compareTo(altroGiocatore.getCognome());
	}

	/*public int compareTo(Giocatore altroGiocatore) {
        return Integer.compare(getId(), altroGiocatore.getId());
    }*/
		

	
}