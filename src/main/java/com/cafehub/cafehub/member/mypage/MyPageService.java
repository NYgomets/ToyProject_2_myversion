package com.cafehub.cafehub.member.mypage;

import com.amazonaws.services.s3.AmazonS3Client;
import com.cafehub.cafehub.member.repository.MemberRepository;
import com.cafehub.cafehub.security.jwt.JwtProvider;
import com.cafehub.cafehub.security.jwt.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class MyPageService {
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;
    private final AmazonS3Client s3Client;
    private final JwtProvider jwtProvider;
    private final MemberRepository memberRepository;
    private final ReviewRepository reviewRepository;
    private final CommentRepository commentRepository;
    private final BookmarkRepository bookmarkRepository;
    private final RefreshTokenRepository refreshTokenRepository;
    private final MemberU
}
