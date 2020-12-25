package d8ger;

import com.bitfly.platform.laoyoutiao.action.GraphEasyAction;
import com.bitfly.platform.laoyoutiao.util.ConstantUtil;
import org.junit.Test;

/**
 * This is a Test Demo showing how to execute a test case by junit.
 *
 * @author D8GER
 */
public class D8T {

    @Test
    public void hello() {
        String text = "A.1.B.2.C";
        String graphEasyDSL = GraphEasyAction.convertGraphEasyDSL(text);
        String replacement = GraphEasyAction.graphEasyView(graphEasyDSL);
        String friendlyResult = text + ConstantUtil.NEXT_LINE + replacement;
        System.out.println(friendlyResult);
    }
}
