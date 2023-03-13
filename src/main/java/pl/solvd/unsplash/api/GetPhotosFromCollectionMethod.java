package pl.solvd.unsplash.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

import static com.zebrunner.carina.utils.Configuration.getEnvArg;

@Endpoint(url = "${base_url}/collections/2/photos", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/photos/_getFromCollection/rs.schema")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetPhotosFromCollectionMethod extends AbstractApiMethodV2 {
    public GetPhotosFromCollectionMethod() {
        replaceUrlPlaceholder("base_url", getEnvArg("api_url"));
        addParameter("query", "london");
        addParameter("client_id", getEnvArg("access_token"));
    }
}