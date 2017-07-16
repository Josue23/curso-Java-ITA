public class RegistroPontos {
	// essa classe vai ter métodos para coisas que o usuário faz

	private CalculadoraBonus bonus;

	// construtor
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
		System.out.println(bonus.getClass());
		System.out.println(cb.getClass());
	}

	public void fazerUmComentario(Usuario u) {
		u.pontos += 3 * bonus.bonus(u);
	}

	public void criarUmTopico(Usuario u) {
		u.pontos += 5 * bonus.bonus(u);
	}

	public void darUmLike(Usuario u) {
		u.pontos += 1 * bonus.bonus(u);
	}
}
