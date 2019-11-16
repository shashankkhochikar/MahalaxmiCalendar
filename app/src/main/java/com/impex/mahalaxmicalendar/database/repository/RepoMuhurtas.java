package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Muhurtas;
import java.util.List;

public interface RepoMuhurtas {
    List<Muhurtas> getMuhurtByMonthAndMuhurt(String str, String str2);

    List<Muhurtas> getMuhurtInfoByMonth(String str);

    List<String> getMuhurtas();

    List<String> getTodayMuhurt(String str);
}
