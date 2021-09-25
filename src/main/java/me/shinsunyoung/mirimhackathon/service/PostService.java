package me.shinsunyoung.mirimhackathon.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.shinsunyoung.mirimhackathon.domain.Post;
import me.shinsunyoung.mirimhackathon.dto.SavePostDto;
import me.shinsunyoung.mirimhackathon.repository.PostRepository;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class PostService {

  private final PostRepository postRepository;

  public List<Post> findAll() {
    return postRepository.findAll();
  }

  public Post save(final SavePostDto dto) {
    return postRepository.save(Post.builder()
        .title(dto.getTitle())
        .description(dto.getDescription())
        .build());
  }


}
