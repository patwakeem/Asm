package asm.plainobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class UrlResult {

    @SerializedName("step")
    @Expose
    private Integer step;
    @SerializedName("url_number")
    @Expose
    private Integer urlNumber;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("offset_ms")
    @Expose
    private Integer offsetMs;
    @SerializedName("started_utc")
    @Expose
    private String startedUtc;
    @SerializedName("elapsed_ms")
    @Expose
    private Integer elapsedMs;
    @SerializedName("received_bytes")
    @Expose
    private Integer receivedBytes;
    @SerializedName("sent_bytes")
    @Expose
    private Integer sentBytes;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;
    @SerializedName("error_message")
    @Expose
    private Object errorMessage;
    @SerializedName("complete")
    @Expose
    private Boolean complete;
    @SerializedName("redirect")
    @Expose
    private Boolean redirect;
    @SerializedName("redirect_url")
    @Expose
    private Object redirectUrl;
    @SerializedName("http_method")
    @Expose
    private String httpMethod;
    @SerializedName("http_result")
    @Expose
    private String httpResult;
    @SerializedName("http_status_code")
    @Expose
    private Integer httpStatusCode;
    @SerializedName("content_from_cache")
    @Expose
    private Boolean contentFromCache;
    @SerializedName("content_mime_type")
    @Expose
    private String contentMimeType;
    @SerializedName("content_size_bytes")
    @Expose
    private Integer contentSizeBytes;
    @SerializedName("request_cookie_count")
    @Expose
    private Integer requestCookieCount;
    @SerializedName("request_header_count")
    @Expose
    private Integer requestHeaderCount;
    @SerializedName("response_cookie_count")
    @Expose
    private Integer responseCookieCount;
    @SerializedName("response_header_count")
    @Expose
    private Integer responseHeaderCount;
    @SerializedName("response_status_line")
    @Expose
    private String responseStatusLine;
    @SerializedName("blocked_duration_ms")
    @Expose
    private Integer blockedDurationMs;
    @SerializedName("blocked_url_offset_ms")
    @Expose
    private Integer blockedUrlOffsetMs;
    @SerializedName("dns_lookup_duration_ms")
    @Expose
    private Integer dnsLookupDurationMs;
    @SerializedName("dns_lookup_url_offset_ms")
    @Expose
    private Integer dnsLookupUrlOffsetMs;
    @SerializedName("connect_duration_ms")
    @Expose
    private Integer connectDurationMs;
    @SerializedName("connect_url_offset_ms")
    @Expose
    private Integer connectUrlOffsetMs;
    @SerializedName("receive_duration_ms")
    @Expose
    private Integer receiveDurationMs;
    @SerializedName("receive_url_offset_ms")
    @Expose
    private Integer receiveUrlOffsetMs;
    @SerializedName("send_duration_ms")
    @Expose
    private Integer sendDurationMs;
    @SerializedName("send_url_offset_ms")
    @Expose
    private Integer sendUrlOffsetMs;
    @SerializedName("ttfb_duration_ms")
    @Expose
    private Integer ttfbDurationMs;
    @SerializedName("ttfb_url_offset_ms")
    @Expose
    private Integer ttfbUrlOffsetMs;
    @SerializedName("wait_duration_ms")
    @Expose
    private Integer waitDurationMs;
    @SerializedName("wait_offset_ms")
    @Expose
    private Integer waitOffsetMs;
    @SerializedName("step_duration_ms")
    @Expose
    private Integer stepDurationMs;
    @SerializedName("response_time_ms")
    @Expose
    private Integer responseTimeMs;
    @SerializedName("started_utc_iso_8601")
    @Expose
    private String startedUtcIso8601;

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public UrlResult withStep(Integer step) {
        this.step = step;
        return this;
    }

    public Integer getUrlNumber() {
        return urlNumber;
    }

    public void setUrlNumber(Integer urlNumber) {
        this.urlNumber = urlNumber;
    }

    public UrlResult withUrlNumber(Integer urlNumber) {
        this.urlNumber = urlNumber;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlResult withUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getOffsetMs() {
        return offsetMs;
    }

    public void setOffsetMs(Integer offsetMs) {
        this.offsetMs = offsetMs;
    }

    public UrlResult withOffsetMs(Integer offsetMs) {
        this.offsetMs = offsetMs;
        return this;
    }

    public String getStartedUtc() {
        return startedUtc;
    }

    public void setStartedUtc(String startedUtc) {
        this.startedUtc = startedUtc;
    }

    public UrlResult withStartedUtc(String startedUtc) {
        this.startedUtc = startedUtc;
        return this;
    }

    public Integer getElapsedMs() {
        return elapsedMs;
    }

    public void setElapsedMs(Integer elapsedMs) {
        this.elapsedMs = elapsedMs;
    }

    public UrlResult withElapsedMs(Integer elapsedMs) {
        this.elapsedMs = elapsedMs;
        return this;
    }

    public Integer getReceivedBytes() {
        return receivedBytes;
    }

    public void setReceivedBytes(Integer receivedBytes) {
        this.receivedBytes = receivedBytes;
    }

    public UrlResult withReceivedBytes(Integer receivedBytes) {
        this.receivedBytes = receivedBytes;
        return this;
    }

    public Integer getSentBytes() {
        return sentBytes;
    }

    public void setSentBytes(Integer sentBytes) {
        this.sentBytes = sentBytes;
    }

    public UrlResult withSentBytes(Integer sentBytes) {
        this.sentBytes = sentBytes;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public UrlResult withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public UrlResult withErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public UrlResult withComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    public Boolean getRedirect() {
        return redirect;
    }

    public void setRedirect(Boolean redirect) {
        this.redirect = redirect;
    }

    public UrlResult withRedirect(Boolean redirect) {
        this.redirect = redirect;
        return this;
    }

    public Object getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(Object redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public UrlResult withRedirectUrl(Object redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public UrlResult withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    public String getHttpResult() {
        return httpResult;
    }

    public void setHttpResult(String httpResult) {
        this.httpResult = httpResult;
    }

    public UrlResult withHttpResult(String httpResult) {
        this.httpResult = httpResult;
        return this;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public UrlResult withHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    public Boolean getContentFromCache() {
        return contentFromCache;
    }

    public void setContentFromCache(Boolean contentFromCache) {
        this.contentFromCache = contentFromCache;
    }

    public UrlResult withContentFromCache(Boolean contentFromCache) {
        this.contentFromCache = contentFromCache;
        return this;
    }

    public String getContentMimeType() {
        return contentMimeType;
    }

    public void setContentMimeType(String contentMimeType) {
        this.contentMimeType = contentMimeType;
    }

    public UrlResult withContentMimeType(String contentMimeType) {
        this.contentMimeType = contentMimeType;
        return this;
    }

    public Integer getContentSizeBytes() {
        return contentSizeBytes;
    }

    public void setContentSizeBytes(Integer contentSizeBytes) {
        this.contentSizeBytes = contentSizeBytes;
    }

    public UrlResult withContentSizeBytes(Integer contentSizeBytes) {
        this.contentSizeBytes = contentSizeBytes;
        return this;
    }

    public Integer getRequestCookieCount() {
        return requestCookieCount;
    }

    public void setRequestCookieCount(Integer requestCookieCount) {
        this.requestCookieCount = requestCookieCount;
    }

    public UrlResult withRequestCookieCount(Integer requestCookieCount) {
        this.requestCookieCount = requestCookieCount;
        return this;
    }

    public Integer getRequestHeaderCount() {
        return requestHeaderCount;
    }

    public void setRequestHeaderCount(Integer requestHeaderCount) {
        this.requestHeaderCount = requestHeaderCount;
    }

    public UrlResult withRequestHeaderCount(Integer requestHeaderCount) {
        this.requestHeaderCount = requestHeaderCount;
        return this;
    }

    public Integer getResponseCookieCount() {
        return responseCookieCount;
    }

    public void setResponseCookieCount(Integer responseCookieCount) {
        this.responseCookieCount = responseCookieCount;
    }

    public UrlResult withResponseCookieCount(Integer responseCookieCount) {
        this.responseCookieCount = responseCookieCount;
        return this;
    }

    public Integer getResponseHeaderCount() {
        return responseHeaderCount;
    }

    public void setResponseHeaderCount(Integer responseHeaderCount) {
        this.responseHeaderCount = responseHeaderCount;
    }

    public UrlResult withResponseHeaderCount(Integer responseHeaderCount) {
        this.responseHeaderCount = responseHeaderCount;
        return this;
    }

    public String getResponseStatusLine() {
        return responseStatusLine;
    }

    public void setResponseStatusLine(String responseStatusLine) {
        this.responseStatusLine = responseStatusLine;
    }

    public UrlResult withResponseStatusLine(String responseStatusLine) {
        this.responseStatusLine = responseStatusLine;
        return this;
    }

    public Integer getBlockedDurationMs() {
        return blockedDurationMs;
    }

    public void setBlockedDurationMs(Integer blockedDurationMs) {
        this.blockedDurationMs = blockedDurationMs;
    }

    public UrlResult withBlockedDurationMs(Integer blockedDurationMs) {
        this.blockedDurationMs = blockedDurationMs;
        return this;
    }

    public Integer getBlockedUrlOffsetMs() {
        return blockedUrlOffsetMs;
    }

    public void setBlockedUrlOffsetMs(Integer blockedUrlOffsetMs) {
        this.blockedUrlOffsetMs = blockedUrlOffsetMs;
    }

    public UrlResult withBlockedUrlOffsetMs(Integer blockedUrlOffsetMs) {
        this.blockedUrlOffsetMs = blockedUrlOffsetMs;
        return this;
    }

    public Integer getDnsLookupDurationMs() {
        return dnsLookupDurationMs;
    }

    public void setDnsLookupDurationMs(Integer dnsLookupDurationMs) {
        this.dnsLookupDurationMs = dnsLookupDurationMs;
    }

    public UrlResult withDnsLookupDurationMs(Integer dnsLookupDurationMs) {
        this.dnsLookupDurationMs = dnsLookupDurationMs;
        return this;
    }

    public Integer getDnsLookupUrlOffsetMs() {
        return dnsLookupUrlOffsetMs;
    }

    public void setDnsLookupUrlOffsetMs(Integer dnsLookupUrlOffsetMs) {
        this.dnsLookupUrlOffsetMs = dnsLookupUrlOffsetMs;
    }

    public UrlResult withDnsLookupUrlOffsetMs(Integer dnsLookupUrlOffsetMs) {
        this.dnsLookupUrlOffsetMs = dnsLookupUrlOffsetMs;
        return this;
    }

    public Integer getConnectDurationMs() {
        return connectDurationMs;
    }

    public void setConnectDurationMs(Integer connectDurationMs) {
        this.connectDurationMs = connectDurationMs;
    }

    public UrlResult withConnectDurationMs(Integer connectDurationMs) {
        this.connectDurationMs = connectDurationMs;
        return this;
    }

    public Integer getConnectUrlOffsetMs() {
        return connectUrlOffsetMs;
    }

    public void setConnectUrlOffsetMs(Integer connectUrlOffsetMs) {
        this.connectUrlOffsetMs = connectUrlOffsetMs;
    }

    public UrlResult withConnectUrlOffsetMs(Integer connectUrlOffsetMs) {
        this.connectUrlOffsetMs = connectUrlOffsetMs;
        return this;
    }

    public Integer getReceiveDurationMs() {
        return receiveDurationMs;
    }

    public void setReceiveDurationMs(Integer receiveDurationMs) {
        this.receiveDurationMs = receiveDurationMs;
    }

    public UrlResult withReceiveDurationMs(Integer receiveDurationMs) {
        this.receiveDurationMs = receiveDurationMs;
        return this;
    }

    public Integer getReceiveUrlOffsetMs() {
        return receiveUrlOffsetMs;
    }

    public void setReceiveUrlOffsetMs(Integer receiveUrlOffsetMs) {
        this.receiveUrlOffsetMs = receiveUrlOffsetMs;
    }

    public UrlResult withReceiveUrlOffsetMs(Integer receiveUrlOffsetMs) {
        this.receiveUrlOffsetMs = receiveUrlOffsetMs;
        return this;
    }

    public Integer getSendDurationMs() {
        return sendDurationMs;
    }

    public void setSendDurationMs(Integer sendDurationMs) {
        this.sendDurationMs = sendDurationMs;
    }

    public UrlResult withSendDurationMs(Integer sendDurationMs) {
        this.sendDurationMs = sendDurationMs;
        return this;
    }

    public Integer getSendUrlOffsetMs() {
        return sendUrlOffsetMs;
    }

    public void setSendUrlOffsetMs(Integer sendUrlOffsetMs) {
        this.sendUrlOffsetMs = sendUrlOffsetMs;
    }

    public UrlResult withSendUrlOffsetMs(Integer sendUrlOffsetMs) {
        this.sendUrlOffsetMs = sendUrlOffsetMs;
        return this;
    }

    public Integer getTtfbDurationMs() {
        return ttfbDurationMs;
    }

    public void setTtfbDurationMs(Integer ttfbDurationMs) {
        this.ttfbDurationMs = ttfbDurationMs;
    }

    public UrlResult withTtfbDurationMs(Integer ttfbDurationMs) {
        this.ttfbDurationMs = ttfbDurationMs;
        return this;
    }

    public Integer getTtfbUrlOffsetMs() {
        return ttfbUrlOffsetMs;
    }

    public void setTtfbUrlOffsetMs(Integer ttfbUrlOffsetMs) {
        this.ttfbUrlOffsetMs = ttfbUrlOffsetMs;
    }

    public UrlResult withTtfbUrlOffsetMs(Integer ttfbUrlOffsetMs) {
        this.ttfbUrlOffsetMs = ttfbUrlOffsetMs;
        return this;
    }

    public Integer getWaitDurationMs() {
        return waitDurationMs;
    }

    public void setWaitDurationMs(Integer waitDurationMs) {
        this.waitDurationMs = waitDurationMs;
    }

    public UrlResult withWaitDurationMs(Integer waitDurationMs) {
        this.waitDurationMs = waitDurationMs;
        return this;
    }

    public Integer getWaitOffsetMs() {
        return waitOffsetMs;
    }

    public void setWaitOffsetMs(Integer waitOffsetMs) {
        this.waitOffsetMs = waitOffsetMs;
    }

    public UrlResult withWaitOffsetMs(Integer waitOffsetMs) {
        this.waitOffsetMs = waitOffsetMs;
        return this;
    }

    public Integer getStepDurationMs() {
        return stepDurationMs;
    }

    public void setStepDurationMs(Integer stepDurationMs) {
        this.stepDurationMs = stepDurationMs;
    }

    public UrlResult withStepDurationMs(Integer stepDurationMs) {
        this.stepDurationMs = stepDurationMs;
        return this;
    }

    public Integer getResponseTimeMs() {
        return responseTimeMs;
    }

    public void setResponseTimeMs(Integer responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
    }

    public UrlResult withResponseTimeMs(Integer responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
        return this;
    }

    public String getStartedUtcIso8601() {
        return startedUtcIso8601;
    }

    public void setStartedUtcIso8601(String startedUtcIso8601) {
        this.startedUtcIso8601 = startedUtcIso8601;
    }

    public UrlResult withStartedUtcIso8601(String startedUtcIso8601) {
        this.startedUtcIso8601 = startedUtcIso8601;
        return this;
    }
}