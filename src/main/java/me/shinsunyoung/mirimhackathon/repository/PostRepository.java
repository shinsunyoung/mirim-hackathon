package me.shinsunyoung.mirimhackathon.repository;

import me.shinsunyoung.mirimhackathon.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
