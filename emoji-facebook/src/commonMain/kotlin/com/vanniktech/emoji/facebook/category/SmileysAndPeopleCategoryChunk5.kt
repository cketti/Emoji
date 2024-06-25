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

package com.vanniktech.emoji.facebook.category

import com.vanniktech.emoji.facebook.FacebookEmoji
import de.cketti.codepoints.CodePoints

internal object SmileysAndPeopleCategoryChunk5 {
  internal val EMOJIS: List<FacebookEmoji> = listOf(
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F467), listOf("woman-woman-girl"), 18, 35),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F466), listOf("woman-woman-girl-boy"), 18, 36),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F466, 0x200D, 0x1F466), listOf("woman-woman-boy-boy"), 18, 34),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F467), listOf("woman-woman-girl-girl"), 18, 37),
    FacebookEmoji(CodePoints.toString(0x1F468, 0x200D, 0x1F466), listOf("man-boy"), 14, 42),
    FacebookEmoji(CodePoints.toString(0x1F468, 0x200D, 0x1F466, 0x200D, 0x1F466), listOf("man-boy-boy"), 14, 41),
    FacebookEmoji(CodePoints.toString(0x1F468, 0x200D, 0x1F467), listOf("man-girl"), 14, 45),
    FacebookEmoji(CodePoints.toString(0x1F468, 0x200D, 0x1F467, 0x200D, 0x1F466), listOf("man-girl-boy"), 14, 43),
    FacebookEmoji(CodePoints.toString(0x1F468, 0x200D, 0x1F467, 0x200D, 0x1F467), listOf("man-girl-girl"), 14, 44),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F466), listOf("woman-boy"), 18, 29),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F466, 0x200D, 0x1F466), listOf("woman-boy-boy"), 18, 28),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F467), listOf("woman-girl"), 18, 32),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F466), listOf("woman-girl-boy"), 18, 30),
    FacebookEmoji(CodePoints.toString(0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F467), listOf("woman-girl-girl"), 18, 31),
    FacebookEmoji(
      unicode = CodePoints.toString(0x1F5E3),
      shortcodes = listOf("speaking_head_in_silhouette"),
      x = 32,
      y = 36,
      variants = listOf(
        FacebookEmoji(CodePoints.toString(0x1F5E3, 0xFE0F), emptyList(), 32, 36),
      ),
    ),
    FacebookEmoji(CodePoints.toString(0x1F464), listOf("bust_in_silhouette"), 13, 41),
    FacebookEmoji(CodePoints.toString(0x1F465), listOf("busts_in_silhouette"), 13, 42),
    FacebookEmoji(CodePoints.toString(0x1FAC2), listOf("people_hugging"), 55, 59),
    FacebookEmoji(CodePoints.toString(0x1F46A), listOf("family"), 22, 14),
    FacebookEmoji(CodePoints.toString(0x1F463), listOf("footprints"), 13, 40),
  )
}
