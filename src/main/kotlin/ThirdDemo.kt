import com.atilika.kuromoji.ipadic.Tokenizer

fun main(args: Array<String>) =
  Tokenizer().tokenize(args[0]).forEach {
    if (!listOf("助詞", "助動詞", "記号").contains(it.partOfSpeechLevel1)) {
      println("${kana2alphabet(it.reading)} -> ${it.allFeatures}")
    }
  }
