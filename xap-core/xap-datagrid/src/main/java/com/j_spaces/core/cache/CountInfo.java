/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.j_spaces.core.cache;

/**
 * Hold the count info when count is called
 *
 * @author guy
 * @since 6.6
 */
@com.gigaspaces.api.InternalApi
public class CountInfo {
    private int _saCount;
    private int _addedToPersistCount; //relevant for persistent only, how many entries to add
    private int _subFromPersistCount; //relevant for persistent only, how many entries to subtract

    public int getSaCount() {
        return _saCount;
    }

    public int getAddedToPersistCount() {
        return _addedToPersistCount;
    }

    public int getSubFromPersistCount() {
        return _subFromPersistCount;
    }

    public void incSaCount() {
        ++_saCount;
    }

    public void incAddedToPersistCount() {
        ++_addedToPersistCount;
    }

    public void incSubFromPersistCount() {
        ++_subFromPersistCount;
    }
}
