package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Notes;

public interface RepoNotes {
    String getNoteMsg(String str);

    void saveNotes(Notes notes);

    void updateNotes(Notes notes);
}
