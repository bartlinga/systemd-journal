package com.bustleandflurry.systemd.journal;

/**
 * Created by bartlinga on 5/24/15.
 */
public class Syslog {
    public static final int LOG_EMERG = 0;   /* system is unusable */
    public static final int LOG_ALERT = 1;   /* action must be taken immediately */
    public static final int LOG_CRIT = 2;    /* critical conditions */
    public static final int LOG_ERR = 3;     /* error conditions */
    public static final int LOG_WARNING = 4; /* warning conditions */
    public static final int LOG_NOTICE = 5;  /* normal but significant condition */
    public static final int LOG_INFO = 6;    /* informational */
    public static final int LOG_DEBUG = 7;   /* debug-level messages */
}
