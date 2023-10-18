package com.ning.matomochatgpt.entity;

import lombok.Builder;
import lombok.Data;

/**
 * ClassName: MatomoRequestParam <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Builder
@Data
public class MatomoRequestParam {
    private String idSite;
    private String period;
    private String date;
    private String segment;
    private Integer filterLimit;
    private String method;
    private String module;
    private String format;
}
