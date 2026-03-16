package com.it;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {


    public  void main(String[] args) {
        testGenerateJwt();
    }
    @Test
    public  void testGenerateJwt() {

        
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", 1);
        claims.put("username", "zhangsan");
        
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"aXRoZWltYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFh")
                .addClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 3600000))
                .compact();
        
        System.out.println(jwt);
    }
    @Test
    public  void testParseJwt() {
        Claims clams = Jwts.parser()
                .setSigningKey("aXRoZWltYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFh")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOjEsInVzZXJuYW1lIjoiemhhbmdzYW4iLCJleHAiOjE3NzM1NjM2Nzh9.WrNjJC3k9fAVmmmqAk6srwgIqbrfvGfUrdRmm0Fbuws")
                .getBody();
        System.out.println(clams);
    }

}
