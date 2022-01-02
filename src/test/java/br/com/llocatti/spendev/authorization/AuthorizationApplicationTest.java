package br.com.llocatti.spendev.authorization;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class AuthorizationApplicationTest {

  @Test
  void contextLoads() {
    assertDoesNotThrow(() -> AuthorizationApplication.main(new String[] {}));
  }
}
