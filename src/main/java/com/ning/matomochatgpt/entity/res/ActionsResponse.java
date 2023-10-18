package com.ning.matomochatgpt.entity.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Data;

/**
 * ClassName: ActionsResponse <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Data
public class ActionsResponse extends MatomoResponse {
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
}
