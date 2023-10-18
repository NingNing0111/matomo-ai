package com.ning.matomochatgpt.entity.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Data;

/**
 * ClassName: ReferrersResponse <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Data
public class ReferrersResponse extends MatomoResponse {
    @JsonProperty("Referrers_visitorsFromSearchEngines")
    private int visitorsFromSearchEngines;

    @JsonProperty("Referrers_visitorsFromSocialNetworks")
    private int visitorsFromSocialNetworks;

    @JsonProperty("Referrers_visitorsFromDirectEntry")
    private int visitorsFromDirectEntry;

    @JsonProperty("Referrers_visitorsFromWebsites")
    private int visitorsFromWebsites;

    @JsonProperty("Referrers_visitorsFromCampaigns")
    private int visitorsFromCampaigns;

    @JsonProperty("Referrers_distinctSearchEngines")
    private int distinctSearchEngines;

    @JsonProperty("Referrers_distinctSocialNetworks")
    private int distinctSocialNetworks;

    @JsonProperty("Referrers_distinctKeywords")
    private int distinctKeywords;

    @JsonProperty("Referrers_distinctWebsites")
    private int distinctWebsites;

    @JsonProperty("Referrers_distinctWebsitesUrls")
    private int distinctWebsitesUrls;

    @JsonProperty("Referrers_distinctCampaigns")
    private int distinctCampaigns;

    @JsonProperty("Referrers_visitorsFromDirectEntry_percent")
    private String visitorsFromDirectEntryPercent;

    @JsonProperty("Referrers_visitorsFromSearchEngines_percent")
    private String visitorsFromSearchEnginesPercent;

    @JsonProperty("Referrers_visitorsFromCampaigns_percent")
    private String visitorsFromCampaignsPercent;

    @JsonProperty("Referrers_visitorsFromSocialNetworks_percent")
    private String visitorsFromSocialNetworksPercent;

    @JsonProperty("Referrers_visitorsFromWebsites_percent")
    private String visitorsFromWebsitesPercent;
}
