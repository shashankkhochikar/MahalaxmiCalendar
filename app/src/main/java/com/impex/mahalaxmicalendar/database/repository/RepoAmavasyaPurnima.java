package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.AmavasyaPurnima;
import java.util.List;

public interface RepoAmavasyaPurnima {
    List<AmavasyaPurnima> getAmavasyaPurnimaReminder(String str, String str2, String str3);
}
