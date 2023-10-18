package com.ning.matomochatgpt.entity.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Data;

/**
 * ClassName: VisitsSummaryResponse <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Data
public class VisitsSummaryResponse extends MatomoResponse {
    /**
     * 独立访客数量 网站针对访问者只会记录一次得到的数据
     */
    @JsonProperty("nb_uniq_visitors")
    private Integer nbUniqVisitors;
    /**
     * 用户数量 唯一活跃用户数（具有已知用户 ID 的访问者）。如果您不使用用户 ID，则该指标将设置为零。
     */
    @JsonProperty("nb_users")
    private Integer nbUsers;
    /**
     * 访客数量 网站针对访问者进行多次记录得到的
     */
    @JsonProperty("nb_visits")
    private Integer nbVisits;
    /**
     * 操作次数 操作次数（页面浏览量、外链和下载）
     */
    @JsonProperty("nb_actions")
    private Integer nbActions;
    /**
     * 实现目标转化的访问次数
     */
    @JsonProperty("nb_visits_converted")
    private Integer nbVisitsConverted;
    /**
     * 退回的访问次数（仅查看一页）
     */
    @JsonProperty("bounce_count")
    private Integer bounceCount;
    /**
     * 访问总时长 以秒为单位
     */
    @JsonProperty("sum_visit_length")
    private Integer sumVisitLength;
    /**
     * 一次访问的最大操作数
     */
    @JsonProperty("max_actions")
    private Integer maxActions;
    /**
     * 登陆此页面后离开网站的访问率
     */
    @JsonProperty("bounce_rate")
    private String bounceRate;
    /**
     * 访问期间执行的平均操作数（页面浏览、网站搜索、下载或外链）
     */
    @JsonProperty("nb_actions_per_visit")
    private Double nbActionsPerVisit;
    /**
     * 平均访问持续时间
     */
    @JsonProperty("avg_time_on_site")
    private Integer avgTimeOnSite;
}
