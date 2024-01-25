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
package com.aliyun.dataworks.migrationx.domain.dataworks.dolphinscheduler.v139.datasource;

import com.aliyun.dataworks.migrationx.domain.dataworks.dolphinscheduler.DbType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * data source of SQL Server
 */
public class SQLServerDataSource extends BaseDataSource {

    private static final Logger logger = LoggerFactory.getLogger(SQLServerDataSource.class);

    /**
     * gets the JDBC url for the data source connection
     *
     * @return jdbc url
     */
    @Override
    public String getJdbcUrl() {
        String jdbcUrl = getAddress();
        jdbcUrl += ";databaseName=" + getDatabase();

        if (StringUtils.isNotEmpty(getOther())) {
            jdbcUrl += ";" + getOther();
        }

        return jdbcUrl;
    }

    /**
     * @return driver class
     */
    @Override
    public String driverClassSelector() {
        return Constants.COM_SQLSERVER_JDBC_DRIVER;
    }

    /**
     * @return db type
     */
    @Override
    public DbType dbTypeSelector() {
        return DbType.SQLSERVER;
    }
}