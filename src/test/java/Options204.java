
import org.apache.http.client.methods.HttpOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Options204 extends BaseClass{

    @Test
    public void optionsReturnCorrectMethodList() throws IOException {
        String header = "Access-Control-Allow-Methods";
        String ExpectedReply = "GET, POST, PATCH, PUT, DELETE";

        HttpOptions request =  new HttpOptions(BASE_ENDPOINT);

        response = client.execute(request);

        String actualValue = ResponseUtils.getHeader(response, header);
        Assert.assertEquals(ExpectedReply, actualValue);
    }

}
