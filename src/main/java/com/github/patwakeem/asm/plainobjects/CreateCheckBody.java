package com.github.patwakeem.asm.plainobjects;


import com.google.gson.JsonObject;

import java.util.List;

public interface CreateCheckBody {
    void setName(String n);

    void setTarget(String t);

    void setMaxAttempts(Integer i);

    void setIntervalSeconds(Integer i);

    void setLocationCode(String s);

    void setPort(Integer i);

    void setMonitorGroupsIds(List<Integer> monitorGroupsIds);

    void sanitizeHost();

    JsonObject getJson();
}