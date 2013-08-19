grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
  inherits("global") {
  }
  log "warn"
  legacyResolve false
  repositories {
    grailsCentral()
    mavenCentral()
    mavenLocal()
    mavenRepo "http://snapshots.repository.codehaus.org"
    mavenRepo "http://repository.codehaus.org"
    mavenRepo "http://download.java.net/maven/2/"
    mavenRepo "http://repository.jboss.com/maven2/"
  }
  dependencies {
    test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
  }

  plugins {
    build(":tomcat:$grailsVersion",
      ":release:2.2.1",
      ":rest-client-builder:1.0.3") {
      export = false
    }
    test(":spock:0.7") {
      exclude "spock-grails-support"
    }
  }
}