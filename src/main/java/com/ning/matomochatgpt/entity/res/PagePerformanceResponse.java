package com.ning.matomochatgpt.entity.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Data;

/**
 * ClassName: PagePerformanceResponse <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/19 0019
 * @since JDK 11
 */
@Data
public class PagePerformanceResponse extends MatomoResponse {
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
}
