package me.parkgyutae.springbootdeveloper.repository;

import me.parkgyutae.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
