// build.sc
import mill._, scalalib._, publish._

trait CommonSpinalModule extends ScalaModule {
  def scalaVersion = "2.12.11"

  def scalacOptions = Seq("-unchecked", "-deprecation", "-feature")

  def ivyDeps = Agg(
    ivy"com.github.spinalhdl::spinalhdl-core:1.4.0",
    ivy"com.github.spinalhdl::spinalhdl-lib:1.4.0",
  )
  def scalacPluginIvyDeps = Agg(ivy"com.github.spinalhdl::spinalhdl-idsl-plugin:1.4.0")
}

object simple extends CommonSpinalModule with PublishModule {
  def mainClass = Some("mylib.MyTopLevelSim")
  def publishVersion = "0.0.1-SNAPSHOT"

  def pomSettings = PomSettings(
    description = "Simple SpinalHDL Module",
    organization = "com.github.typingArtist",
    url = "https://github.com/typingArtist/SpinalTemplateMill",
    licenses = Seq(License.`LGPL-3.0-or-later`),
    versionControl = VersionControl.github("typingArtist", "SpinalTemplateMill"),
    developers = Seq(
      Developer("typingArtist", "Matthias Wächter", "https://github.com/typingArtist"),
      Developer("Dolu1990", "Dolu1990", "none")
    )
  )
}
