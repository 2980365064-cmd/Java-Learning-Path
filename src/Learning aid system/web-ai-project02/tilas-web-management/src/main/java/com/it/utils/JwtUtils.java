package com.it.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * JWT 工具类（适配 jjwt 0.11.5）
 */
public class JwtUtils {

    // 你原始代码的密钥（完全一致）
    private static final String SECRET_KEY = "aXRoZWltYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFh";

    // 12小时过期时间
    private static final long EXPIRATION_TIME = 12 * 60 * 60 * 1000L;

    /**
     * 生成 JWT 令牌
     */
    public static String generateToken(Map<String, Object> claims) {
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    /**
     * 解析 JWT 令牌
     */
    public static Claims parseToken(String jwt) {
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(jwt)
                .getBody();
    }
}