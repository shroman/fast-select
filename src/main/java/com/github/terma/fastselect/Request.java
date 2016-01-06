/*
Copyright 2015 Artem Stasiuk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.github.terma.fastselect;

import java.util.Arrays;

public class Request {

    public final String name;
    public final int[] values;

    public FastSelect.Column column;
    public byte[] plainValues;

    public Request(String name, int[] values) {
        this.name = name;
        this.values = values;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", values: " + Arrays.toString(values) + '}';
    }

}