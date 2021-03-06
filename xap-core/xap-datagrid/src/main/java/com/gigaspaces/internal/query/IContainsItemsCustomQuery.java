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

package com.gigaspaces.internal.query;

import com.gigaspaces.server.ServerEntry;

/**
 * Represents a custom query related to  a collection item in the space.
 *
 * @author Yechiel Fefer
 * @since 9.6
 */

public interface IContainsItemsCustomQuery extends ICustomQuery {

    public boolean matches(ServerEntry entry, Object collectionItem);

    public boolean isRootHandler();
}
