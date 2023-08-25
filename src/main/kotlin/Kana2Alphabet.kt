fun kana2alphabet(target: String): String =
  if (target.length == 1) {
    "$target "
  } else {
    target
  }.let { checkWord ->
    when (checkWord.substring(0, 2)) {
      "ジャ", "ジュ", "ジョ" -> "J"
      else -> when (val word = checkWord.substring(0, 1)) {
        "ア" -> "A"
        "イ" -> "I"
        "ウ" -> "U"
        "エ" -> "E"
        "オ" -> "O"
        "ジ" -> "J"
        "チ" -> "C"
        "カ", "キ", "ク", "ケ", "コ" -> "K"
        "ガ", "ギ", "グ", "ゲ", "ゴ" -> "G"
        "サ", "シ", "ス", "セ", "ソ" -> "S"
        "ザ", "ズ", "ゼ", "ゾ" -> "Z"
        "タ", "ツ", "テ", "ト" -> "T"
        "ダ", "ヂ", "ヅ", "デ", "ド" -> "D"
        "ナ", "ニ", "ヌ", "ネ", "ノ" -> "N"
        "ハ", "ヒ", "フ", "ヘ", "ホ" -> "H"
        "バ", "ビ", "ブ", "ベ", "ボ" -> "B"
        "パ", "ピ", "プ", "ペ", "ポ" -> "P"
        "マ", "ミ", "ム", "メ", "モ" -> "M"
        "ヤ", "ユ", "ヨ" -> "Y"
        "ラ", "リ", "ル", "レ", "ロ" -> "R"
        "ワ" -> "W"
        else -> word
      }
    }
  }