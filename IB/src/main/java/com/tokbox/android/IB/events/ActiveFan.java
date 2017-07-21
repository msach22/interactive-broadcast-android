package com.tokbox.android.IB.events;

public class ActiveFan {
    private String id;
    private String snapshot;
    private String name;
    private String os = "Android";
    private String streamId;
    private boolean mobile = true;
    private boolean isBackstage = false;
    private boolean inPrivateCall = false;

    public ActiveFan() {}

    public ActiveFan(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public boolean isInPrivateCall() {
        return inPrivateCall;
    }

    public void setInPrivateCall(boolean inPrivateCall) {
        this.inPrivateCall = inPrivateCall;
    }

    public void setIsBackstage(boolean isBackstage) {
        this.isBackstage = isBackstage;
    }

    public boolean isBackstage() {
        return isBackstage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDefaults() {
        this.snapshot = null;
        this.name = null;
        this.streamId = null;
        this.isBackstage = false;
        this.inPrivateCall = false;
    }
}
