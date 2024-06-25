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

package com.vanniktech.emoji.ios.category

import com.vanniktech.emoji.ios.IosEmoji
import de.cketti.codepoints.CodePoints

internal object ObjectsCategoryChunk2 {
  internal val EMOJIS: List<IosEmoji> = listOf(
    IosEmoji(CodePoints.toString(0x1F527), listOf("wrench"), 30, 31),
    IosEmoji(CodePoints.toString(0x1FA9B), listOf("screwdriver"), 55, 21),
    IosEmoji(CodePoints.toString(0x1F529), listOf("nut_and_bolt"), 30, 33),
    IosEmoji(
      unicode = CodePoints.toString(0x2699),
      shortcodes = listOf("gear"),
      x = 59,
      y = 1,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2699, 0xFE0F), emptyList(), 59, 1),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5DC),
      shortcodes = listOf("compression"),
      x = 32,
      y = 32,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5DC, 0xFE0F), emptyList(), 32, 32),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x2696),
      shortcodes = listOf("scales"),
      x = 58,
      y = 61,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2696, 0xFE0F), emptyList(), 58, 61),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F9AF), listOf("probing_cane"), 45, 38),
    IosEmoji(CodePoints.toString(0x1F517), listOf("link"), 30, 15),
    IosEmoji(
      unicode = CodePoints.toString(0x26D3, 0x200D, 0x1F4A5),
      shortcodes = listOf("broken_chain"),
      x = 59,
      y = 19,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x26D3, 0xFE0F, 0x200D, 0x1F4A5), emptyList(), 59, 19),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x26D3),
      shortcodes = listOf("chains"),
      x = 59,
      y = 20,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x26D3, 0xFE0F), emptyList(), 59, 20),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1FA9D), listOf("hook"), 55, 23),
    IosEmoji(CodePoints.toString(0x1F9F0), listOf("toolbox"), 54, 34),
    IosEmoji(CodePoints.toString(0x1F9F2), listOf("magnet"), 54, 36),
    IosEmoji(CodePoints.toString(0x1FA9C), listOf("ladder"), 55, 22),
    IosEmoji(
      unicode = CodePoints.toString(0x2697),
      shortcodes = listOf("alembic"),
      x = 59,
      y = 0,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2697, 0xFE0F), emptyList(), 59, 0),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F9EA), listOf("test_tube"), 54, 28),
    IosEmoji(CodePoints.toString(0x1F9EB), listOf("petri_dish"), 54, 29),
    IosEmoji(CodePoints.toString(0x1F9EC), listOf("dna"), 54, 30),
    IosEmoji(CodePoints.toString(0x1F52C), listOf("microscope"), 30, 36),
    IosEmoji(CodePoints.toString(0x1F52D), listOf("telescope"), 30, 37),
    IosEmoji(CodePoints.toString(0x1F4E1), listOf("satellite_antenna"), 29, 24),
    IosEmoji(CodePoints.toString(0x1F489), listOf("syringe"), 27, 5),
    IosEmoji(CodePoints.toString(0x1FA78), listOf("drop_of_blood"), 54, 58),
    IosEmoji(CodePoints.toString(0x1F48A), listOf("pill"), 27, 6),
    IosEmoji(CodePoints.toString(0x1FA79), listOf("adhesive_bandage"), 54, 59),
    IosEmoji(CodePoints.toString(0x1FA7C), listOf("crutch"), 55, 0),
    IosEmoji(CodePoints.toString(0x1FA7A), listOf("stethoscope"), 54, 60),
    IosEmoji(CodePoints.toString(0x1FA7B), listOf("x-ray"), 54, 61),
    IosEmoji(CodePoints.toString(0x1F6AA), listOf("door"), 36, 54),
    IosEmoji(CodePoints.toString(0x1F6D7), listOf("elevator"), 38, 47),
    IosEmoji(CodePoints.toString(0x1FA9E), listOf("mirror"), 55, 24),
    IosEmoji(CodePoints.toString(0x1FA9F), listOf("window"), 55, 25),
    IosEmoji(
      unicode = CodePoints.toString(0x1F6CF),
      shortcodes = listOf("bed"),
      x = 38,
      y = 41,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F6CF, 0xFE0F), emptyList(), 38, 41),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F6CB),
      shortcodes = listOf("couch_and_lamp"),
      x = 38,
      y = 32,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F6CB, 0xFE0F), emptyList(), 38, 32),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1FA91), listOf("chair"), 55, 11),
    IosEmoji(CodePoints.toString(0x1F6BD), listOf("toilet"), 38, 18),
    IosEmoji(CodePoints.toString(0x1FAA0), listOf("plunger"), 55, 26),
    IosEmoji(CodePoints.toString(0x1F6BF), listOf("shower"), 38, 20),
    IosEmoji(CodePoints.toString(0x1F6C1), listOf("bathtub"), 38, 27),
    IosEmoji(CodePoints.toString(0x1FAA4), listOf("mouse_trap"), 55, 30),
    IosEmoji(CodePoints.toString(0x1FA92), listOf("razor"), 55, 12),
    IosEmoji(CodePoints.toString(0x1F9F4), listOf("lotion_bottle"), 54, 38),
    IosEmoji(CodePoints.toString(0x1F9F7), listOf("safety_pin"), 54, 41),
    IosEmoji(CodePoints.toString(0x1F9F9), listOf("broom"), 54, 43),
    IosEmoji(CodePoints.toString(0x1F9FA), listOf("basket"), 54, 44),
    IosEmoji(CodePoints.toString(0x1F9FB), listOf("roll_of_paper"), 54, 45),
    IosEmoji(CodePoints.toString(0x1FAA3), listOf("bucket"), 55, 29),
    IosEmoji(CodePoints.toString(0x1F9FC), listOf("soap"), 54, 46),
    IosEmoji(CodePoints.toString(0x1FAE7), listOf("bubbles"), 56, 37),
    IosEmoji(CodePoints.toString(0x1FAA5), listOf("toothbrush"), 55, 31),
    IosEmoji(CodePoints.toString(0x1F9FD), listOf("sponge"), 54, 47),
    IosEmoji(CodePoints.toString(0x1F9EF), listOf("fire_extinguisher"), 54, 33),
    IosEmoji(CodePoints.toString(0x1F6D2), listOf("shopping_trolley"), 38, 44),
    IosEmoji(CodePoints.toString(0x1F6AC), listOf("smoking"), 36, 56),
    IosEmoji(
      unicode = CodePoints.toString(0x26B0),
      shortcodes = listOf("coffin"),
      x = 59,
      y = 9,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x26B0, 0xFE0F), emptyList(), 59, 9),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1FAA6), listOf("headstone"), 55, 32),
    IosEmoji(
      unicode = CodePoints.toString(0x26B1),
      shortcodes = listOf("funeral_urn"),
      x = 59,
      y = 10,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x26B1, 0xFE0F), emptyList(), 59, 10),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F9FF), listOf("nazar_amulet"), 54, 49),
    IosEmoji(CodePoints.toString(0x1FAAC), listOf("hamsa"), 55, 38),
    IosEmoji(CodePoints.toString(0x1F5FF), listOf("moyai"), 32, 45),
    IosEmoji(CodePoints.toString(0x1FAA7), listOf("placard"), 55, 33),
    IosEmoji(CodePoints.toString(0x1FAAA), listOf("identification_card"), 55, 36),
  )
}
