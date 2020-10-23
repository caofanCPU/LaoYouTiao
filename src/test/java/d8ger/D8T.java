package d8ger;

import com.bitfly.platform.laoyoutiao.util.DateUtil;
import org.junit.Test;

/**
 * This is a Test Demo showing how to execute a test case by junit.
 *
 * @author D8GER
 */
public class D8T {

    @Test
    public void hello() {
        System.out.println(DateUtil.enhanceParseMilliSeconds("2020-02-02T13:14:00"));
    }

}
