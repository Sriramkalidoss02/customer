package com.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "account")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "process_name")
    private String processName;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "threat_id")
    private String threatId;

    @Column(name = "sha_256")
    private String sha256;

    @Column(name = "start_timestamp")
    private OffsetDateTime startTimestamp;

    @Column(name = "end_timestamp")
    private OffsetDateTime endTimestamp;

    public Customer() {
    }

    public Customer(String customerId, String deviceId, String deviceName, String userName, String processName, String eventType, String threatId, String sha256, OffsetDateTime startTimestamp, OffsetDateTime endTimestamp) {
        this.customerId = customerId;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.userName = userName;
        this.processName = processName;
        this.eventType = eventType;
        this.threatId = threatId;
        this.sha256 = sha256;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getThreatId() {
        return threatId;
    }

    public void setThreatId(String threatId) {
        this.threatId = threatId;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public OffsetDateTime getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(OffsetDateTime startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public OffsetDateTime getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(OffsetDateTime endTimestamp) {
        this.endTimestamp = endTimestamp;
    }
}
