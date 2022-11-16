class Member {
 
	private String name;
	private String type;
	private int level;
	private int rank;
 
	
	public Member(String name, String type, int level, int rank) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}

	
 /* as funções de GET aqui */
 
	
	public String getName() { 		// Qual o seu nome?
	return this.name; 				// Meu nome é ...
 }

	public String getType() { 		// Qual o seu tipo?
	return this.type; 				// Sou do tipo ...
 }

	public int getLevel() { 		// Qual seu nível?
	return this.level; 				// Meu nível é ...
 }

 public int getRank() { 			// Qual sua posição no ranking?
 return this.rank; 					// Minha posição no ranking é ...
 }
 
}
