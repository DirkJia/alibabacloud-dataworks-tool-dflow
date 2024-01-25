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

package com.aliyun.dataworks.common.spec.domain.ref;

import com.aliyun.dataworks.common.spec.domain.SpecRefEntity;
import com.aliyun.dataworks.common.spec.domain.noref.SpecDepend;
import com.aliyun.dataworks.common.spec.domain.ref.calcengine.SpecCalcEngine;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DqcRule
 *
 * @author 聿剑
 * @date 2023/12/9
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SpecDqcRule extends SpecRefEntity {
    private String name;
    private SpecTable table;
    private SpecCalcEngine calcEngine;
    private String partitionExpression;
    private SpecDepend schedulerNode;
    private String ruleConfig;
    private String description;
}