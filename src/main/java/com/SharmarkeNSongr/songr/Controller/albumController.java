package com.SharmarkeNSongr.songr.Controller;

import com.SharmarkeNSongr.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {
    // get /albums
    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        // first, create albums
        ArrayList<String> album = new ArrayList<>();
        Album album1 = new Album("Beautiful Minds", "Rod Wave", 24, 68.20, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/nx8kyc4u7hwlrfkejotl/rw?fimg-ssr");
        Album album2 = new Album("Her Loss", "Drake & 21 Savage", 16, 60.33, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/rrgyzeu7ucbf5styxkuw/drake-21-savage-her-loss-album-cver?fimg-ssr");
        Album album3 = new Album("An Evening with Silk Sonic", "Silk Sonic", 10, 31.19, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/n1spfyib0hwmvx7xvu75/silk-sonic?fimg-ssr");

        // second, create an ArrayList to hold them
        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        // then send the albums to the view
        // Using the Model, include key:value pairs
        m.addAttribute("albums", albums);
        // return to the template of album
        return "albums.html";
    }
}