package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Ekadashi;
import java.util.List;

public interface RepoEkadashi {
    List<Ekadashi> getEkadashiReminder(String str, String str2);
}
