// scalac: -Xfatal-warnings
object Test {
  import pack._
  Foo.okay().size()
  Foo.wrong().size()
}
