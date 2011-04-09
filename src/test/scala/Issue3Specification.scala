import org.specs._
import org.specs.runner._

package mustache {
object Issue3Specification extends SpecificationWithJUnit {

  "mustache" should {

    "dive into Some[T] when rendering section token" in {
      new Mustache(
        "{{#foo}}{{value}}{{/foo}}"
      ).render(Map(
        "foo" -> Some(Map("value"->"bar"))
      )).toString must be equalTo("bar")
    }

    "proporly handle Some[T] when rendering inverse section token" in {
      new Mustache(
        "{{^foo}}this string should't be rendered{{/foo}}"
      ).render(Map(
        "foo" -> Some(Map("value"->"bar"))
      )).toString must be equalTo("")
    }

    "properly handle None[T] when rendering section token" in {
      new Mustache(
        "{{#foo}}this string shouldn't be rendered{{/foo}}"
      ).render(Map(
        "foo" -> None
      )).toString must be equalTo("")
    }

    "properly handle None[T] when rendering inverse section token" in {
      new Mustache(
        "{{^foo}}42{{/foo}}"
      ).render(Map(
        "foo" -> None
      )).toString must be equalTo("42")
    }

  }

}
}


