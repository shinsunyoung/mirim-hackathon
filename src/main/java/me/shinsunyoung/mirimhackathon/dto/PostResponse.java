package me.shinsunyoung.mirimhackathon.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.mirimhackathon.domain.Post;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class PostResponse {

  private String title;
  private String description;


  public static PostResponse toResponseDto(final Post post) {
    final PostResponse response = new PostResponse();
    response.title = post.getTitle();
    response.description = post.getDescription();

    return response;
  }

}
