package br.com.barberpro.barberpro_api.security;

import br.com.barberpro.barberpro_api.entity.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class
JwtServiceTest {

    @Test
    void testGenerateAndExtractToken() {
        JwtService jwtService = new JwtService();
        User user = new User("usuarioTeste@email.com");

        String token = jwtService.generateToken(user);
        String usernameExtraido = jwtService.extractUsername(token);

        assertEquals("usuarioTeste", usernameExtraido);
    }
}