package com.makingdevs

import com.amazonaws.AmazonClientException
import com.amazonaws.AmazonServiceException
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.CannedAccessControlList
import com.amazonaws.services.s3.model.PutObjectRequest

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

  def subirImagenPerfil(Long perfilId, file) {
    Perfil perfil = Perfil.get(perfilId)

    AmazonS3 s3client = new AmazonS3Client(new BasicAWSCredentials(accessKey, secretKey))
    try {
      s3client.putObject(new PutObjectRequest(bucket, file.name, file).withCannedAcl(CannedAccessControlList.PublicRead));
    } catch (AmazonServiceException asEx){
      throw new FacturaException(asEx.getMessage())
    } catch (AmazonClientException acEx){
      throw new FacturaException(acEx.getMessage())
    }
    url = "${bucket}.${urlS3}/${file.name}"

    perfil.avatar = url
    perfil.save()
    perfil
  }

}
