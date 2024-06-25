package com.vanniktech.emoji

import de.cketti.codepoints.CodePoints

val emojiBalloon = TestEmoji(
  unicode = CodePoints.toString(0x1F388),
  shortcodes = listOf("balloon"),
)

val emojiYoYo = TestEmoji(
  unicode = CodePoints.toString(0x1FA80),
  shortcodes = listOf("yo-yo"),
)

val emojiReminderRibbon = TestEmoji(
  unicode = CodePoints.toString(0x1F397),
  shortcodes = listOf("reminder_ribbon"),
  variants = listOf(
    TestEmoji(CodePoints.toString(0x1F397, 0xFE0F), emptyList()),
  ),
)

val emojiBaldPerson = TestEmoji(
  unicode = CodePoints.toString(0x1F9D1, 0x200D, 0x1F9B2),
  shortcodes = listOf("bald_person"),
  variants = listOf(
    TestEmoji(CodePoints.toString(0x1F9D1, 0x1F3FB, 0x200D, 0x1F9B2), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9D1, 0x1F3FC, 0x200D, 0x1F9B2), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9D1, 0x1F3FD, 0x200D, 0x1F9B2), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9D1, 0x1F3FE, 0x200D, 0x1F9B2), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9D1, 0x1F3FF, 0x200D, 0x1F9B2), emptyList()),
  ),
)

val emojiSuperhero = TestEmoji(
  unicode = CodePoints.toString(0x1F9B8),
  shortcodes = listOf("superhero"),
  variants = listOf(
    TestEmoji(CodePoints.toString(0x1F9B8, 0x1F3FB), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9B8, 0x1F3FC), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9B8, 0x1F3FD), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9B8, 0x1F3FE), emptyList()),
    TestEmoji(CodePoints.toString(0x1F9B8, 0x1F3FF), emptyList()),
  ),
)

data class TestEmoji internal constructor(
  override val unicode: String,
  override val shortcodes: List<String>,
  override val variants: List<TestEmoji> = emptyList(),
  private var parent: TestEmoji? = null,
) : Emoji {
  override val base by lazy(LazyThreadSafetyMode.NONE) {
    var result = this
    while (result.parent != null) {
      result = result.parent!!
    }
    result
  }

  init {
    for (variant in variants) {
      variant.parent = this
    }
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other == null || this::class != other::class) return false

    other as TestEmoji

    if (unicode != other.unicode) return false
    if (shortcodes != other.shortcodes) return false
    if (variants != other.variants) return false

    return true
  }

  override fun hashCode(): Int {
    var result = unicode.hashCode()
    result = 31 * result + shortcodes.hashCode()
    result = 31 * result + variants.hashCode()
    return result
  }

  override fun toString() = "TestEmoji(unicode='$unicode', shortcodes=$shortcodes, variants=$variants)"
}
