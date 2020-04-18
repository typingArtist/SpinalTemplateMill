// build.sc
import mill._, scalalib._

trait CommonSpinalModule extends ScalaModule {
  def scalaVersion = "2.12.11"

  //def scalaOptions = Seq("-deprecation", "-feature")

  def ivyDeps = Agg(
    ivy"com.github.spinalhdl::spinalhdl-core:1.4.0",
    ivy"com.github.spinalhdl::spinalhdl-lib:1.4.0",
  )
  def scalacPluginIvyDeps = Agg(ivy"com.github.spinalhdl::spinalhdl-idsl-plugin:1.4.0")
}

object mylib extends CommonSpinalModule {
  def mainClass = Some("mylib.MyTopLevelSim")
}
