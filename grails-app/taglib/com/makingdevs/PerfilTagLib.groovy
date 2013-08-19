package com.makingdevs

class PerfilTagLib {

  def springSecurityService

  static namespace = 'perfil'

  def saludo = { attrs, body ->

    def usuarioActual = springSecurityService.currentUser
    out << render(plugin:"profile",template:"/taglibTemplates/list",model:[telefonos:usuarioActual.perfil.telefonos])
  }

}
