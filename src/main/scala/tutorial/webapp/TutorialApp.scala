package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main: Unit = {
    jQuery(setupUI _)
  }

  def appendPar(text: String): Unit = {
    jQuery("body").append(s"<p>$text</p>")
  }


  def addClickedMessage(): Unit = {
    appendPar("You clicked the button!")
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }
}

