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

package com.vanniktech.emoji.googlecompat.category

import com.vanniktech.emoji.googlecompat.GoogleCompatEmoji
import de.cketti.codepoints.CodePoints

internal object ObjectsCategoryChunk2 {
  internal val EMOJIS: List<GoogleCompatEmoji> = listOf(
    GoogleCompatEmoji(CodePoints.toString(0x1F527), listOf("wrench")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA9B), listOf("screwdriver")),
    GoogleCompatEmoji(CodePoints.toString(0x1F529), listOf("nut_and_bolt")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2699),
      shortcodes = listOf("gear"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2699, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F5DC),
      shortcodes = listOf("compression"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F5DC, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2696),
      shortcodes = listOf("scales"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2696, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F9AF), listOf("probing_cane")),
    GoogleCompatEmoji(CodePoints.toString(0x1F517), listOf("link")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x26D3, 0x200D, 0x1F4A5),
      shortcodes = listOf("broken_chain"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x26D3, 0xFE0F, 0x200D, 0x1F4A5), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x26D3),
      shortcodes = listOf("chains"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x26D3, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1FA9D), listOf("hook")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9F0), listOf("toolbox")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9F2), listOf("magnet")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA9C), listOf("ladder")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2697),
      shortcodes = listOf("alembic"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2697, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F9EA), listOf("test_tube")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9EB), listOf("petri_dish")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9EC), listOf("dna")),
    GoogleCompatEmoji(CodePoints.toString(0x1F52C), listOf("microscope")),
    GoogleCompatEmoji(CodePoints.toString(0x1F52D), listOf("telescope")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4E1), listOf("satellite_antenna")),
    GoogleCompatEmoji(CodePoints.toString(0x1F489), listOf("syringe")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA78), listOf("drop_of_blood")),
    GoogleCompatEmoji(CodePoints.toString(0x1F48A), listOf("pill")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA79), listOf("adhesive_bandage")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA7C), listOf("crutch")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA7A), listOf("stethoscope")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA7B), listOf("x-ray")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6AA), listOf("door")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6D7), listOf("elevator")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA9E), listOf("mirror")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA9F), listOf("window")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F6CF),
      shortcodes = listOf("bed"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F6CF, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F6CB),
      shortcodes = listOf("couch_and_lamp"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F6CB, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1FA91), listOf("chair")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6BD), listOf("toilet")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAA0), listOf("plunger")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6BF), listOf("shower")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6C1), listOf("bathtub")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAA4), listOf("mouse_trap")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA92), listOf("razor")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9F4), listOf("lotion_bottle")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9F7), listOf("safety_pin")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9F9), listOf("broom")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9FA), listOf("basket")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9FB), listOf("roll_of_paper")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAA3), listOf("bucket")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9FC), listOf("soap")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAE7), listOf("bubbles")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAA5), listOf("toothbrush")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9FD), listOf("sponge")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9EF), listOf("fire_extinguisher")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6D2), listOf("shopping_trolley")),
    GoogleCompatEmoji(CodePoints.toString(0x1F6AC), listOf("smoking")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x26B0),
      shortcodes = listOf("coffin"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x26B0, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1FAA6), listOf("headstone")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x26B1),
      shortcodes = listOf("funeral_urn"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x26B1, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F9FF), listOf("nazar_amulet")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAAC), listOf("hamsa")),
    GoogleCompatEmoji(CodePoints.toString(0x1F5FF), listOf("moyai")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAA7), listOf("placard")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAAA), listOf("identification_card")),
  )
}
