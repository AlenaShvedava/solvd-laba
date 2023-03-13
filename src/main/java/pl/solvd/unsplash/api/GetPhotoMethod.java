package pl.solvd.unsplash.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

import javax.ws.rs.QueryParam;

import static com.zebrunner.carina.utils.Configuration.getEnvArg;

@Endpoint(url = "${base_url}/search/photos", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/photos/_get/rs.schema")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetPhotoMethod extends AbstractApiMethodV2 {
    public GetPhotoMethod() {
        replaceUrlPlaceholder("base_url", getEnvArg("api_url"));
        addParameter("query", "london");
        addParameter("client_id", getEnvArg("access_token"));
    }
}
