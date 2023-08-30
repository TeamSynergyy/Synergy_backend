package com.team.synergy.postlike;

import com.team.synergy.member.Member;
import com.team.synergy.member.MemberService;
import com.team.synergy.post.Post;
import com.team.synergy.post.PostService;
import com.team.synergy.postlike.dto.request.CreatePostLikeRequest;
import com.team.synergy.postlike.dto.request.DeletePostLikeRequest;
import com.team.synergy.postlike.dto.response.CreatePostLikeResponse;
import com.team.synergy.postlike.dto.response.DeletePostLikeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostLikeController {
    private final PostLikeService postLikeService;
    private final MemberService memberService;
    private final PostService postService;

    @PostMapping("/{postId}/likes")
    public ResponseEntity<CreatePostLikeResponse> createPostLike(@PathVariable Long postId, @RequestBody CreatePostLikeRequest request) {
        Member member = memberService.findMemberById(request.getMemberId());
        Post post = postService.findPostById(postId);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(postLikeService.createPostLike(member, post, request));
    }

    @DeleteMapping("/{postId}/likes")
    public ResponseEntity<Void> deletePostLike(@PathVariable Long postId, @RequestBody DeletePostLikeRequest request) {
        Member member = memberService.findMemberById(request.getMemberId());
        Post post = postService.findPostById(postId);
        postLikeService.deletePostLike(member, post);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
