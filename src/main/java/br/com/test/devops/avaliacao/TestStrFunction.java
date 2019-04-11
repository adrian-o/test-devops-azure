package br.com.test.devops.avaliacao;

import java.util.Map;
import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

public class TestStrFunction extends AzureSpringBootRequestHandler<String, String> {

    @FunctionName("testStr")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req",
                    methods = {HttpMethod.GET},
                    authLevel = AuthorizationLevel.FUNCTION
            )
            HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        Map<String, String> pars = request.getQueryParameters();

        String filial = pars.get("filial");
        
        String resp = handleRequest(filial, context);
        
        return request.createResponseBuilder(HttpStatus.OK)
	        			.body(resp).build();
    }

}