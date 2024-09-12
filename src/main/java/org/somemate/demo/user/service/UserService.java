package org.somemate.demo.user.service;

import org.somemate.demo.user.dto.User;

import java.sql.SQLException;

public interface UserService {

    // 사용자 등록 메서드
    void registerUser(User user) throws SQLException, IllegalArgumentException;

    // 사용자 로그인 메서드, 로그인 성공 시 토큰 반환
    String loginUser(String userID, String password) throws SQLException;

    // 사용자 로그아웃
    void logoutUser(String refreshToken) throws SQLException;

    // 사용자 ID로 사용자 정보 조회
    User getUserById(int id) throws SQLException;

    // 사용자 정보 업데이트 메서드
    boolean updateUser(int id, User user) throws SQLException;


}
