package com.wl.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 17997
 */
public class FormatUtils {
    public static String forTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
