package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.Reminder;
import java.util.List;

public interface RepoReminder {
    Boolean getDeleteReminderList(Integer num);

    List<Reminder> getReminder(String str, String str2);

    List<Reminder> getReminderList();

    void saveDainikReminderData(Reminder reminder);

    void saveReminderData(Reminder reminder);

    int updateReminderStatus(String str, String str2);
}
