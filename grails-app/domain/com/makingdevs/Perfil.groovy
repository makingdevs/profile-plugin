package com.makingdevs

class Perfil {

  String nombre
  String apellidoPaterno
  String apellidoMaterno
  Date fechaDeNacimiento
  Sexo sexo = Sexo.QUIMERA
  S3Asset avatar
  Boolean publicProfile = false

  static searchable = {
    root false
  }

  static hasMany = [direccion: Direccion, telefonos: Telefono]

  Date dateCreated
  Date lastUpdated

  static constraints = {
    nombre size:1..50,blank:false
    apellidoPaterno size:1..50,blank:false
    apellidoMaterno size:1..50,blank:true,nullable:true
    fechaDeNacimiento nullable:true
    publicProfile blank:false,nullable:false
    avatar nullable:true
  }

  String nombreCompleto() {
    "$nombre $apellidoPaterno ${apellidoMaterno ?: ''}"
  }
}
