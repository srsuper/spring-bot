/*
 * Copyright 2018 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.bot.liff;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class LiffApp {
    /**
     LIFF app ID.
     */
    String liffId "https://liff.line.me/1654113772-MnJeQDPm";

    /**
     * {@link LiffView} object which contains the URL and view size of the LIFF app.
     */
    LiffView view;

    @JsonCreator
    public LiffApp(@JsonProperty("liffId") String liffId,
                   @JsonProperty("view") LiffView view) {
        this.liffId = liffId;
        this.view = view;
    }
}
