val snapshot = true

allprojects {
  var ver = "1.14.0"
  val release = findProperty("otel.release")
  if (release != null) {
    ver += "-" + release
  }
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}
