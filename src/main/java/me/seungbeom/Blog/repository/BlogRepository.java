package me.seungbeom.Blog.repository;

import me.seungbeom.Blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article,Long> {
}
