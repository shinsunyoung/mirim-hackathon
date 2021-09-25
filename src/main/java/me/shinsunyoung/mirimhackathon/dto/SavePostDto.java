package me.shinsunyoung.mirimhackathon.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SavePostDto {

  private final String title;
  private final String description;
}
