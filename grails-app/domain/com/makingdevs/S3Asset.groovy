package com.makingdevs

class S3Asset {

  String bucket
  Long bytesPerSecond
  Long bytesTransfered
  String description
  String hostName
  String awsKey
  Date lastModified
  Long length
  String localPath
  String localUrl
  String mimeType
  BigDecimal percentTransferred
  String protocol
  String awsStatus
  String title

  static constraints = {
    bytesPerSecond nullable:true
    bytesTransfered nullable:true
    description nullable:true
    hostName nullable:true
    lastModified nullable:true
    length nullable:true
    localPath nullable:true
    percentTransferred nullable:true
    title nullable:true
  }

}
