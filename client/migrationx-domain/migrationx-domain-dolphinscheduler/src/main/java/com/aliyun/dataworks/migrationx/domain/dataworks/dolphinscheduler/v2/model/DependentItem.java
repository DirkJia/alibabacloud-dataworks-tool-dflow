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

package com.aliyun.dataworks.migrationx.domain.dataworks.dolphinscheduler.v2.model;

import com.aliyun.dataworks.migrationx.domain.dataworks.dolphinscheduler.v2.enums.DependResult;
import com.aliyun.dataworks.migrationx.domain.dataworks.dolphinscheduler.v2.enums.ExecutionStatus;

/**
 * dependent item
 */
public class DependentItem {
    private long projectCode;
    private long definitionCode;
    private long depTaskCode;
    private String cycle;
    private String dateValue;
    private DependResult dependResult;
    private ExecutionStatus status;

    public String getKey() {
        return String.format("%d-%d-%s-%s",
                getDefinitionCode(),
                getDepTaskCode(),
                getCycle(),
                getDateValue());
    }

    public long getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(long projectCode) {
        this.projectCode = projectCode;
    }

    public long getDefinitionCode() {
        return definitionCode;
    }

    public void setDefinitionCode(long definitionCode) {
        this.definitionCode = definitionCode;
    }

    public long getDepTaskCode() {
        return depTaskCode;
    }

    public void setDepTaskCode(long depTaskCode) {
        this.depTaskCode = depTaskCode;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public DependResult getDependResult() {
        return dependResult;
    }

    public void setDependResult(DependResult dependResult) {
        this.dependResult = dependResult;
    }

    public ExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(ExecutionStatus status) {
        this.status = status;
    }
}
