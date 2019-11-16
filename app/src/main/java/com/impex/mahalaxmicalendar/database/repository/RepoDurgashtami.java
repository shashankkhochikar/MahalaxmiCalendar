package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Durgashtami;
import java.util.List;

public interface RepoDurgashtami {
    List<Durgashtami> getDurgashtamiReminder(String str, String str2);
}
