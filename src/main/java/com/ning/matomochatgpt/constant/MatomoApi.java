package com.ning.matomochatgpt.constant;

/**
 * ClassName: MatomoApi <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
public enum MatomoApi {
    API("API"),
    Actions("Actions"),
    Annotations("Annotations"),
    Contents("Contents"),
    CoreAdminHome("CoreAdminHome"),
    CustomDimensions("CustomDimensions"),
    CustomJsTracker("CustomJsTracker"),
    DBStats("DBStats"),
    Dashboard("Dashboard"),
    DevicePlugins("DevicePlugins"),
    DevicesDetection("DevicesDetection"),
    Events("Events"),
    Feedback("Feedback"),
    Goals("Goals"),
    IPtoCompany("IPtoCompany"),
    ImageGraph("ImageGraph"),
    Insights("Insights"),
    LanguagesManager("LanguagesManager"),
    Live("Live"),
    Login("Login"),
    Marketplace("Marketplace"),
    MobileMessaging("MobileMessaging"),
    MultiSites("MultiSites"),
    Overlay("Overlay"),
    PagePerformance("PagePerformance"),
    PrivacyManager("PrivacyManager"),
    Referrers("Referrers"),
    Resolution("Resolution"),
    SEO("SEO"),
    ScheduledReports("ScheduledReports"),
    SegmentEditor("SegmentEditor"),
    SitesManager("SitesManager"),
    TagManager("TagManager"),
    Tour("Tour"),
    Transitions("Transitions"),
    TwoFactorAuth("TwoFactorAuth"),
    UserCountry("UserCountry"),
    UserId("UserId"),
    UserLanguage("UserLanguage"),
    UsersManager("UsersManager"),
    VisitFrequency("VisitFrequency"),
    VisitTime("VisitTime"),
    VisitorInterest("VisitorInterest"),
    VisitsSummary("VisitsSummary");
    private String apiName;
    MatomoApi(String apiName){
        this.apiName = apiName;
    }
    public String getApiName(){
        return apiName;
    }
}
