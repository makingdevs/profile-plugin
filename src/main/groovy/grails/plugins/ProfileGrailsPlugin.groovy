package grails.plugins.profile

import grails.plugins.*

class ProfileGrailsPlugin extends Plugin {
  def groupId = "com.makingdevs"
  def grailsVersion = "3.1.8 > *"
  //def dependsOn = ["spring-security-core":"1.2.7.0 > 1.2.7.4" ]
  def pluginExcludes = [
    "grails-app/views/error.gsp"
  ]

  def author = "MakingDevs"
  def authorEmail = "info@makingdevs.com"
  /*def description = '''\
  This plugin is intended to externalize behavior and features to manage the profile for each user using Spring Security
  '''*/
  def profiles = ['web']

  def documentation = "https://github.com/makingdevs/profile-plugin"
  def license = "APACHE"
  def organization = [ name: "MakingDevs", url: "http://makingdevs.com/" ]
  /*def developers = [
    [ name: "Sergio Rodríguez", email: "sergio@makingdevs.com" ],
    [ name: "Felipe Juárez", email: "felipe@makingdevs.com" ],
    [ name: "Rodrigo Martínez", email: "rockdrigo.mtz@gmail.com" ],
    [ name: "José Juan Reyes", email: "juan@makingdevs.com" ]
  ]*/

  def issueManagement = [ system: "GITHUB", url: "https://github.com/makingdevs/profile-plugin/issues" ]

  def scm = [ url: "https://github.com/makingdevs/profile-plugin" ]

  Closure doWithSpring() { {->
    // TODO Implement runtime spring config (optional)
  }
  }

  void doWithDynamicMethods() {
    // TODO Implement registering dynamic methods to classes (optional)
  }

  void doWithApplicationContext() {
    // TODO Implement post initialization spring config (optional)
  }

  void onChange(Map<String, Object> event) {
    // TODO Implement code that is executed when any artefact that this plugin is
    // watching is modified and reloaded. The event contains: event.source,
    // event.application, event.manager, event.ctx, and event.plugin.
  }

  void onConfigChange(Map<String, Object> event) {
    // TODO Implement code that is executed when the project configuration changes.
    // The event is the same as for 'onChange'.
  }

  void onShutdown(Map<String, Object> event) {
    // TODO Implement code that is executed when the application shuts down (optional)
  }

}
