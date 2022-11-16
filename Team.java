public class Team {
 
	Member member;
	public Team(Member member) {
		
		this.member = member;
	}
 
	// Vamos avisar onde começa o programa: Aqui vai o 'main'
 
	public static void main(String[] args) {
		
		Member MeuJogador = new Member("Pelé", "Atacante", 10, 1);
		Team MeuTime = new Team(MeuJogador);
		
		System.out.println(MeuTime.member.getName());
		System.out.println(MeuTime.member.getType());
		System.out.println(MeuTime.member.getLevel());
		System.out.println(MeuTime.member.getRank());
	}
}