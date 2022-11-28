package com.hamitmizrak.business.services.impl;

import com.google.gson.JsonElement;
import com.hamitmizrak.business.services.IBlogService;
import com.hamitmizrak.retrofit.RetrofitCommonGenerics;
import com.hamitmizrak.retrofit.request.IBlogServiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Log4j2

@Service
public class BlogService implements IBlogService {
    private final IBlogServiceRequest iBlogServiceRequest;

    @Override
    public JsonElement blogSave(JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogSave(jsonElement));
    }

    @Override
    public List<JsonElement> blogList() {
        return  RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogList());
    }

    @Override
    public JsonElement blogFind(Long id) {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogFind(id));
    }

    @Override
    public void blogDelete(Long id) {
        RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogDelete(id));
    }

    @Override
    public JsonElement blogUpdate(Long id, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogUpdate(id,jsonElement));
    }
}
