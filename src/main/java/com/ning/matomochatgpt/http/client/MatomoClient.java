package com.ning.matomochatgpt.http.client;

import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.http.api.*;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Slf4j
@Repository
public class MatomoClient {
    @Getter
    private MatomoApi matomoApi;
    private ConfigClient configClient;
    private MatomoRequestParam matomoRequestParam;

    private MatomoClient(){}

    private MatomoClient(Builder builder){
        this.configClient = builder.configClient;
        this.matomoRequestParam = builder.matomoRequestParam;
        this.matomoApi = choose(builder.matomoRequestParam.getMethod());
    }

    private MatomoApi choose(String apiName){
        apiName = apiName.split("\\.")[0];
        if(Objects.equals(apiName, com.ning.matomochatgpt.constant.MatomoApi.API.getApiName())){
            return new ApiMethod(configClient,matomoRequestParam);
        }
        if(Objects.equals(apiName,com.ning.matomochatgpt.constant.MatomoApi.VisitsSummary.getApiName())){
            return new VisitsSummaryMethod(configClient,matomoRequestParam);
        }
        if(Objects.equals(apiName, com.ning.matomochatgpt.constant.MatomoApi.Referrers.getApiName())){
            return new ReferrersMethod(configClient,matomoRequestParam);
        }
        if(Objects.equals(apiName, com.ning.matomochatgpt.constant.MatomoApi.Actions.getApiName())){
            return new ActionsMethod(configClient,matomoRequestParam);
        }
        return null;
    }

    public static class Builder{
        private MatomoRequestParam matomoRequestParam;
        private ConfigClient configClient;



        public Builder matomoRequestParam(MatomoRequestParam matomoRequestParam){
            this.matomoRequestParam = matomoRequestParam;
            return this;
        }

        public Builder configClient(ConfigClient configClient){
            this.configClient = configClient;
            return this;
        }


        public MatomoClient builder(){
            return new MatomoClient(this);
        }
    }


}
