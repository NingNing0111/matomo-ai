package com.ning.matomochatgpt.entity.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Data;

/**
 * ClassName: VisitFrequencyResponse <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/19 0019
 * @since JDK 11
 */
public class VisitFrequencyResponse extends MatomoResponse {
    @JsonProperty("nb_uniq_visitors_new")
    private int uniqueVisitorsNew;

    @JsonProperty("nb_users_new")
    private int usersNew;

    @JsonProperty("nb_visits_new")
    private int visitsNew;

    @JsonProperty("nb_actions_new")
    private int actionsNew;

    @JsonProperty("nb_visits_converted_new")
    private int visitsConvertedNew;

    @JsonProperty("bounce_count_new")
    private int bounceCountNew;

    @JsonProperty("sum_visit_length_new")
    private int sumVisitLengthNew;

    @JsonProperty("max_actions_new")
    private int maxActionsNew;

    @JsonProperty("bounce_rate_new")
    private String bounceRateNew;

    @JsonProperty("nb_actions_per_visit_new")
    private double actionsPerVisitNew;

    @JsonProperty("avg_time_on_site_new")
    private int avgTimeOnSiteNew;

    @JsonProperty("nb_uniq_visitors_returning")
    private int uniqueVisitorsReturning;

    @JsonProperty("nb_users_returning")
    private int usersReturning;

    @JsonProperty("nb_visits_returning")
    private int visitsReturning;

    @JsonProperty("nb_actions_returning")
    private int actionsReturning;

    @JsonProperty("nb_visits_converted_returning")
    private int visitsConvertedReturning;

    @JsonProperty("bounce_count_returning")
    private int bounceCountReturning;

    @JsonProperty("sum_visit_length_returning")
    private int sumVisitLengthReturning;

    @JsonProperty("max_actions_returning")
    private int maxActionsReturning;

    @JsonProperty("bounce_rate_returning")
    private String bounceRateReturning;

    @JsonProperty("nb_actions_per_visit_returning")
    private double actionsPerVisitReturning;

    @JsonProperty("avg_time_on_site_returning")
    private int avgTimeOnSiteReturning;
}
