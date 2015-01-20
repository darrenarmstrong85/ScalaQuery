import scala.swing._

object HelloWorld extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Hello World GUI"
    contents = new Button {
      text = "Click me"
    }
  }
}

object ScalaQuery extends App {
  Console.println("Hello World: " + (args mkString ", "))
  HelloWorld.startup(args)
}