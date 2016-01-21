lazy val bootlogFlatDemo = (project in file("."))
  .enablePlugins(BootLogPlugin)
  .settings(
    // customize assets, the 2nd parameter equals (baseDirectory.value / relativeFilePath)
    assetResourceMapping ++= Seq(
      // you can use bower to download the assets
      // ("stylesheets/prism.css" -> "bower_components/prism/themes/prism-coy.css"),
      // ("js/prism.js" -> "bower_components/prism/prism.js"),
      ("stylesheets/prism.css" -> "assets/css/prism-coy.css"),
      ("js/prism.js" -> "assets/js/prism.js"),
      ("js/app.js" -> "assets/js/app.js")
    )
  )

site.settings

// KEEP This, or else fonts/rss file will not be copied by sbt-ghpages
includeFilter in SiteKeys.makeSite := "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.swf" | "*.ttf" | "*.woff" | "*.woff2" | "*.xml"

ghpages.settings

git.remoteRepo := "https://github.com/jasonqu/bootlogFlatDemo.git"
