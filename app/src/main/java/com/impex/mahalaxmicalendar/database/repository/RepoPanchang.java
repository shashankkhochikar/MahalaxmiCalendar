package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Panchang;
import java.util.List;

public interface RepoPanchang {
    List<Panchang> getPanchangInfo(String str);
}
