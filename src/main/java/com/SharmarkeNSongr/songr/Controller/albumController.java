package com.SharmarkeNSongr.songr.Controller;

import com.SharmarkeNSongr.songr.model.Album;
import com.SharmarkeNSongr.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {
    @Autowired
    AlbumRepository albumRepository;

    // get /albums
    @GetMapping("/albums")
    public String getAllAlbums(Model m){
//        ArrayList<String> album = new ArrayList<>();
//        Album album1 = new Album("Beautiful Minds", "Rod Wave", 24, 68.20, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/nx8kyc4u7hwlrfkejotl/rw?fimg-ssr");
//        Album album2 = new Album("Her Loss", "Drake & 21 Savage", 16, 60.33, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/rrgyzeu7ucbf5styxkuw/drake-21-savage-her-loss-album-cver?fimg-ssr");
//        Album album3 = new Album("An Evening with Silk Sonic", "Silk Sonic", 10, 31.19, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/n1spfyib0hwmvx7xvu75/silk-sonic?fimg-ssr");
//
//        List<Album> albums = new ArrayList<>();
//        albums.add(album1);
//        albums.add(album2);
//        albums.add(album3);
        List<Album> albums = albumRepository.findAll();

        m.addAttribute("albums", albums);
        return "albums.html";
    }
    // post route to stores
    @PostMapping("/albums")
    public RedirectView addAlbum(String title,String artist, Integer songCount, Double length, String imgUrl ){
        // create new store
        Album newAlbum = new Album(title, artist, songCount, length, imgUrl);
        // add it to the DB
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
}