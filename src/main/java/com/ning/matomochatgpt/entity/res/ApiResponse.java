package com.ning.matomochatgpt.entity.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Data;

/**
 * ClassName: ApiResponse <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Data
public class ApiResponse extends MatomoResponse {
    @JsonProperty("nb_uniq_visitors")
    private int nbUniqVisitors;

    @JsonProperty("nb_visits")
    private int nbVisits;

    @JsonProperty("nb_users")
    private int nbUsers;

    @JsonProperty("nb_actions")
    private int nbActions;

    @JsonProperty("max_actions")
    private int maxActions;

    @JsonProperty("bounce_count")
    private int bounceCount;

    @JsonProperty("sum_visit_length")
    private int sumVisitLength;

    @JsonProperty("nb_visits_new")
    private int nbVisitsNew;

    @JsonProperty("nb_actions_new")
    private int nbActionsNew;

    @JsonProperty("nb_uniq_visitors_new")
    private int nbUniqVisitorsNew;

    @JsonProperty("nb_users_new")
    private int nbUsersNew;

    @JsonProperty("max_actions_new")
    private int maxActionsNew;

    @JsonProperty("bounce_rate_new")
    private String bounceRateNew;

    @JsonProperty("nb_actions_per_visit_new")
    private double nbActionsPerVisitNew;

    @JsonProperty("avg_time_on_site_new")
    private int avgTimeOnSiteNew;

    @JsonProperty("nb_visits_returning")
    private int nbVisitsReturning;

    @JsonProperty("nb_actions_returning")
    private int nbActionsReturning;

    @JsonProperty("nb_uniq_visitors_returning")
    private int nbUniqVisitorsReturning;

    @JsonProperty("nb_users_returning")
    private int nbUsersReturning;

    @JsonProperty("max_actions_returning")
    private int maxActionsReturning;

    @JsonProperty("bounce_rate_returning")
    private String bounceRateReturning;

    @JsonProperty("nb_actions_per_visit_returning")
    private double nbActionsPerVisitReturning;

    @JsonProperty("avg_time_on_site_returning")
    private int avgTimeOnSiteReturning;

    @JsonProperty("Referrers_visitorsFromSearchEngines")
    private int referrersVisitorsFromSearchEngines;

    @JsonProperty("Referrers_visitorsFromSocialNetworks")
    private int referrersVisitorsFromSocialNetworks;

    @JsonProperty("Referrers_visitorsFromDirectEntry")
    private int referrersVisitorsFromDirectEntry;

    @JsonProperty("Referrers_visitorsFromWebsites")
    private int referrersVisitorsFromWebsites;

    @JsonProperty("Referrers_visitorsFromCampaigns")
    private int referrersVisitorsFromCampaigns;

    @JsonProperty("Referrers_distinctSearchEngines")
    private int referrersDistinctSearchEngines;

    @JsonProperty("Referrers_distinctSocialNetworks")
    private int referrersDistinctSocialNetworks;

    @JsonProperty("Referrers_distinctKeywords")
    private int referrersDistinctKeywords;

    @JsonProperty("Referrers_distinctWebsites")
    private int referrersDistinctWebsites;

    @JsonProperty("Referrers_distinctWebsitesUrls")
    private int referrersDistinctWebsitesUrls;

    @JsonProperty("Referrers_distinctCampaigns")
    private int referrersDistinctCampaigns;

    @JsonProperty("PagePerformance_network_time")
    private double pagePerformanceNetworkTime;

    @JsonProperty("PagePerformance_network_hits")
    private int pagePerformanceNetworkHits;

    @JsonProperty("PagePerformance_servery_time")
    private double pagePerformanceServerTime;

    @JsonProperty("PagePerformance_server_hits")
    private int pagePerformanceServerHits;

    @JsonProperty("PagePerformance_transfer_time")
    private double pagePerformanceTransferTime;

    @JsonProperty("PagePerformance_transfer_hits")
    private int pagePerformanceTransferHits;

    @JsonProperty("PagePerformance_domprocessing_time")
    private double pagePerformanceDomProcessingTime;

    @JsonProperty("PagePerformance_domprocessing_hits")
    private int pagePerformanceDomProcessingHits;

    @JsonProperty("PagePerformance_domcompletion_time")
    private double pagePerformanceDomCompletionTime;

    @JsonProperty("PagePerformance_domcompletion_hits")
    private int pagePerformanceDomCompletionHits;

    @JsonProperty("PagePerformance_onload_time")
    private double pagePerformanceOnLoadTime;

    @JsonProperty("PagePerformance_onload_hits")
    private int pagePerformanceOnLoadHits;

    @JsonProperty("PagePerformance_pageload_time")
    private double pagePerformancePageLoadTime;

    @JsonProperty("PagePerformance_pageload_hits")
    private int pagePerformancePageLoadHits;

    @JsonProperty("avg_time_network")
    private double avgTimeNetwork;

    @JsonProperty("avg_time_server")
    private double avgTimeServer;

    @JsonProperty("avg_time_transfer")
    private double avgTimeTransfer;

    @JsonProperty("avg_time_dom_processing")
    private double avgTimeDomProcessing;

    @JsonProperty("avg_time_dom_completion")
    private double avgTimeDomCompletion;

    @JsonProperty("avg_time_on_load")
    private double avgTimeOnLoad;

    @JsonProperty("avg_page_load_time")
    private double avgPageLoadTime;

    @JsonProperty("nb_conversions")
    private int nbConversions;

    @JsonProperty("nb_visits_converted")
    private int nbVisitsConverted;

    @JsonProperty("revenue")
    private int revenue;

    @JsonProperty("conversion_rate")
    private String conversionRate;

    @JsonProperty("nb_conversions_new_visit")
    private int nbConversionsNewVisit;

    @JsonProperty("nb_visits_converted_new_visit")
    private int nbVisitsConvertedNewVisit;

    @JsonProperty("revenue_new_visit")
    private int revenueNewVisit;

    @JsonProperty("conversion_rate_new_visit")
    private String conversionRateNewVisit;

    @JsonProperty("nb_conversions_returning_visit")
    private int nbConversionsReturningVisit;

    @JsonProperty("nb_visits_converted_returning_visit")
    private int nbVisitsConvertedReturningVisit;

    @JsonProperty("revenue_returning_visit")
    private int revenueReturningVisit;

    @JsonProperty("conversion_rate_returning_visit")
    private String conversionRateReturningVisit;

    @JsonProperty("nb_pageviews")
    private int nbPageviews;

    @JsonProperty("nb_uniq_pageviews")
    private int nbUniqPageviews;

    @JsonProperty("nb_downloads")
    private int nbDownloads;

    @JsonProperty("nb_uniq_downloads")
    private int nbUniqDownloads;

    @JsonProperty("nb_outlinks")
    private int nbOutlinks;

    @JsonProperty("nb_uniq_outlinks")
    private int nbUniqOutlinks;

    @JsonProperty("nb_searches")
    private int nbSearches;

    @JsonProperty("nb_keywords")
    private int nbKeywords;

    @JsonProperty("Referrers_visitorsFromDirectEntry_percent")
    private String referrersVisitorsFromDirectEntryPercent;

    @JsonProperty("Referrers_visitorsFromSearchEngines_percent")
    private String referrersVisitorsFromSearchEnginesPercent;

    @JsonProperty("Referrers_visitorsFromCampaigns_percent")
    private String referrersVisitorsFromCampaignsPercent;

    @JsonProperty("Referrers_visitorsFromSocialNetworks_percent")
    private String referrersVisitorsFromSocialNetworksPercent;

    @JsonProperty("Referrers_visitorsFromWebsites_percent")
    private String referrersVisitorsFromWebsitesPercent;

    @JsonProperty("bounce_rate")
    private String bounceRate;

    @JsonProperty("nb_actions_per_visit")
    private double nbActionsPerVisit;

    @JsonProperty("avg_time_on_site")
    private int avgTimeOnSite;
}
