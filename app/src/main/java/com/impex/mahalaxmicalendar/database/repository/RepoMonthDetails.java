package com.impex.mahalaxmicalendar.database.repository;

import java.util.List;

public interface RepoMonthDetails {
    List<String> getMonthInfo(String str);

    String getMonthInfoFromDatabase(String str);

    List<String> getMonthList();

    String getMonthNameFromDatabase(Integer num);

    Integer getMonthNumberFromDatabase(String str);
}
