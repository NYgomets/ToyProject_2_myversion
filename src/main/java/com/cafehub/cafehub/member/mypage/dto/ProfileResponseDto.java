package com.cafehub.cafehub.member.mypage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProfileResponseDto {
    private String nickname;
    private String email;
    private String profileImg;
}
