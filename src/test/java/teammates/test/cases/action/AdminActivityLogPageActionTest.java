package teammates.test.cases.action;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import teammates.common.util.Const;

public class AdminActivityLogPageActionTest extends BaseActionTest {

    // private final DataBundle dataBundle = getTypicalDataBundle();

    @Override
    protected String getActionUri() {
        return Const.ActionURIs.ADMIN_ACTIVITY_LOG_PAGE;
    }
    
    @BeforeClass
    public void classSetup() {
        printTestClassHeader();
        // removeAndRestoreTypicalDataInDatastore();
    }
    
    @Test
    public void testExecuteAndPostProcess() {
        
        //TODO: implement this
    }

}
