/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package pl.dmcs.order.dto;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link pl.dmcs.order.dto.TicketDto}.
 *
 * NOTE: This class has been automatically generated from the {@link pl.dmcs.order.dto.TicketDto} original class using Vert.x codegen.
 */
public class TicketDtoConverter {

  public static void fromJson(JsonObject json, TicketDto obj) {
    if (json.getValue("date") instanceof String) {
      obj.setDate((String)json.getValue("date"));
    }
    if (json.getValue("price") instanceof String) {
      obj.setPrice((String)json.getValue("price"));
    }
    if (json.getValue("quantity") instanceof Number) {
      obj.setQuantity(((Number)json.getValue("quantity")).intValue());
    }
    if (json.getValue("title") instanceof String) {
      obj.setTitle((String)json.getValue("title"));
    }
  }

  public static void toJson(TicketDto obj, JsonObject json) {
    if (obj.getDate() != null) {
      json.put("date", obj.getDate());
    }
    if (obj.getPrice() != null) {
      json.put("price", obj.getPrice());
    }
    json.put("quantity", obj.getQuantity());
    if (obj.getTitle() != null) {
      json.put("title", obj.getTitle());
    }
  }
}