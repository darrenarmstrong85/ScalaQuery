import scala.swing._

class HelloWorld extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Hello World GUI"
    contents = new Button {
      text = "Click me"
    }
  }
}

object ScalaQuery extends App {
  Console.println("Hello World: " + (args mkString ", "))
  val h = new HelloWorld()
  h.startup(args)
}