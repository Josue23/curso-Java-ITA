import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}

	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true; // 1 * 5 * 5
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
	}

	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3; // 3 * 5
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 15);
	}

	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true; // 2 * 5 * 5
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 50);
	}

	@Test
	public void pontosDarUmLike() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(u);
		assertEquals(u.pontos, 1); // bonusDoDia = 1
	}

	@Test
	public void pontosDarUmLikeVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true; // 1 * 5
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(u);
		assertEquals(u.pontos, 5);
	}

}
