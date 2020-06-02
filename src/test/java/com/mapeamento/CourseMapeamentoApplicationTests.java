package com.mapeamento;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.domain.User;
import com.repository.UserRespository;

@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CourseMapeamentoApplicationTests {

	@Autowired
	private UserRespository userRespository;

	private static User generateUser() {
		User user = new User();
		user.setEmail("mat.s.ferreira@gmail.com");
		user.setId(1L);
		user.setName("Matheus Ferreira");
		user.setPassword("senhateste");
		user.setPhone("11956788120");

		return user;
	}

	@Test
	void testASaveUser() {
		userRespository.save(generateUser());

	}

	@Test
	void testBFindUser() {
		userRespository.save(generateUser());
		List<User> usuarios = userRespository.findAll();
		assertNotEquals(0, usuarios.size());
		for (User user : usuarios) {
			System.out.println(user.getName());
		}

	}

}
