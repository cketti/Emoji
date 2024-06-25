/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vanniktech.emoji.androidxemoji2.category

import com.vanniktech.emoji.androidxemoji2.AndroidxEmoji2
import de.cketti.codepoints.CodePoints

internal object TravelAndPlacesCategoryChunk2 {
  internal val EMOJIS: List<AndroidxEmoji2> = listOf(
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x1F329),
      shortcodes = listOf("lightning", "lightning_cloud"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x1F329, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x1F32A),
      shortcodes = listOf("tornado", "tornado_cloud"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x1F32A, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x1F32B),
      shortcodes = listOf("fog"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x1F32B, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x1F32C),
      shortcodes = listOf("wind_blowing_face"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x1F32C, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x1F300), listOf("cyclone")),
    AndroidxEmoji2(CodePoints.toString(0x1F308), listOf("rainbow")),
    AndroidxEmoji2(CodePoints.toString(0x1F302), listOf("closed_umbrella")),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x2602),
      shortcodes = listOf("umbrella"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x2602, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x2614), listOf("umbrella_with_rain_drops")),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x26F1),
      shortcodes = listOf("umbrella_on_ground"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x26F1, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x26A1), listOf("zap")),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x2744),
      shortcodes = listOf("snowflake"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x2744, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x2603),
      shortcodes = listOf("snowman"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x2603, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x26C4), listOf("snowman_without_snow")),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x2604),
      shortcodes = listOf("comet"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x2604, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x1F525), listOf("fire")),
    AndroidxEmoji2(CodePoints.toString(0x1F4A7), listOf("droplet")),
    AndroidxEmoji2(CodePoints.toString(0x1F30A), listOf("ocean")),
  )
}
