package com.smartsheet.api.models;


/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * %[license]
 */

import java.util.ArrayList;
import java.util.List;

public class Favorite{

    /**
     * Represents type of favorite (workspace, folder, sheet, report, template).
     */
    private String type;

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    private Long objectId;

    /**
     * Gets the type of favorite (workspace, folder, sheet, report, template).
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of favorite (workspace, folder, sheet, report, template).
     *
     * @param type the new dependencies enabled
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * A convenience class for making a {@link GroupMember} object with the appropriate fields for adding to a {@link Group}.
     */
    public static class AddFavoriteBuilder {

        List<Favorite> favorites = new ArrayList<Favorite>();

        public AddFavoriteBuilder addFavorite(long objectId, String type) {
            Favorite favorite = new Favorite();
            favorite.setObjectId(objectId);
            favorite.setType(type);
            favorites.add(favorite);
            return this;
        }

        public List<Favorite> build() { return favorites; }
        }
    }

