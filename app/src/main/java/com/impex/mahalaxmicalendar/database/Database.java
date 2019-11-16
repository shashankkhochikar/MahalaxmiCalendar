package com.impex.mahalaxmicalendar.database;

public class Database {
    public static final String DB_NAME = "mahalaxmi";
    public static final Integer DB_VERSION = Integer.valueOf(5);

    public static class TableAmavasyaPurnima {
        public static final String COL_AMAVASYA_PURNIMA = "amavasya_Purnima";
        public static final String COL_END_DATE = "end_date";
        public static final String COL_END_TIME = "time";
        public static final String COL_MONTH = "month";
        public static final String COL_SR_NO = "sr_no";
        public static final String COL_START_DATE = "start_date";
        public static final String COL_START_TIME = "start_time";
        public static final String TABLE_NAME = "amavasyaPurnima";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS amavasyaPurnima(");
            sb.append("sr_no integer ,");
            sb.append("amavasya_Purnima  text ,");
            sb.append("month  text ,");
            sb.append("start_date  text ,");
            sb.append("start_time  text ,");
            sb.append("end_date  text ,");
            sb.append("time  text ");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableCollectiveDataSheet {
        public static final String COL_DAILY_PANCHANG_INFO = "daily_panchang_info";
        public static final String COL_DATE = "date";
        public static final String COL_DAY = "day";
        public static final String COL_DAYS_HIGHLIGHTS = "days_highlights";
        public static final String COL_DAY_SUMMARY = "day_summary";
        public static final String COL_ENGLISH_DATE = "english_date";
        public static final String COL_FESTIVAL = "festival";
        public static final String COL_ISLAMIC_DATE = "islamic_date";
        public static final String COL_MONTH = "month";
        public static final String COL_NATIONAL_HOLIDAYS = "national_holidays";
        public static final String COL_SHUBH_ASHUBH_DAY = "shubh_ashubh_day";
        public static final String COL_SR_NO = "sr_no";
        public static final String TABLE_NAME = "collective_data_sheet";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS collective_data_sheet(");
            sb.append("sr_no integer ,");
            sb.append("date text,");
            sb.append("english_date text,");
            sb.append("day text,");
            sb.append("month text,");
            sb.append("day_summary text ,");
            sb.append("daily_panchang_info text,");
            sb.append("festival text,");
            sb.append("national_holidays text,");
            sb.append("days_highlights text,");
            sb.append("shubh_ashubh_day text,");
            sb.append("islamic_date text");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableDurgashtmi {
        public static final String COL_DATE = "date";
        public static final String COL_DAY = "day";
        public static final String COL_MONTH = "month";
        public static final String COL_SR_NO = "sr_no";
        public static final String TABLE_NAME = "durgashtami";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS durgashtami(");
            sb.append("sr_no integer ,");
            sb.append("month  text ,");
            sb.append("day  text ,");
            sb.append("date  text ");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableEkadashi {
        public static final String COL_DATE = "date";
        public static final String COL_DAY = "day";
        public static final String COL_EKADASHI = "ekadashi";
        public static final String COL_MONTH = "month";
        public static final String COL_SR_NO = "sr_no";
        public static final String TABLE_NAME = "ekadashi";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS ekadashi(");
            sb.append("sr_no integer ,");
            sb.append("month  text ,");
            sb.append("day  text ,");
            sb.append("date  text ,");
            sb.append("ekadashi  text ");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableMonthDetails {
        public static final String COL_MONTH = "month";
        public static final String COL_MONTH_INFO = "month_info";
        public static final String COL_SR_NO = "sr_no";
        public static final String TABLE_NAME = "month_details";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS month_details(");
            sb.append("sr_no integer PRIMARY KEY ,");
            sb.append("month text,");
            sb.append("month_info text");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableMuhurtas {
        public static final String COL_DATE = "date";
        public static final String COL_DAY = "day";
        public static final String COL_MONTH = "month";
        public static final String COL_MUHURT = "muhurt";
        public static final String TABLE_NAME = "muhurtas";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS muhurtas(");
            sb.append("date text ,");
            sb.append("day text ,");
            sb.append("muhurt text ,");
            sb.append("month text");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableNotes {
        public static final String COL_DATE = "date";
        public static final String COL_NOTE_MESSAGE = "note_msg";
        public static final String COL_SR_NO = "sr_no";
        public static final String TABLE_NAME = "notes";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS notes(");
            sb.append("sr_no integer PRIMARY KEY AUTOINCREMENT ,");
            sb.append("date  text ,");
            sb.append("note_msg  text ");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableNotification {
        public static final String COL_DATE_ENGLISH = "date_english";
        public static final String COL_DATE_MARATHI = "date_marathi";
        public static final String COL_IS_FIRED = "is_fired";
        public static final String COL_MESSAGE = "message";
        public static final String COL_MONTH = "month";
        public static final String TABLE_NAME = "notification";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS notification(");
            sb.append("month  text ,");
            sb.append("date_marathi  text ,");
            sb.append("date_english  integer ,");
            sb.append("message  text ,");
            sb.append("is_fired  integer");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TablePanchang {
        public static final String COL_BHARATIYA_SAUR_DATE = "bharatiya_saur_date";
        public static final String COL_DATE = "date";
        public static final String COL_DAY = "day";
        public static final String COL_ENGLISH_MONTH = "month";
        public static final String COL_KARAN = "karan";
        public static final String COL_LOCATION = "location";
        public static final String COL_MARATHI_MONTH = "marathi_month";
        public static final String COL_MOONRASHI = "moonrashi";
        public static final String COL_NAKSHATRA = "nakshatra";
        public static final String COL_SUNRISE = "sunrise";
        public static final String COL_SUNSET = "sunset";
        public static final String COL_THITHI = "tithi";
        public static final String COL_TIME_UP_TO_KARAN = "time_up_to_karan";
        public static final String COL_TIME_UP_TO_NAKSHATRA = "time_up_to_nakshatra";
        public static final String COL_TIME_UP_TO_THITHI = "time_up_to_tithi";
        public static final String COL_TIME_UP_TO_YOGA = "time_up_to_yoga";
        public static final String COL_YOGA = "yoga";
        public static final String TABLE_NAME = "panchang";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS panchang(");
            sb.append("location text ,");
            sb.append("date text,");
            sb.append("day text,");
            sb.append("marathi_month text,");
            sb.append("tithi text ,");
            sb.append("time_up_to_tithi text,");
            sb.append("nakshatra text,");
            sb.append("time_up_to_nakshatra text,");
            sb.append("yoga text,");
            sb.append("time_up_to_yoga text,");
            sb.append("karan text,");
            sb.append("time_up_to_karan text,");
            sb.append("moonrashi text,");
            sb.append("sunrise text,");
            sb.append("sunset text,");
            sb.append("bharatiya_saur_date text,");
            sb.append("month text");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableRashibhavishya {
        public static final String COL_AQUARIUS = "aquarius";
        public static final String COL_ARIES = "aries";
        public static final String COL_CANCER = "cancer";
        public static final String COL_CAPRICORN = "capricorn";
        public static final String COL_GEMINI = "gemini";
        public static final String COL_LEO = "leo";
        public static final String COL_LIBRA = "libra";
        public static final String COL_MONTH = "month";
        public static final String COL_PISCES = "pisces";
        public static final String COL_SAGITTARIUS = "sagittarius";
        public static final String COL_SCORPIO = "scorpio";
        public static final String COL_TAURUS = "taures";
        public static final String COL_VIRGO = "virgo";
        public static final String TABLE_NAME = "rashibhavishya";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS rashibhavishya(");
            sb.append("month text ,");
            sb.append("aries text,");
            sb.append("taures text,");
            sb.append("gemini text,");
            sb.append("cancer text ,");
            sb.append("leo text,");
            sb.append("virgo text,");
            sb.append("libra text,");
            sb.append("scorpio text,");
            sb.append("sagittarius text,");
            sb.append("capricorn text,");
            sb.append("aquarius text,");
            sb.append("pisces text");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableReminder {
        public static final String COL_DATE = "date";
        public static final String COL_DAY = "day";
        public static final String COL_FESTIVAL_NAME = "festival_name";
        public static final String COL_IS_FIRED = "is_fired";
        public static final String COL_MONTH = "month";
        public static final String COL_MUSIC_PATH = "music_path";
        public static final String COL_SR_NO = "sr_no";
        public static final String COL_TIME = "time";
        public static final String TABLE_NAME = "reminder";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS reminder(");
            sb.append("sr_no integer PRIMARY KEY AUTOINCREMENT,");
            sb.append("festival_name  text ,");
            sb.append("day  text ,");
            sb.append("date  text ,");
            sb.append("time  text ,");
            sb.append("month  text ,");
            sb.append("music_path  text ,");
            sb.append("is_fired  integer DEFAULT 0");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class TableSankashti {
        public static final String COL_DATE = "date";
        public static final String COL_DATE_ENGLISH = "english_date";
        public static final String COL_DAY = "day";
        public static final String COL_LOCATION = "location";
        public static final String COL_MONTH = "month";
        public static final String COL_TIME = "time";
        public static final String TABLE_NAME = "sankashti";

        public static String createTable() {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS sankashti(");
            sb.append("month text,");
            sb.append("date text ,");
            sb.append("location text ,");
            sb.append("time text ,");
            sb.append("day text ,");
            sb.append("english_date text");
            sb.append(")");
            return sb.toString();
        }
    }
}
