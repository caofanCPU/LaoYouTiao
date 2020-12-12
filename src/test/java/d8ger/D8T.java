package d8ger;

import com.bitfly.platform.laoyoutiao.action.GraphEasyAction;
import org.junit.Test;

/**
 * This is a Test Demo showing how to execute a test case by junit.
 *
 * @author D8GER
 */
public class D8T {

    @Test
    public void hello() {
        String text = "coll.包含.T.转换为.F.再匹配条件predicate.找到就返回\nF.找不到返回.null";
        System.out.println(GraphEasyAction.graphEasyView(text));
    }
}
