package cn.mysic.util;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by liuchuan on 12/21/16.
 */
public class NumberUtil {
    private static Calendar calendar = Calendar.getInstance();
    private static DecimalFormat df = new DecimalFormat("#0.00");
    public static String format(double d){
        return df.format(d);
    }
    public static String formats(double d){
        return  d+"";
    }


    public static void main(String[] args) {
//        System.out.println(Math.round(Float.MAX_VALUE));
//        System.out.println(elementToCent(2147483647.123));
//        System.out.println(df.format(centToElement(2147483647)));
        HashMap currencyMaps = new HashMap();
        currencyMaps.put("CMY",213);
        currencyMaps.put("ATL",13);
        currencyMaps.put("TKD",321);
        currencyMaps.put("LFI",12);

final String[] mulitCurrencys = {""};
            currencyMaps.forEach((currency, currencyAmout) -> mulitCurrencys[0] += ("+"+currencyAmout+"(" + currency + ")"));
        System.out.println(mulitCurrencys[0].substring(1));
        System.out.println("dflsdfjoe".substring(1));
    }
    private static final double UNIT = 100.00;

    public static long elementToCent(double element ){
        return Math.round(element * UNIT);
    }

    public static double centToElement(long cent){
        return Math.abs(cent/UNIT);
    }
}
