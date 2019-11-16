package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Sankashti;
import java.util.List;

public interface RepoSankashti {
    Sankashti getLocationDayInfo(String str, String str2);

    List<String> getSankashtiLocation();

    List<Sankashti> getSankashtiReminder(String str, String str2, String str3);
}
