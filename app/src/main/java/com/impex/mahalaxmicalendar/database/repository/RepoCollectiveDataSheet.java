package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.OtherFestival;
import java.util.List;

public interface RepoCollectiveDataSheet {
    String getDailyHighLights(String str);

    String getDailyPanchang(String str);

    List<String> getDateList();

    String getDaySummary(String str);

    List<String> getFestivalAndEvents(String str);

    List<String> getFestivalList(String str);

    List<OtherFestival> getFestivalListByMonth(String str);

    List<OtherFestival> getFestivalListToReminder(String str);

    String getFestivals(String str);

    String getFirstDateOfMonth(String str);

    String getIslamicDate(String str);

    String getLastDateOfMonth(String str);

    List<OtherFestival> getNationalHolidaysByMonth(String str);

    List<String> getNationalHolidaysInfo(String str);

    String getSecondLastDateOfMonth(String str);

    String getShubhAshubhDay(String str);

    String getWeekNameFromDate(String str);

    List<String> getWeekNameList();

    Boolean isDateValid(String str);
}
