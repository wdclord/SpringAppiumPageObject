package Suits;

import framework.FrameworkConfiguration;
import framework.SeleniumTestExecutionListener;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FrameworkConfiguration.class})
//@TestExecutionListeners({SeleniumTestExecutionListener.class, DependencyInjectionTestExecutionListener.class})
//@TestExecutionListeners(listeners = {ExecutionListener.class}, mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS)
public abstract class Suite {

}
