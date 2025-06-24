package br.com.barberpro.barberpro_api.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Date;
import org.springframework.stereotype.Service;
import br.com.barberpro.barberpro_api.entity.User;

@Service
public class JwtService {
    private final String secret = "sua_chave_secreta_muito_forte";
    private final long expirationTime = 86400000; // 1 dia em milissegundos

    public String generateToken(User user) {
        Date now = new Date();
        Date expiry = new Date(now.getTime() + expirationTime);

        return JWT.create()
                .withSubject(user.getUsername())
                .withIssuedAt(now)
                .withExpiresAt(expiry)
                .sign(Algorithm.HMAC256(secret));
    }

    public String extractUsername(String token) {
        DecodedJWT decoded = JWT.require(Algorithm.HMAC256(secret))
                .build()
                .verify(token);
        return decoded.getSubject();
    }
}