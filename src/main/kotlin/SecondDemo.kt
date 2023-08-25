import com.atilika.kuromoji.ipadic.Tokenizer

fun main(args: Array<String>) =
  Tokenizer().tokenize(args[0]).forEach {
    println("${kana2alphabet(it.reading)} -> ${it.allFeatures}")
  }