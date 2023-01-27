package com.SharmarkeNSongr.songr.repositories;

import com.SharmarkeNSongr.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    public Song findByTitle(String title);
}
