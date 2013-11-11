class ProfileGrailsPlugin {
  def groupId = "com.makingdevs"
  def version = "0.1.4"
  def grailsVersion = "2.0 > *"
  //def dependsOn = ["spring-security-core":"1.2.7.0 > 1.2.7.4" ]
  def pluginExcludes = [
    "grails-app/views/error.gsp"
  ]

  def author = "MakingDevs"
  def authorEmail = "info@makingdevs.com"
  def description = '''\
  This plugin is intended to externalize behavior and features to manage the profile for each user using Spring Security
  '''
  def documentation = "https://github.com/makingdevs/profile-plugin"
  def license = "APACHE"
  def organization = [ name: "MakingDevs", url: "http://makingdevs.com/" ]
  def developers = [ 
    [ name: "Sergio Rodríguez", email: "sergio@makingdevs.com" ],
    [ name: "Felipe Juárez", email: "felipe@makingdevs.com" ],
    [ name: "Rodrigo Martínez", email: "rockdrigo.mtz@gmail.com" ],
    [ name: "José Juan Reyes", email: "juan@makingdevs.com" ]
  ]

  def issueManagement = [ system: "GITHUB", url: "https://github.com/makingdevs/profile-plugin/issues" ]

  def scm = [ url: "https://github.com/makingdevs/profile-plugin" ]

  def doWithWebDescriptor = { xml -> }

  def doWithSpring = { }

  def doWithDynamicMethods = { ctx -> }

  def doWithApplicationContext = { applicationContext -> }

  def onChange = { event -> }

  def onConfigChange = { event -> }

  def onShutdown = { event -> }
}
