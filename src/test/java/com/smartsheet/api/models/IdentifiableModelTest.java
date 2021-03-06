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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifiableModelTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testHashCode() {
        Row row = new Row();
        // Same Object
        assertEquals(row,row);
        row.setId(1234L);
        Row row1 = new Row();
        row1.setId(1234L);
        row.equals(row);
        // Same id in two different objects
        assertEquals(row,row1);

        // Different Objects
        assertNotEquals(row,new Object());
    }

    @Test
    public void testEqualsObject() {
        Row row = new Row();
        assertNotNull(row.hashCode());
    }

}
