package me.shinsunyoung.mirimhackathon.dto;

import lombok.Getter;

@Getter
public class SavePostRequest {

  private String title;
  private String description;

  public SavePostDto toServiceDto() {
    return new SavePostDto(title, description);
  }
}
