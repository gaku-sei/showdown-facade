package github.gakusei

import org.scalatest._

class ShowdownTest extends FlatSpec with Matchers {
  "Showdown" should "have default options" in {
    val defaultOptions = Showdown.defaultOptions
    
    defaultOptions should not be a [Unit]
  }

  "Showdown" should "allow to read global options" in {
    Showdown("omitExtraWLInCodeBlocks") shouldBe a [java.lang.Boolean]
    Showdown("ghMentionsLink") shouldBe a [String]
  }

  "Showdown" should "allow to write global options" in {
    Showdown("omitExtraWLInCodeBlocks") = true
    Showdown("omitExtraWLInCodeBlocks").asInstanceOf[Boolean] should equal (true)
    Showdown("omitExtraWLInCodeBlocks") = false
    Showdown("omitExtraWLInCodeBlocks").asInstanceOf[Boolean] should equal (false)
  }

  "Converter" should "convert to HTML" in {
    val converter = new Showdown.Converter()

    converter html "# Coucou!" should equal ("""<h1 id="coucou">Coucou!</h1>""")
  }

  "Converter" should "allow to read local options" in {
    val converter = new Showdown.Converter(new Showdown.Options {
      override val omitExtraWLInCodeBlocks = true
    })

    converter("omitExtraWLInCodeBlocks") shouldBe a [java.lang.Boolean]
  }

  "Converter" should "allow to write local options" in {
    val converter = new Showdown.Converter()

    converter("omitExtraWLInCodeBlocks") = true
    converter("omitExtraWLInCodeBlocks").asInstanceOf[Boolean] should equal (true)
    converter("omitExtraWLInCodeBlocks") = false
    converter("omitExtraWLInCodeBlocks").asInstanceOf[Boolean] should equal (false)
  }
}
