/*
 * Copyright (c) 2024, Alibaba Cloud;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyun.dataworks.migrationx.domain.dataworks.objects.entity.nodemarket;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author 聿剑
 * @date 2024/6/17
 */
@Data
@ToString
@EqualsAndHashCode
public class PluginInfo {
    private String pluginName;
    private Integer paramConfigType;
    private String execPath;
    private String engineName;
    private String dataSourceType;
    private String alisaAdapter;
    private Integer supportDebug;
    private String debugPluginName;
    private String extend;
    private Integer pluginType = 0;
}