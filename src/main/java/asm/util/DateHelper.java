package asm.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateHelper {

    private static final SimpleDateFormat ASM_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public static String formatUnixTimeForAsmApi(long unixEpoch) {

        Calendar fromCal = Calendar.getInstance();
        fromCal.setTimeInMillis(unixEpoch);

        ASM_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));

        return ASM_DATE_FORMAT.format(fromCal.getTime());
    }
}
