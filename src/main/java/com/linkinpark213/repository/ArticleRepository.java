package com.linkinpark213.repository;

import com.linkinpark213.model.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ooo on 2017/5/10 0010.
 */
public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {
}
