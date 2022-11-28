package com.hamitmizrak.business.services;

import com.google.gson.JsonElement;

import java.util.List;

public interface IBlogService {
    JsonElement blogSave(JsonElement jsonElement);
    List<JsonElement> blogList();
    JsonElement blogFind(Long id);
    void blogDelete(Long id);
    JsonElement blogUpdate(Long id,JsonElement jsonElement);
}
