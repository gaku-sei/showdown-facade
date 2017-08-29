package github.gakusei

import scala.scalajs.js
import js.{Object, UndefOr, |, native, undefined}
import js.annotation.{JSExportTopLevel, JSImport, JSName, ScalaJSDefined}
import js.Dynamic.global

@native
@JSImport("showdown", JSImport.Namespace)
object Showdown extends Object {
  @native
  @JSName("getDefaultOptions")
  def defaultOptions(): Options = native

  @native
  @JSName("getOption")
  def apply(key: String): js.Any = native

  @native
  @JSName("setOption")
  def update(key: String, value: js.Any): Unit = native

  @ScalaJSDefined
  trait Options extends Object {
    val extensions: UndefOr[js.Array[String]] = undefined

    val omitExtraWLInCodeBlocks: UndefOr[Boolean] = undefined
    val noHeaderId: UndefOr[Boolean] = undefined
    val customizedHeaderId: UndefOr[Boolean] = undefined
    val ghCompatibleHeaderId: UndefOr[Boolean] = undefined
    val prefixHeaderId: UndefOr[String | Boolean] = undefined
    val rawPrefixHeaderId: UndefOr[Boolean] = undefined
    val rawHeaderId: UndefOr[Boolean] = undefined
    val parseImgDimensions: UndefOr[Boolean] = undefined
    val headerLevelStart: UndefOr[Int] = undefined
    val simplifiedAutoLink: UndefOr[Boolean] = undefined
    val excludeTrailingPunctuationFromURLs: UndefOr[Boolean] = undefined
    val literalMidWordUnderscores: UndefOr[Boolean] = undefined
    val literalMidWordAsterisks: UndefOr[Boolean] = undefined
    val strikethrough: UndefOr[Boolean] = undefined
    val tables: UndefOr[Boolean] = undefined
    val tablesHeaderId: UndefOr[Boolean] = undefined
    val ghCodeBlocks: UndefOr[Boolean] = undefined
    val tasklists: UndefOr[Boolean] = undefined
    val smoothLivePreview: UndefOr[Boolean] = undefined
    val smartIndentationFix: UndefOr[Boolean] = undefined
    val disableForced4SpacesIndentedSublists: UndefOr[Boolean] = undefined
    val simpleLineBreaks: UndefOr[Boolean] = undefined
    val requireSpaceBeforeHeadingText: UndefOr[Boolean] = undefined
    val ghMentions: UndefOr[Boolean] = undefined
    val ghMentionsLink: UndefOr[String] = undefined
    val encodeEmails: UndefOr[Boolean] = undefined
    val openLinksInNewWindow: UndefOr[Boolean] = undefined
    val backslashEscapesHTMLTags: UndefOr[Boolean] = undefined
  }

  @native
  class Converter(options: UndefOr[Options]) extends Object {
    def this() = this(undefined)

    @JSName("makeHtml")
    def html(md: String): String = native

    @JSName("setOption")
    def update(key: String, value: js.Any): Unit = native

    @JSName("getOption")
    def apply(key: String): js.Any = native

    @JSName("getOptions")
    def options(): Options = native

    def setFlavor(name: String): Unit = native

    def getFlavor(): String = native
  }
}
