package com.botdarr.slack;

public class SlackMessageItem {
  public String getType() {
    return type;
  }

  public String getEvent_ts() {
    return event_ts;
  }

  public String getTs() {
    return ts;
  }

  public String getChannel() {
    return channel;
  }

  private String type;
  private String event_ts;
  private String ts;
  private String channel;
}
