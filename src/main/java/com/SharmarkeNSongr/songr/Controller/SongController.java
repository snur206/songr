package com.SharmarkeNSongr.songr.Controller;

import com.SharmarkeNSongr.songr.model.Album;
import com.SharmarkeNSongr.songr.model.Song;
import com.SharmarkeNSongr.songr.repositories.AlbumRepository;
import com.SharmarkeNSongr.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String getSongs(Model m){
        List<Song> albums = songRepository.findAll();

        m.addAttribute("albums", albums);

        return "song";
    }

    //Get one Song
    @GetMapping("/songs/{id}")
    public String getOneSong(@PathVariable Long id){
        Song returnedSong = SongRepository.findById(id).orElseThrow();
        return "song.html";
    }

    @PostMapping("/songs")
    public RedirectView addSong(String title, Double length, Integer trackNumber){
        Album songAppearing = AlbumRepository.findByTitle(title);
        Song newSong = new Song(title, length, trackNumber);
        songRepository.save(newSong);
        return new RedirectView("/albums");
    }


}
