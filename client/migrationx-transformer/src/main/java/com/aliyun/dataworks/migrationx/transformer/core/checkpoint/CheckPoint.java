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

package com.aliyun.dataworks.migrationx.transformer.core.checkpoint;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.aliyun.dataworks.migrationx.domain.dataworks.objects.entity.DwWorkflow;
import com.aliyun.dataworks.migrationx.transformer.core.checkpoint.file.LocalFileCheckPoint;

public interface CheckPoint<WRITER extends StoreWriter> {
    ThreadLocal<CheckPoint> INSTANCE = ThreadLocal.withInitial(() -> new LocalFileCheckPoint());

    List<DwWorkflow> doWithCheckpoint(Function<WRITER, List<DwWorkflow>> func, String projectName);

    void doCheckpoint(WRITER writer, List<DwWorkflow> workflows, String processName, String taskName);

    Map<String, List<DwWorkflow>> loadFromCheckPoint(String projectName, String processName);

    static CheckPoint getInstance() {
        return INSTANCE.get();
    }
}