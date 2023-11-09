import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.teladelogin.TelaDeLogin;

public class TelaDeLoginTeste {
	@Test
	public void testSuccessfulLogin() {
		TelaDeLogin telaDeLogin = new TelaDeLogin();
		assertTrue(telaDeLogin.login("mateus", "mateus123"));
	}

	@Test
	public void testFailedLogin() {
		TelaDeLogin telaDeLogin = new TelaDeLogin();
		assertFalse(telaDeLogin.login("lucas", "lucas321"));
	}

	@Test
	public void testAddUser() {
		TelaDeLogin telaDeLogin = new TelaDeLogin();
		telaDeLogin.addUser("testuser", "testpassword");
		assertTrue(telaDeLogin.login("testuser", "testpassword"));
	}

}