/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.exception;

import org.wso2.carbon.privacy.forgetme.api.runtime.ModuleException;

/**
 * Represents an generic exception occurred in the SQL module.
 */
public class SQLModuleException extends ModuleException {

    public SQLModuleException(String message) {
        super(message);
    }

    public SQLModuleException(Throwable throwable) {
        super(throwable);
    }

    public SQLModuleException(String message, Throwable throwable) {
        super(message, throwable);
    }
}