package com.hawolt.virtual.clientconfig.impl;

import com.hawolt.generic.data.Platform;
import com.hawolt.virtual.clientconfig.ClientConfig;
import okhttp3.Request;

/**
 * Created: 18/08/2023 17:11
 * Author: Twitter @hawolt
 **/

public class PublicClientConfig extends ClientConfig {
    public PublicClientConfig(Platform platform) {
        super(platform);
    }

    @Override
    protected Request request() {
        return new Request.Builder()
                .url(getURL())
                .build();
    }

    @Override
    protected String getType() {
        return "public.json";
    }
}
