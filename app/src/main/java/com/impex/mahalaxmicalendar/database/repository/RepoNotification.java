package com.impex.mahalaxmicalendar.database.repository;

import com.impex.mahalaxmicalendar.domain.NotificationDetails;
import java.util.List;

public interface RepoNotification {
    List<NotificationDetails> getNotification(Integer num, String str);

    int updateNotificationStatus(Integer num, String str);
}
