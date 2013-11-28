package com.makingdevs

import org.grails.s3.S3Asset

class PerfilService {

  def registrar(Perfil perfil) {
    perfil.save()
  }

  def actualizarPasswordForUser(String nuevaContrasenia, def usuario) {
    usuario.password = nuevaContrasenia
    usuario.save(flush:true)
    usuario
  }

  def obtenerPerfilDeUsuario(def perfilId) {
    Perfil.findById(perfilId)
  }

  def subirImagenPerfil(Long perfilId, file){
    S3Asset receipt =new S3Asset()
    Perfil perfil=Perfil.get(perfilId)
    def temp = s3AssetService.getNewTmpLocalFile(file.contentType)
    file.transferTo(tmp)
    receipt.newFile(tmp)
    receipt.mimeType=file.contentType
    s3AssetService.put(receipt)
    perfil.avatar=receipt
    perfil.save()
    perfil
  }

}