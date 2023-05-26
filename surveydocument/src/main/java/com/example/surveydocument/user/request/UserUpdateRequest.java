package com.example.surveydocument.user.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserUpdateRequest {
    String nickname;

    String email;

    String description;
}
