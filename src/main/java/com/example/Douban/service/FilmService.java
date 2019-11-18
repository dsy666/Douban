package com.example.Douban.service;
import com.example.Douban.mapper.FilmMapper;
import com.example.Douban.pojo.Film;
import com.example.Douban.pojo.FilmParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmMapper filmMapper;
    public List<Film> selectFromTimeAndArea(Date d,Integer area_id,Integer limitnum){
//            DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//            String pd=sdf.format(d);
            FilmParam filmParam=new FilmParam();
            filmParam.setArea_id(area_id);
            filmParam.setDate(d);
            filmParam.setLimitnum(limitnum);
            return filmMapper.selectFromTimeAndArea(filmParam);
    }
}
