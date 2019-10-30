package kata4;

import java.util.ArrayList;
import java.util.List;

public class MailHistogramBuilder {

    public static Histograma build(List<Mail> mailList) {
        Histograma<String> histogram = new Histograma();
        
        for(Mail mail: mailList)
            histogram.increment(mail.getDomain());
        
        return histogram;
    }
}
