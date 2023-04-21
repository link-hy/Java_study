package Date;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
    public static void main(String[] args) throws ParseException {
        String dstes="2023年01月08日 10:22:10";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1= sdf.parse(dstes);
        System.out.println(sdf.format(d1));
    }
}
