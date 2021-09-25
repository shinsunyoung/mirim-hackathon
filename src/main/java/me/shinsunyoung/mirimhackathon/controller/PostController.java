package me.shinsunyoung.mirimhackathon.controller;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import me.shinsunyoung.mirimhackathon.domain.Post;
import me.shinsunyoung.mirimhackathon.dto.PostResponse;
import me.shinsunyoung.mirimhackathon.dto.SavePostRequest;
import me.shinsunyoung.mirimhackathon.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

  private final PostService postService;

  @PostMapping("/boards")
  public ResponseEntity<PostResponse> createPost(@RequestBody final SavePostRequest request) {
    final Post savedPost = postService.save(request.toServiceDto());

    return ResponseEntity.status(HttpStatus.CREATED)
        .body(PostResponse.toResponseDto(savedPost));
  }

  @GetMapping("/boards")
  public ResponseEntity<List<PostResponse>> getAllPosts() {
    final List<PostResponse> allPosts = postService.findAll()
        .stream()
        .map(PostResponse::toResponseDto)
        .collect(Collectors.toList());

    return ResponseEntity.ok()
        .body(allPosts);
  }

}
