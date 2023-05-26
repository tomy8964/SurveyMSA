package com.example.surveydocument.user.controller;


import com.example.surveydocument.survey.exception.InvalidTokenException;
import com.example.surveydocument.survey.response.SurveyMyPageDto;
import com.example.surveydocument.user.request.UserUpdateRequest;
import com.example.surveydocument.user.service.UserService2;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Getter
@Setter
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService2 userService2;

    // 구글 추가 버전, requestParam으로 provider 받음
    @PostMapping("/oauth/token")
    public ResponseEntity getLogin(@RequestParam("code") String code, @RequestParam("provider") String provider) {
        return userService2.getLogin(code,provider);

    }

    @GetMapping("/me")
    public ResponseEntity<Object> getCurrentUser(HttpServletRequest request) throws Exception { //(1)
        return userService2.getCurrentUser(request);
    }


    @GetMapping("/mypage")
    public List<SurveyMyPageDto> getMyPage(HttpServletRequest request) throws InvalidTokenException { //(1)
        return userService2.mySurveyList(request);
    }

    @PostMapping("/updatepage")
    public String updateMyPage(HttpServletRequest request,@RequestBody UserUpdateRequest user) throws InvalidTokenException { //(1)
        return userService2.updateMyPage(request,user);
    }
}
