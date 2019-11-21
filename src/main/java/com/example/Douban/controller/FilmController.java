package com.example.Douban.controller;
import com.example.Douban.pojo.Film;
import com.example.Douban.pojo.FilmDetail;
import com.example.Douban.pojo.FilmEssay;
import com.example.Douban.service.FilmDetailService;
import com.example.Douban.service.FilmEssayService;
import com.example.Douban.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Description: 电影Controller
 *
 * @author Mr.Du
 * @version 1.0
 * @date 2019/11/21 17:14
 * @since JDK 1.8
 */

@RestController
@CrossOrigin
public class FilmController {

    @Autowired
    FilmService filmService=new FilmService();

    @Autowired
    FilmDetailService filmDetailService=new FilmDetailService();

    @Autowired
    FilmEssayService filmEssayService=new FilmEssayService();

    @GetMapping("/film")
    public List<Film> filmShow() throws ParseException {
        Film f=new Film();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf.parse("2012-11-11");
        List<Film> filmslist;
        filmslist=filmService.selectFromTimeAndArea(d, 13,50);
        return filmslist;
    }

    @GetMapping("/filmDetail")
    public List<FilmDetail> filmDetailshow() throws ParseException {
        List<FilmDetail> filmDetailList;
        filmDetailList=filmDetailService.selectMessageById("10440138",10);
        return filmDetailList;
    }

    @GetMapping("/filmEssay")
    public List<FilmEssay> filmEssayshow() throws ParseException{
        List<FilmEssay> filmEssayList;
        filmEssayList=filmEssayService.selectfilmEssay(10006301);
        return filmEssayList;
    }
}
