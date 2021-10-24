package com.kbe.unicorn.repository;

import com.kbe.unicorn.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<SongEntity, Long> {
}
