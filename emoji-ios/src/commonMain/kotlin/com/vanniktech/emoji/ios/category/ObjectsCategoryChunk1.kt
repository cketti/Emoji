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

internal object ObjectsCategoryChunk1 {
  internal val EMOJIS: List<IosEmoji> = listOf(
    IosEmoji(CodePoints.toString(0x1F4FA), listOf("tv"), 29, 49),
    IosEmoji(CodePoints.toString(0x1F4F7), listOf("camera"), 29, 46),
    IosEmoji(CodePoints.toString(0x1F4F8), listOf("camera_with_flash"), 29, 47),
    IosEmoji(CodePoints.toString(0x1F4F9), listOf("video_camera"), 29, 48),
    IosEmoji(CodePoints.toString(0x1F4FC), listOf("vhs"), 29, 51),
    IosEmoji(CodePoints.toString(0x1F50D), listOf("mag"), 30, 5),
    IosEmoji(CodePoints.toString(0x1F50E), listOf("mag_right"), 30, 6),
    IosEmoji(
      unicode = CodePoints.toString(0x1F56F),
      shortcodes = listOf("candle"),
      x = 31,
      y = 22,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F56F, 0xFE0F), emptyList(), 31, 22),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4A1), listOf("bulb"), 28, 17),
    IosEmoji(CodePoints.toString(0x1F526), listOf("flashlight"), 30, 30),
    IosEmoji(CodePoints.toString(0x1F3EE), listOf("izakaya_lantern", "lantern"), 10, 35),
    IosEmoji(CodePoints.toString(0x1FA94), listOf("diya_lamp"), 55, 14),
    IosEmoji(CodePoints.toString(0x1F4D4), listOf("notebook_with_decorative_cover"), 29, 11),
    IosEmoji(CodePoints.toString(0x1F4D5), listOf("closed_book"), 29, 12),
    IosEmoji(CodePoints.toString(0x1F4D6), listOf("book", "open_book"), 29, 13),
    IosEmoji(CodePoints.toString(0x1F4D7), listOf("green_book"), 29, 14),
    IosEmoji(CodePoints.toString(0x1F4D8), listOf("blue_book"), 29, 15),
    IosEmoji(CodePoints.toString(0x1F4D9), listOf("orange_book"), 29, 16),
    IosEmoji(CodePoints.toString(0x1F4DA), listOf("books"), 29, 17),
    IosEmoji(CodePoints.toString(0x1F4D3), listOf("notebook"), 29, 10),
    IosEmoji(CodePoints.toString(0x1F4D2), listOf("ledger"), 29, 9),
    IosEmoji(CodePoints.toString(0x1F4C3), listOf("page_with_curl"), 28, 56),
    IosEmoji(CodePoints.toString(0x1F4DC), listOf("scroll"), 29, 19),
    IosEmoji(CodePoints.toString(0x1F4C4), listOf("page_facing_up"), 28, 57),
    IosEmoji(CodePoints.toString(0x1F4F0), listOf("newspaper"), 29, 39),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5DE),
      shortcodes = listOf("rolled_up_newspaper"),
      x = 32,
      y = 34,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5DE, 0xFE0F), emptyList(), 32, 34),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4D1), listOf("bookmark_tabs"), 29, 8),
    IosEmoji(CodePoints.toString(0x1F516), listOf("bookmark"), 30, 14),
    IosEmoji(
      unicode = CodePoints.toString(0x1F3F7),
      shortcodes = listOf("label"),
      x = 10,
      y = 47,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F3F7, 0xFE0F), emptyList(), 10, 47),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4B0), listOf("moneybag"), 28, 37),
    IosEmoji(CodePoints.toString(0x1FA99), listOf("coin"), 55, 19),
    IosEmoji(CodePoints.toString(0x1F4B4), listOf("yen"), 28, 41),
    IosEmoji(CodePoints.toString(0x1F4B5), listOf("dollar"), 28, 42),
    IosEmoji(CodePoints.toString(0x1F4B6), listOf("euro"), 28, 43),
    IosEmoji(CodePoints.toString(0x1F4B7), listOf("pound"), 28, 44),
    IosEmoji(CodePoints.toString(0x1F4B8), listOf("money_with_wings"), 28, 45),
    IosEmoji(CodePoints.toString(0x1F4B3), listOf("credit_card"), 28, 40),
    IosEmoji(CodePoints.toString(0x1F9FE), listOf("receipt"), 54, 48),
    IosEmoji(CodePoints.toString(0x1F4B9), listOf("chart"), 28, 46),
    IosEmoji(
      unicode = CodePoints.toString(0x2709),
      shortcodes = listOf("email", "envelope"),
      x = 59,
      y = 55,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2709, 0xFE0F), emptyList(), 59, 55),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4E7), listOf("e-mail"), 29, 30),
    IosEmoji(CodePoints.toString(0x1F4E8), listOf("incoming_envelope"), 29, 31),
    IosEmoji(CodePoints.toString(0x1F4E9), listOf("envelope_with_arrow"), 29, 32),
    IosEmoji(CodePoints.toString(0x1F4E4), listOf("outbox_tray"), 29, 27),
    IosEmoji(CodePoints.toString(0x1F4E5), listOf("inbox_tray"), 29, 28),
    IosEmoji(CodePoints.toString(0x1F4E6), listOf("package"), 29, 29),
    IosEmoji(CodePoints.toString(0x1F4EB), listOf("mailbox"), 29, 34),
    IosEmoji(CodePoints.toString(0x1F4EA), listOf("mailbox_closed"), 29, 33),
    IosEmoji(CodePoints.toString(0x1F4EC), listOf("mailbox_with_mail"), 29, 35),
    IosEmoji(CodePoints.toString(0x1F4ED), listOf("mailbox_with_no_mail"), 29, 36),
    IosEmoji(CodePoints.toString(0x1F4EE), listOf("postbox"), 29, 37),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5F3),
      shortcodes = listOf("ballot_box_with_ballot"),
      x = 32,
      y = 39,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5F3, 0xFE0F), emptyList(), 32, 39),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x270F),
      shortcodes = listOf("pencil2"),
      x = 60,
      y = 18,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x270F, 0xFE0F), emptyList(), 60, 18),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x2712),
      shortcodes = listOf("black_nib"),
      x = 60,
      y = 19,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2712, 0xFE0F), emptyList(), 60, 19),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F58B),
      shortcodes = listOf("lower_left_fountain_pen"),
      x = 31,
      y = 61,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F58B, 0xFE0F), emptyList(), 31, 61),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F58A),
      shortcodes = listOf("lower_left_ballpoint_pen"),
      x = 31,
      y = 60,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F58A, 0xFE0F), emptyList(), 31, 60),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F58C),
      shortcodes = listOf("lower_left_paintbrush"),
      x = 32,
      y = 0,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F58C, 0xFE0F), emptyList(), 32, 0),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F58D),
      shortcodes = listOf("lower_left_crayon"),
      x = 32,
      y = 1,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F58D, 0xFE0F), emptyList(), 32, 1),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4DD), listOf("memo", "pencil"), 29, 20),
    IosEmoji(CodePoints.toString(0x1F4BC), listOf("briefcase"), 28, 49),
    IosEmoji(CodePoints.toString(0x1F4C1), listOf("file_folder"), 28, 54),
    IosEmoji(CodePoints.toString(0x1F4C2), listOf("open_file_folder"), 28, 55),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5C2),
      shortcodes = listOf("card_index_dividers"),
      x = 32,
      y = 26,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5C2, 0xFE0F), emptyList(), 32, 26),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4C5), listOf("date"), 28, 58),
    IosEmoji(CodePoints.toString(0x1F4C6), listOf("calendar"), 28, 59),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5D2),
      shortcodes = listOf("spiral_note_pad"),
      x = 32,
      y = 30,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5D2, 0xFE0F), emptyList(), 32, 30),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5D3),
      shortcodes = listOf("spiral_calendar_pad"),
      x = 32,
      y = 31,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5D3, 0xFE0F), emptyList(), 32, 31),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4C7), listOf("card_index"), 28, 60),
    IosEmoji(CodePoints.toString(0x1F4C8), listOf("chart_with_upwards_trend"), 28, 61),
    IosEmoji(CodePoints.toString(0x1F4C9), listOf("chart_with_downwards_trend"), 29, 0),
    IosEmoji(CodePoints.toString(0x1F4CA), listOf("bar_chart"), 29, 1),
    IosEmoji(CodePoints.toString(0x1F4CB), listOf("clipboard"), 29, 2),
    IosEmoji(CodePoints.toString(0x1F4CC), listOf("pushpin"), 29, 3),
    IosEmoji(CodePoints.toString(0x1F4CD), listOf("round_pushpin"), 29, 4),
    IosEmoji(CodePoints.toString(0x1F4CE), listOf("paperclip"), 29, 5),
    IosEmoji(
      unicode = CodePoints.toString(0x1F587),
      shortcodes = listOf("linked_paperclips"),
      x = 31,
      y = 59,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F587, 0xFE0F), emptyList(), 31, 59),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4CF), listOf("straight_ruler"), 29, 6),
    IosEmoji(CodePoints.toString(0x1F4D0), listOf("triangular_ruler"), 29, 7),
    IosEmoji(
      unicode = CodePoints.toString(0x2702),
      shortcodes = listOf("scissors"),
      x = 59,
      y = 52,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2702, 0xFE0F), emptyList(), 59, 52),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5C3),
      shortcodes = listOf("card_file_box"),
      x = 32,
      y = 27,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5C3, 0xFE0F), emptyList(), 32, 27),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5C4),
      shortcodes = listOf("file_cabinet"),
      x = 32,
      y = 28,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5C4, 0xFE0F), emptyList(), 32, 28),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5D1),
      shortcodes = listOf("wastebasket"),
      x = 32,
      y = 29,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5D1, 0xFE0F), emptyList(), 32, 29),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F512), listOf("lock"), 30, 10),
    IosEmoji(CodePoints.toString(0x1F513), listOf("unlock"), 30, 11),
    IosEmoji(CodePoints.toString(0x1F50F), listOf("lock_with_ink_pen"), 30, 7),
    IosEmoji(CodePoints.toString(0x1F510), listOf("closed_lock_with_key"), 30, 8),
    IosEmoji(CodePoints.toString(0x1F511), listOf("key"), 30, 9),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5DD),
      shortcodes = listOf("old_key"),
      x = 32,
      y = 33,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5DD, 0xFE0F), emptyList(), 32, 33),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F528), listOf("hammer"), 30, 32),
    IosEmoji(CodePoints.toString(0x1FA93), listOf("axe"), 55, 13),
    IosEmoji(
      unicode = CodePoints.toString(0x26CF),
      shortcodes = listOf("pick"),
      x = 59,
      y = 17,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x26CF, 0xFE0F), emptyList(), 59, 17),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x2692),
      shortcodes = listOf("hammer_and_pick"),
      x = 58,
      y = 57,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2692, 0xFE0F), emptyList(), 58, 57),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F6E0),
      shortcodes = listOf("hammer_and_wrench"),
      x = 38,
      y = 52,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F6E0, 0xFE0F), emptyList(), 38, 52),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x1F5E1),
      shortcodes = listOf("dagger_knife"),
      x = 32,
      y = 35,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F5E1, 0xFE0F), emptyList(), 32, 35),
      ),
    ),
    IosEmoji(
      unicode = CodePoints.toString(0x2694),
      shortcodes = listOf("crossed_swords"),
      x = 58,
      y = 59,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x2694, 0xFE0F), emptyList(), 58, 59),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1F4A3), listOf("bomb"), 28, 19),
    IosEmoji(CodePoints.toString(0x1FA83), listOf("boomerang"), 55, 4),
    IosEmoji(CodePoints.toString(0x1F3F9), listOf("bow_and_arrow"), 10, 49),
    IosEmoji(
      unicode = CodePoints.toString(0x1F6E1),
      shortcodes = listOf("shield"),
      x = 38,
      y = 53,
      variants = listOf(
        IosEmoji(CodePoints.toString(0x1F6E1, 0xFE0F), emptyList(), 38, 53),
      ),
    ),
    IosEmoji(CodePoints.toString(0x1FA9A), listOf("carpentry_saw"), 55, 20),
  )
}
